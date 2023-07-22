public class A extends BankAbstract {
    public A(int balance) {
        super(balance);
    }

    @Override
    public void getBalance(int i) {
        System.out.println(i+"$");
    }

}
