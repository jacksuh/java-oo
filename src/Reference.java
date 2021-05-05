import java.awt.*;

public class Reference {

    public static void main(String[] args) {
        Account firstAccount = new Account();
        firstAccount.balance = 300;

        System.out.println("First Account: " + firstAccount.balance);

        Account secondAccount = firstAccount;

        System.out.println("Second Account: " + secondAccount.balance);

        secondAccount.balance += 100;

        System.out.println(firstAccount.balance);

        if(firstAccount == secondAccount){
            System.out.println("It's the same account");
        }

    }
}

