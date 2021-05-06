import java.awt.*;

public class Reference {

    public static void main(String[] args) {
        Account firstAccount = new Account();
        firstAccount.setBalance(300);

        System.out.println("First Account: " + firstAccount.getBalance());

        Account secondAccount = firstAccount;

        System.out.println("Second Account: " + secondAccount.getBalance());

        secondAccount.setBalance(100);

        System.out.println(firstAccount.getBalance());

        if(firstAccount == secondAccount){
            System.out.println("It's the same account");
        }

    }
}

