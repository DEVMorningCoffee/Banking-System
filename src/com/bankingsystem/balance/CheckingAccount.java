package com.bankingsystem.balance;

public class CheckingAccount extends BasicAccount{
    public CheckingAccount(float startAmount) {
        super(startAmount);
        this.setBalance(startAmount);
    }
}
