import java.awt.*;
import javax.swing.*;
public class CalculatorOneGUI {
    private final JFrame fr;
    private final JPanel panel;
    private final JTextField num1;
    private final JTextField num2;
    private final JButton plus;
    private final JButton minus;
    private final JButton mul;
    private final JButton div;
    private final JTextField res;
    public CalculatorOneGUI() {
        
        fr = new JFrame("เครื่องคิดเลข");
        num1 = new JTextField();
        num2 = new JTextField();
        panel = new JPanel(new FlowLayout());
        plus = new JButton("Plus");
        minus = new JButton("MINUS");
        mul = new JButton("MULTIPLY");
        div = new JButton("DIVIDE");
        res = new JTextField();
        
        fr.add(num1);
        fr.add(num2);
        
        panel.add(plus);
        panel.add(minus);
        panel.add(mul);
        panel.add(div);
        
        fr.add(panel);
        res.setEditable(false);
        fr.add(res);
        fr.setLayout(new GridLayout(4, 1));
        fr.setSize(450, 170);
        fr.setResizable(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
}
