package Lab09_02;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CalculatorSample implements ActionListener {

    private final JFrame fr;
    private final JPanel p;
    private final JTextField num;
    private final JButton one, two, three, four, five, six, seven, eight, nine, zero, c, plus, minus, mul, div, equal;
    private String oper;
    private double previous_num, result;

    public CalculatorSample() {
        this.oper = null;
        this.previous_num = 0;
        this.result = 0;
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
        p.add(seven);
        p.add(eight);
        p.add(nine);
        p.add(plus);
        p.add(four);
        p.add(five);
        p.add(six);
        p.add(minus);
        p.add(one);
        p.add(two);
        p.add(three);
        p.add(mul);
        p.add(zero);
        p.add(c);
        p.add(equal);
        p.add(div);
        fr.add(num, BorderLayout.NORTH);
        fr.add(p);
        fr.setSize(300, 300);
        fr.setResizable(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);

        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        seven.addActionListener(this);
        eight.addActionListener(this);
        nine.addActionListener(this);
        zero.addActionListener(this);
        c.addActionListener(this);
        plus.addActionListener(this);
        minus.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        equal.addActionListener(this);

    }

    public void setPreNum(double num) {
        previous_num = num;
    }

    public double getPreNum() {
        return previous_num;
    }

    public void setResult(double num) {
        result = num;
    }

    public double getResult() {
        return result;
    }

    public void setOper(String oper) {
        this.oper = oper;
    }

    public String getOper() {
        return oper;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(one)) {
            Check("1");
        } else if (e.getSource().equals(two)) {
            Check("2");
        } else if (e.getSource().equals(three)) {
            Check("3");
        } else if (e.getSource().equals(four)) {
            Check("4");
        } else if (e.getSource().equals(five)) {
            Check("5");
        } else if (e.getSource().equals(six)) {
            Check("6");
        } else if (e.getSource().equals(seven)) {
            Check("7");
        } else if (e.getSource().equals(eight)) {
            Check("8");
        } else if (e.getSource().equals(nine)) {
            Check("9");
        } else if (e.getSource().equals(zero)) {
            Check("0");
        } else if (e.getSource().equals(c)) {
            num.setText("");
            setPreNum(0);
            setOper(null);
        } else if (e.getSource().equals(plus)) {
            Perform("plus");
            num.setText("");
        } else if (e.getSource().equals(minus)) {
            Perform("minus");
            num.setText("");
        } else if (e.getSource().equals(mul)) {
            Perform("mul");
            num.setText("");
        } else if (e.getSource().equals(div)) {
            Perform("div");
            num.setText("");
        } else if (e.getSource().equals(equal)) {
            Calculate();
            num.setText(String.valueOf(getPreNum()));
            setResult(getPreNum());
            setPreNum(0);
            setOper(null);
        }
    }

    public void Calculate() {
        switch (getOper()) {
            case "plus":
                setPreNum(getPreNum() + Double.parseDouble(num.getText()));
                break;
            case "minus":
                setPreNum(getPreNum() - Double.parseDouble(num.getText()));
                break;
            case "mul":
                setPreNum(getPreNum() * Double.parseDouble(num.getText()));
                break;
            case "div":
                setPreNum(getPreNum() / Double.parseDouble(num.getText()));
                break;
        }
    }

    public void Perform(String oper) {
        if (getOper() == null) {
            setPreNum(Double.parseDouble(num.getText()));
        } else {
            Calculate();
        }
        num.setText("");
        setOper(oper);
    }

    public void Check(String number) {
        if (getOper() == null && num.getText().equals(String.valueOf(getResult()))) {
            num.setText(number);
        } else {
            num.setText(num.getText() + number);
        }
    }
}
