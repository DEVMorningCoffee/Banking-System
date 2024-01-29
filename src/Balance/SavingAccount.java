package Balance;
import Balance.BasicAccount;

import java.text.DecimalFormat;

public class SavingAccount extends BasicAccount {
    public SavingAccount(float startAmount) {
        super(startAmount);
        this.setBalance(startAmount);
    }

}
