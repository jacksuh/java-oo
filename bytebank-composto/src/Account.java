public class Account {

    private double balance;
    private int agency;
    private int number;
    private Client holder;

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

    public Client getHolder() {
        return holder;
    }

    public void setHolder(Client holder) {
        this.holder = holder;
    }

    public Account( int agency, int number) {
        this.agency = agency;
        this.number = number;
        System.out.println("estou criando uma conta: " + this.number);
    }
}
