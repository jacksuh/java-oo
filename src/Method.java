public class Method {

    public static void main(String[] args) {

        Account account = new Account();
        account.setBalance(100);
        account.deposit(50);

        System.out.println(account.getBalance());

        account.withdraw(20);
        System.out.println(account.getBalance());


        Account account1 = new Account();
        account1.deposit(1000);

        account1.transfer(300, account);

        System.out.println(account1.getBalance());
        System.out.println(account.getBalance());
    }
}
