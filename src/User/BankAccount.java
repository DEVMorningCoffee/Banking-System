package User;

import User.CheckingAccount;
import java.util.Scanner;

public class BankAccount extends CheckingAccount {
    private String owner;
    CheckingAccount checkingAccount = new CheckingAccount();

    public BankAccount(){
        setOwnerName();
    }

    private void setOwnerName(){
        Scanner myObj = new Scanner(System.in);
        System.out.print("Please enter the User name: ");
        this.owner = myObj.nextLine();
    }

    public String getOwnerName(){
        return this.owner;
    }

    public float getOwnerBalance(){
        return checkingAccount.getBalance();
    }

    public float depositOwnerBalance(float amount){
        checkingAccount.depositBalance(amount);
        return checkingAccount.getBalance();
    }
}
