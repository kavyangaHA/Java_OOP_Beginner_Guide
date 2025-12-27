//1. Encapsulation (The "Capsule")
//Think of a medical capsule. The medicine is inside, protected from the outside environment. In Java, we hide the class variables so they can't be changed directly by mistake.
//
//How to do it:
//Make your variables private.
//
//Provide public Getters and Setters (methods to read/write the data).
public class BankAccount {
    private double balance; //Private! No one can touch this directly.

    //Setter:Allows changing balance with "Rule"

    public void deposit(double amount){
        if(amount>0){
            balance += amount;
        }

    }
    public void withdraw(int amount){
        if(amount>0 & (balance-amount>0)){
            balance -=amount;
        }
    }

    //Getter:Allows viewing the balance
    public double getBalance(){
        return balance;
    }


}
//why are we doing this?
//If the balance was public,anyone can write account.balance = -1000
//but with Encapsulation ,that cannot be done.
