public class TestBank {
    public static void main(String[] args) {
        Client jackson = new Client();
        jackson.setNome("Jackson");
        jackson.setCpf("123.455.678.90");
        jackson.setProfissao("Developer");

        //constructor
        Account  accountJackson = new CurrentAccount(123, 456);
        accountJackson.deposit(100);

        Account account2 = new CurrentAccount(1337, 16549);
        Account account3 = new SavingsAccount(2112, 14660);

        System.out.println(accountJackson.getTotal());

        accountJackson.setHolder(jackson);
        System.out.println(accountJackson.getHolder().getNome());
    }
}
