public class TestBank {
    public static void main(String[] args) {
        Client jackson = new Client();
        jackson.setNome("Jackson");
        jackson.setCpf("123.455.678.90");
        jackson.setProfissao("Developer");


        Account  accountJackson = new Account();
        accountJackson.deposit(100);

        accountJackson.setHolder(jackson);
        System.out.println(accountJackson.getHolder().getNome());
    }
}
