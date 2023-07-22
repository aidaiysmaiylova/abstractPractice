public abstract class BankAbstract {
    private int balance;

    public BankAbstract(int balance) {
        this.balance = balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "balance: " + balance;
    }

    public abstract void getBalance(int i);


}
