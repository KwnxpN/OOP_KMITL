package Lab11_2;

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
    public void withdraw(double a) throws WithdrawException {
        if (a < 0) {
            throw new WithdrawException("Input must be a positive number.");
        }

        if (getBalance() >= a) {
            setBalance(getBalance() - a);
            System.out.println(a + " baht is withdrawn from " + getName() + " and your credit balance is " + getCredit() + ".");
        } else if ((getBalance() + getCredit()) >= a) {
            double remainingAmount = a - getBalance();
            setBalance(0);
            setCredit(getCredit() - remainingAmount);
            System.out.println(a + " baht is withdrawn from " + getName() + " and your credit balance is " + getCredit() + ".");
        } else {
            throw new WithdrawException("Account " + getName() + " has not enough money");
        }
    }

    public void withdraw(String a) throws WithdrawException {
        double d = Double.parseDouble(a);
        this.withdraw(d);
    }

    @Override
    public String toString() {
        return "The " + getName() + " account has " + getBalance() + " baht and " + getCredit() + " credits";
    }
}
