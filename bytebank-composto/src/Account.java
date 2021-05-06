public class Account {

    double balance;
    int agency;
    int number;
    Client holder;

    public void deposit(double value){
        this.balance = this.balance + value;
    }

    public boolean withdraw(double value){
        if(this.balance >= value){
            this.balance = this.balance - value;
            return true;
        }else{
            return false;
        }
    }

    public boolean transfer(double value, Account destiny){
        if(this.balance >= value){
            this.balance -= value;
            destiny.deposit(value);
            return true;
        }
        return false;
    }

}
