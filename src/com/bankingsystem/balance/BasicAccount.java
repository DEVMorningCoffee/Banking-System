package com.bankingsystem.balance;

import java.text.DecimalFormat;

public class BasicAccount {
    private float balance = 0f;

    public BasicAccount(float startAmount) {
    }

    protected void setBalance(float setAmount){
        this.balance = formatBalance(setAmount);
    }

    private static float formatBalance(float amount){
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        String formatAmount =  decimalFormat.format(amount);
        return Float.parseFloat(formatAmount);
    }

    public float getBalance(){
        return formatBalance(this.balance);
    }

    public void depositBalance(float amount){
        amount = formatBalance(amount);
        this.balance += amount;
    }
}
