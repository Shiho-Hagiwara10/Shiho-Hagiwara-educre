public class Account {
    String accountNumer;
    int balance;

    public Account(String accountNumber) {
        this.accountNumer = accountNumber;
        this.balance = 0;
    }

    public void deposit(int amount) {
        if (amount <= 0) {
            return;
        }
        balance += amount;
    }

    public void withdraw(int amount) {
        if (amount > balance) {
            return;
        }
        balance -= amount;

    }
}
