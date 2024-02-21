public class Bank {
    private Account acc[];
    private int numAcct;
    public Bank() {
        acc = new Account[10];
        numAcct = 0;
    }
    public void addAccount(Account ac) {
            acc[numAcct] = ac;
            numAcct += 1;
    }
    public Account getAccount(int index) {
        return acc[index];
    }
    public int getNumAccount() {
        return numAcct;
    }
}
