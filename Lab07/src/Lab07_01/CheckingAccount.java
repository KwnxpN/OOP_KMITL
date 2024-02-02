package Lab07_01;


import Lab07_01.Account;


public class CheckingAccount extends Account {

    private double credit;

    public CheckingAccount() {
        super(0, "");
        credit = 0;
    }

    public CheckingAccount(double balance, String name, double credit) {
        super(balance, name);
        this.credit = credit;
    }

    public void setCredit(double credit) {
        if (credit > 0) {
            this.credit = credit;
        } else {
            System.out.println("Input must be a positive integer.");
        }
    }

    public double getCredit() {
        return credit;
    }

    @Override
    public void withdraw(double a) {
        if (a > 0) {
            if ((getBalance() - a) > 0) {
                if ((a > 0) && (getBalance() - a) > 0) {
                    setBalance(getBalance() - a);
                    System.out.println(a + " baht is withdrawn from " + getName() + " and your credit balance is " + getCredit() +".");
                } else if (a < 0) {
                    System.out.println("Input number must be a positive integer.");
                } else if ((getBalance() - a) < 0) {
                    System.out.println("Not enough money!");
                }
            } else if (((getBalance() - a) < 0) && ((getBalance() + getCredit()) - a) > 0) {
                setBalance(0);
                setCredit(getCredit() + (a - getBalance()));
                System.out.println(a + " baht is withdraw from " + getName() + " and your credit balance is " + getCredit() + ".");
            } else {
                System.out.println("Not enough money!");
            }
        } else {
            System.out.println("Input must be a positive integer.");
        }
    }

    public void withdraw(String a) {
        double d = Double.parseDouble(a);
        this.withdraw(d);
    }

    @Override
    public String toString() {
        return "The " + getName() + " account has " + getBalance() + " baht and " + getCredit() + " credits";
    }
}
