import User.BankAccount;
import Balance.CheckingAccount;
import Balance.SavingAccount;
public class Main {
    public static void main(String[] args){
        CheckingAccount checkingAccount = new CheckingAccount(100f);
        SavingAccount savingAccount = new SavingAccount(1200f, 0.04f);
        BankAccount user = new BankAccount(checkingAccount, savingAccount);
    }
}
