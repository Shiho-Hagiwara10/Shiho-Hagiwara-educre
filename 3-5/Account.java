public class Account {
    String accountNumber;
    int balance;

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
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
    public void displayInfo(){
          System.out.println("口座番号:" + accountNumber);
          System.out.println("残高:" + balance + "円");
    }
    public void displayAfterWithdraw(){
        System.out.println("出金後残高:" + balance + "円");
    }
}
