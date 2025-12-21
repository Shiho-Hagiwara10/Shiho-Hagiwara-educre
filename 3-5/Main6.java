public class Main6 {
    public static void main(String[] args) {
        
        Account a = new Account("12345");
      

        a.deposit(1000);
        a.displayInfo();

        a.withdraw(500);
        a.displayAfterWithdraw();
    }
    
}
