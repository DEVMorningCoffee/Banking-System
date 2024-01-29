import User.BankAccount;
import Balance.CheckingAccount;
import Balance.SavingAccount;
public class Main {
    public static void main(String[] args){
        CheckingAccount checkingAccount = new CheckingAccount(100f);
        SavingAccount savingAccount = new SavingAccount(0);
        BankAccount user = new BankAccount(checkingAccount, savingAccount);

        System.out.println(user.getOwnerSavingBalance());
        System.out.println(user.getOwnerCheckingBalance());
    }
}
