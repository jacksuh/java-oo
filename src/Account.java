public class Account {

    private double balance;
    private int agency;
    private int number;
    String holder;

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

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAgency() {
        return agency;
    }

    public void setAgency(int agency) {
        this.agency = agency;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }
}
