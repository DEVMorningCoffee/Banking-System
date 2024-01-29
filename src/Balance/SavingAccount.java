package Balance;
import Balance.BasicAccount;

import java.text.DecimalFormat;

public class SavingAccount extends BasicAccount {
    private final float interestRate;
    public SavingAccount(float startAmount, float interestRate) {
        super(startAmount);
        this.setBalance(startAmount);
        this.interestRate = interestRate;
    }

    public float calulateInterest(){
        return getBalance() * this.interestRate;
    }

}
