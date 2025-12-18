public class Account {
    String accountNumer;
    int balance;

    public Account(String accountNumer){
        this.accountNumer = accountNumer;
        this.balance = 0;
    }
    public void deposit(int amount){
        balance += amount;
    }
    public void  withdraw(int amount){
        balance -= amount;
    
    }
}

