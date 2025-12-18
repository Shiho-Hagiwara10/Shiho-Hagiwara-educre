public class Main6 {
    public static void main(String[] args) {
        
        Account a = new Account("12345");
        System.out.println("口座番号:" + a.accountNumer);

        a.deposit(1000);
        System.out.println("残高:" + a.balance + "円");

        a.withdraw(500);
        System.out.println("出金後残高:" + a.balance + "円");
    }
    
}
