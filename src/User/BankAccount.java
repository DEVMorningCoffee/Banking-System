package User;

import Balance.CheckingAccount;
import Balance.SavingAccount;
import java.util.Scanner;

public class BankAccount{
    private String owner;
    private final CheckingAccount checkingAccount;
    private final SavingAccount savingAccount;

    public BankAccount(CheckingAccount checkingAccount, SavingAccount savingAccount){
        this.checkingAccount = checkingAccount;
        this.savingAccount = savingAccount;
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

    public float getOwnerCheckingBalance(){
        return checkingAccount.getBalance();
    }

    public float getOwnerSavingBalance(){
        return savingAccount.getBalance();
    }

    public float depositOwnerCheckingBalance(float amount){
        checkingAccount.depositBalance(amount);
        return checkingAccount.getBalance();
    }

    public float depositOwnerSavingBalance(float amount){
        savingAccount.depositBalance(amount);
        return savingAccount.getBalance();
    }
}
