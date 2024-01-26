import User.BankAccount;
public class Main {
    public static void main(String[] args){
        BankAccount user = new BankAccount();

        System.out.println(user.depositOwnerBalance(2000f));
    }
}
