public class TestBank {
    public static void main(String[] args) {
        Client jackson = new Client();
        jackson.nome = "Jackson";
        jackson.cpf = "123.455.678.90";
        jackson.profissao = "Developer";


        Account  accountJackson = new Account();
        accountJackson.deposit(100);

        accountJackson.holder = jackson;
        System.out.println(accountJackson.holder.nome);
    }
}
