package Balance;
import Balance.BasicAccount;

import java.text.DecimalFormat;

public class CheckingAccount extends BasicAccount{
    public CheckingAccount(float startAmount) {
        super(startAmount);
        this.setBalance(startAmount);
    }
}
