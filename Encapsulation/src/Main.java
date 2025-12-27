//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BankAccount newAccount = new BankAccount();
        System.out.println(newAccount.getBalance());
        newAccount.deposit(10000);
       System.out.println( newAccount.getBalance());
       newAccount.withdraw(500);
        System.out.println( newAccount.getBalance());
    }
}