public class Main3 {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000);
        BankAccount account2 = account1;

        account1.setbalance(3000);

        System.out.println("口座1の残高:" + account1.getBalance());
        System.out.println("口座2の残高:" + account2.getBalance());
    }

}
