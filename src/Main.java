import com.bankingsystem.user.UserAcccount;
import com.bankingsystem.balance.CheckingAccount;
import com.bankingsystem.balance.SavingAccount;
public class Main {
    public static void main(String[] args){
        CheckingAccount checkingAccount = new CheckingAccount(100f);
        SavingAccount savingAccount = new SavingAccount(1200f, 0.04f);
        UserAcccount user = new UserAcccount(checkingAccount, savingAccount);
    }
}
