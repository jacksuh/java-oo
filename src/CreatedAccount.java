public class CreatedAccount {
    public static void main(String[] args) {
        Account firstAccount = new Account();
        firstAccount.balance = 200;
        System.out.println(firstAccount.balance);

        Account secondAccount = new Account();
        secondAccount.balance = 50;


        System.out.println("Firt Account: " + firstAccount.balance);
        System.out.println("Second Account: "  + secondAccount.balance);

        System.out.println(firstAccount.agency);
        System.out.println(firstAccount.number);

        System.out.println(secondAccount.agency);

        secondAccount.agency = 146;
        System.out.println("Agency second Account: " + secondAccount.agency);

        if(firstAccount == secondAccount){
            System.out.println("It's the same account");
        }else{
            System.out.println("Account is different");
        }
    }
}
