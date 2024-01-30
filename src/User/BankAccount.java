package User;

import Balance.CheckingAccount;
import Balance.SavingAccount;
import java.util.Scanner;
import java.util.UUID;

public class BankAccount{
    private String name;
    private String id;
    private String email;
    private String password;
    private final CheckingAccount checkingAccount;
    private final SavingAccount savingAccount;

    public BankAccount(CheckingAccount checkingAccount, SavingAccount savingAccount){
        this.checkingAccount = checkingAccount;
        this.savingAccount = savingAccount;
        setupUserInfo();
    }

    private void setupUserInfo(){

        Scanner myObj = new Scanner(System.in);
        System.out.print("Name: ");
        this.name = myObj.nextLine();

        System.out.print("email: ");
        this.email = myObj.nextLine();

        System.out.print("Password: ");
        this.password = myObj.nextLine();

        this.id = UUID.randomUUID().toString();
    }

    private void setOwnerName(){
        Scanner myObj = new Scanner(System.in);
        System.out.print("Please enter the User name: ");
        this.name = myObj.nextLine();
    }

    public String getOwnerName(){
        return this.name;
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

    public void depositOwnerSavingInterest(){
        // This will later be implemented to be ever 365days or every minute for this program
        this.savingAccount.calculateInterest();
    }
}
