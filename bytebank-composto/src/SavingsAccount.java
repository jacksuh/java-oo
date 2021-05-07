public class SavingsAccount extends Account{


    @Override
    public void deposit(double value) {
        this.balance += value;
    }


    public SavingsAccount(int agency, int number){
        super(agency, number);
    }


}
