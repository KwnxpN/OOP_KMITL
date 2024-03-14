import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ChatDemo implements ActionListener, WindowListener {
    private JFrame fr;
    private JTextArea ta;
    private JTextField tf;
    private JButton submit, reset;
    private JPanel p, pbut;
    public ChatDemo() {
        fr = new JFrame("ChatDemo");
        fr.setLayout(new BorderLayout());
        
        ta = new JTextArea(20, 20);
        ta.setEditable(false);
        
        p = new JPanel(new BorderLayout());
        pbut = new JPanel(new FlowLayout());
        
        tf = new JTextField(45);
        
        submit = new JButton("Submit");
        reset = new JButton("Reset");
        submit.addActionListener(this);
        reset.addActionListener(this);
        
        pbut.add(submit);
        pbut.add(reset);
        
        p.add(tf, BorderLayout.NORTH);
        p.add(pbut, BorderLayout.SOUTH);
        
        fr.add(ta, BorderLayout.NORTH);
        fr.add(p, BorderLayout.SOUTH);
        
        fr.addWindowListener(this);
        fr.setLocation(700, 300);
        fr.setVisible(true);
        fr.setSize(400, 415);
        fr.setResizable(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(submit)) {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            ta.append(dtf.format(LocalDateTime.now()) + " : " + tf.getText()+"\n");
            tf.setText("");
        }
        else if (e.getSource().equals(reset)) {
            ta.setText("");
        }
    }
    
    @Override
    public void windowOpened(WindowEvent we) {
        File f = new File("ChatDemo.dat");
        if (f.exists()) {
            try (FileInputStream fin = new FileInputStream("ChatDemo.dat");
            ObjectInputStream oin = new ObjectInputStream(fin);) {
                this.ta.setText(""+(String) oin.readObject());
            } catch(IOException i) {
                i.printStackTrace();

          } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    @Override
    public void windowClosing(WindowEvent we) {
        try (FileOutputStream fout = new FileOutputStream("ChatDemo.dat");
        ObjectOutputStream oout = new ObjectOutputStream(fout);) {
            oout.writeObject(this.ta.getText());
            System.out.println("Saved!");
        }
        catch(IOException i) {
            i.printStackTrace();
        }
    }

    @Override
    public void windowClosed(WindowEvent e) {}

    @Override
    public void windowIconified(WindowEvent e) {}

    @Override
    public void windowDeiconified(WindowEvent e) {}

    @Override
    public void windowActivated(WindowEvent e) {}

    @Override
    public void windowDeactivated(WindowEvent e) {}

    public static void main(String[] args) {
        new ChatDemo();
    }
}