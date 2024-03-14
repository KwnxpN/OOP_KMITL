import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
public class StudentView {
    private JFrame fr;
    private JLabel idL, nameL, moneyL;
    private JTextField idTF, nameTF, moneyTF;
    private JButton deposit, withdraw;
    private JPanel idP, nameP, moneyP, buttonP;
    public StudentView() {
        fr = new JFrame();
        fr.setLayout(new GridLayout(4, 1));
        
        idP = new JPanel(new GridLayout(1, 2));
        idL = new JLabel("ID : ");
        idTF = new JTextField(8);
        idP.add(idL); idP.add(idTF);
        
        nameP = new JPanel(new GridLayout(1, 2));
        nameL = new JLabel("Name : ");
        nameTF = new JTextField(8);
        nameP.add(nameL); nameP.add(nameTF);
        
        moneyP = new JPanel(new GridLayout(1, 2));
        moneyL = new JLabel("Money : ");
        moneyTF = new JTextField("0");
        moneyTF.setEditable(false);
        moneyP.add(moneyL); moneyP.add(moneyTF);
        
        fr.setSize(250, 250);
        fr.setVisible(true);
        fr.setResizable(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        new StudentView();
    }
}
