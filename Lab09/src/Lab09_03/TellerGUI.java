package Lab09_03;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class TellerGUI implements ActionListener {
    Account acc = new Account();
    private final JFrame fr;
    private final JLabel balance, amount;
    private final JTextField bal, amo;
    private final JPanel p, p_bal, p_amo, p_btn;
    private final JButton depo, with, exit;
    public TellerGUI() {
        fr = new JFrame("Teller GUI");
        fr.setLayout(new GridLayout(2, 1));
        
        balance = new JLabel("  Balance      ");
        amount = new JLabel("  Amount      ");
        p = new JPanel(new GridLayout(2, 1));
        
        bal = new JTextField(String.valueOf(acc.getBalance()), 12);
        bal.setEditable(false);
        amo = new JTextField(12);
        p_bal = new JPanel(new BorderLayout());
        p_bal.add(balance);
        p_bal.add(bal, BorderLayout.EAST);
        
        p_amo = new JPanel(new BorderLayout());
        p_amo.add(amount);
        p_amo.add(amo, BorderLayout.EAST);
        
        p_btn = new JPanel();
        depo = new JButton("Deposit");
        with = new JButton("Withdraw");
        exit = new JButton("Exit");
        p_btn.add(depo);
        p_btn.add(with);
        p_btn.add(exit);
        
        p.add(p_bal);
        p.add(p_amo);
        
        fr.add(p);
        fr.add(p_btn);
        fr.setSize(300, 170);
        fr.setLocation(700, 300);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setResizable(true);
        fr.setVisible(true);
        
        depo.addActionListener(this);
        with.addActionListener(this);
        exit.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == with) {
            if(acc.getBalance() >= Double.parseDouble(amo.getText())) {
                acc.setBalance(acc.getBalance() - Double.parseDouble(amo.getText()));
                bal.setText(String.valueOf(acc.getBalance()));
            }
            amo.setText("");
        }
        else if(e.getSource() == depo) {
            acc.setBalance(acc.getBalance() + Double.parseDouble(amo.getText()));
            bal.setText(String.valueOf(acc.getBalance()));
            amo.setText("");
        }
        else if(e.getSource() == exit) {
            fr.dispose();
        }
    }
}
