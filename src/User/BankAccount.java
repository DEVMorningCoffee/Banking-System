package User;

import java.util.Scanner;

public class BankAccount {
    private String owner;

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
}
