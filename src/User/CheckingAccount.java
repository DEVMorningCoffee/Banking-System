package User;

import java.text.DecimalFormat;

public class CheckingAccount {
    private float balance = 1100.99f;

    private void setBalance(float setAmount){
        this.balance = formatBalance(setAmount);
    }

    private static float formatBalance(float amount){
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        String formatAmount =  decimalFormat.format(amount);
        return Float.parseFloat(formatAmount);
    }

    public float getBalance(){
        return this.balance;
    }

    public void depositBalance(float amount){
        amount = formatBalance(amount);
        this.balance += amount;
    }
}
