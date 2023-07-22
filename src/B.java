public class B extends BankAbstract {
    public B(int balance) {
        super(balance);
    }

    @Override
    public void getBalance(int i) {
        System.out.println(200+"$");

    }
}
