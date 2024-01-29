package Balance;

public class SavingAccount extends BasicAccount {
    private final float interestRate;
    public SavingAccount(float startAmount, float interestRate) {
        super(startAmount);
        this.setBalance(startAmount);
        this.interestRate = interestRate;
    }

    public void calculateInterest(){
        float interest = getBalance() * this.interestRate;
        this.depositBalance(interest);
    }
}
