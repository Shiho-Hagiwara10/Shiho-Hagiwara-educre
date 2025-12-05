public class BankAccount {
    int balance;

    public int getBalance() {
        return balance;  
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public boolean withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;   
        } else {
            return false;  
        }
    }
}
