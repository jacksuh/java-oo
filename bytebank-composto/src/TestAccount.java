public class TestAccount {

    public static void main(String[] args) {

        CurrentAccount cc = new CurrentAccount(111,11);
        cc.deposit(100.0);

        SavingsAccount cp = new SavingsAccount(111,11);
        cp.deposit(200.0);

        cc.transfer(10.0, cp);

        System.out.println(cc.getBalance());
        System.out.println(cp.getBalance());
    }

}
