public class CreatedAccount {
    public static void main(String[] args) {
        Account firstAccount = new Account();
        firstAccount.setBalance(200);
        System.out.println(firstAccount.getBalance());

        Account secondAccount = new Account();
        secondAccount.setBalance(50);


        System.out.println("Firt Account: " + firstAccount.getBalance());
        System.out.println("Second Account: "  + secondAccount.getBalance());

        System.out.println(firstAccount.getAgency());
        System.out.println(firstAccount.getNumber());

        System.out.println(secondAccount.getAgency());

        secondAccount.setAgency(146);
        System.out.println("Agency second Account: " + secondAccount.getAgency());

        if(firstAccount == secondAccount){
            System.out.println("It's the same account");
        }else{
            System.out.println("Account is different");
        }
    }
}
