import User.BankAccount;
import User.CheckingAccount;
public class Main {
    public static void main(String[] args){
        CheckingAccount checkingAccount = new CheckingAccount();
        BankAccount user = new BankAccount(checkingAccount);

        System.out.println(user.depositOwnerBalance(2000f));
    }
}
