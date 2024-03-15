import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class StudentView implements ActionListener, WindowListener{
    private JFrame fr;
    private JLabel idL, nameL, moneyL;
    private JTextField idTF, nameTF, moneyTF;
    private JButton deposit, withdraw;
    private JPanel idP, nameP, moneyP, buttonP;
    public StudentView() {
        fr = new JFrame();
        fr.setLayout(new GridLayout(4, 1));
        
        idP = new JPanel(new GridLayout(1, 2));
        idL = new JLabel(" ID : ");
        idTF = new JTextField(8);
        idP.add(idL); idP.add(idTF);
        
        nameP = new JPanel(new GridLayout(1, 2));
        nameL = new JLabel(" Name : ");
        nameTF = new JTextField(8);
        nameP.add(nameL); nameP.add(nameTF);
        
        moneyP = new JPanel(new GridLayout(1, 2));
        moneyL = new JLabel(" Money : ");
        moneyTF = new JTextField("0");
        moneyTF.setEditable(false);
        moneyP.add(moneyL); moneyP.add(moneyTF);
        
        buttonP = new JPanel();
        deposit = new JButton("Deposit");
        withdraw = new JButton("Withdraw");
        
        deposit.addActionListener(this); withdraw.addActionListener(this);
        buttonP.add(deposit); buttonP.add(withdraw);
        
        
        fr.add(idP); fr.add(nameP); fr.add(moneyP); fr.add(buttonP);
        
        fr.addWindowListener(this);
        fr.setSize(250, 200);
        fr.setVisible(true);
        fr.setResizable(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(deposit)) {
            moneyTF.setText(String.valueOf(Integer.parseInt(moneyTF.getText()) + 100));
        }
        else if (e.getSource().equals(withdraw)) {
            moneyTF.setText(String.valueOf(Integer.parseInt(moneyTF.getText()) - 100));
        }
    }
    @Override
    public void windowOpened(WindowEvent e) {
            File f = new File("StudentM.dat");
            if (f.exists()) {
                try (FileInputStream fin = new FileInputStream("StudentM.dat");
                        ObjectInputStream oin = new ObjectInputStream(fin);) {
                    Student s = null;
                    s = (Student) oin.readObject();
                    idTF.setText(String.valueOf(s.getID())); nameTF.setText(String.valueOf(s.getName())); moneyTF.setText(String.valueOf(s.getMoney()));
                } catch (IOException ex) {
                    ex.printStackTrace();
                } catch (ClassNotFoundException ex) {
                    ex.printStackTrace();
                }
            }
        }
    @Override
    public void windowClosing(WindowEvent e) { 
         Student s = new Student();
         s.setName(nameTF.getText()); s.setID(Integer.parseInt(idTF.getText())); s.setMoney(Integer.parseInt(moneyTF.getText()));
            try (FileOutputStream fout = new FileOutputStream("StudentM.dat");
                    ObjectOutputStream oout = new ObjectOutputStream(fout);) {
                oout.writeObject(s);
                System.out.println("Saved!");
            }
            catch (IOException i) {
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
        new StudentView();
    }
}
