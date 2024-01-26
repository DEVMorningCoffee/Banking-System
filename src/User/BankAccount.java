package User;

import java.util.Scanner;

public class BankAccount {
    private static String owner;

    public BankAccount(){
        setOwnerName();
    }

    private static void setOwnerName(){
        Scanner myObj = new Scanner(System.in);
        System.out.print("Please enter the User name: ");
        owner = myObj.nextLine();
    }

    public static String getOwnerName(){
        return owner;
    }
}
