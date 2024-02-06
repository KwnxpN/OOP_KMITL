import java.awt.*;
import javax.swing.*;
public class CalculatorTwoGUI {
    private final JFrame fr;
    private final JPanel p;
    private final JTextField num;
    private final JButton one, two, three, four, five, six, seven, eight, nine, zero, c, plus, minus, mul, div, equal;
    public CalculatorTwoGUI() {
        fr = new JFrame("My Calculator");
        fr.setLayout(new BorderLayout());
        num = new JTextField();
        p = new JPanel(new GridLayout(4, 4));
        one = new JButton("1");
        two = new JButton("2");
        three = new JButton("3");
        four = new JButton("4");
        five = new JButton("5");
        six = new JButton("6");
        seven = new JButton("7");
        eight = new JButton("8");
        nine = new JButton("9");
        zero = new JButton("0");
        c = new JButton("C");
        plus = new JButton("+");
        minus = new JButton("-");
        mul = new JButton("x");
        div = new JButton("/");
        equal = new JButton("=");
        p.add(seven); p.add(eight); p.add(nine); p.add(plus);
        p.add(four); p.add(five); p.add(six); p.add(minus);
        p.add(one); p.add(two); p.add(three); p.add(mul);
        p.add(zero); p.add(c); p.add(equal); p.add(div);
        fr.add(num, BorderLayout.NORTH);
        fr.add(p);
        fr.setSize(300, 300);
        fr.setResizable(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
}
