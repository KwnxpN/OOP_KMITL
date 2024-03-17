import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
public class Text_Editor implements ActionListener {
    private JFrame fr;
    private JMenuBar mb;
    private JMenu file;
    private JMenuItem newf, open, save, close;
    private JTextArea ta;
    
    public Text_Editor() {
        fr = new JFrame("Text Editor");
        
        mb = new JMenuBar();
        file = new JMenu("File");
        
        
        newf = new JMenuItem("New");
        open = new JMenuItem("Open");
        save = new JMenuItem("Save");
        close = new JMenuItem("Close");
        
        file.add(newf);
        file.add(open);
        file.add(save);
        file.addSeparator();
        file.add(close);
        
        mb.add(file);
        fr.setJMenuBar(mb);
        
        ta = new JTextArea(20, 20);
        fr.add(ta);
        
        fr.setVisible(true);
        fr.setResizable(true);
        fr.setSize(800, 400);
        fr.setLocation(500, 300);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
       //Action
       newf.addActionListener(this);
       open.addActionListener(this);
       save.addActionListener(this);
       close.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(newf)) {
            ta.selectAll();
            ta.replaceSelection("");
        }
        else if (e.getSource().equals(close)) {
            System.exit(0);
        }
        else if (e.getSource().equals(open)) {
            JFileChooser fc = new JFileChooser();
            fc.showOpenDialog(fr);
            File f = fc.getSelectedFile();
            try(FileReader fin = new FileReader(f);) {
                 int i;
                 String txtData = "";
                 while ((i = fin.read()) != -1) {
                     txtData += (char)i;
                    }
                 ta.setText(txtData);
                } 
            catch (FileNotFoundException ex) {
                ex.printStackTrace();
               }
            catch (IOException ex) {
            ex.printStackTrace();
                }
            }
        else if (e.getSource().equals(save)) {
           JFileChooser fc = new JFileChooser();
           fc.showSaveDialog(fr);
           File f = fc.getSelectedFile(); 
           try (FileWriter fout = new FileWriter(f);) {
               if (!f.exists()) {
                   f.createNewFile();
               }
               String get = ta.getText();
               fout.write(get);
           }
           catch (IOException ex) {
               ex.printStackTrace();
           }
        }
    }
    
    public static void main(String[] args) {
        new Text_Editor();
    }
}
