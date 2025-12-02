public class Main3 {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();

        ba.getBalance();
        ba.deposit(10000);
        ba.withdraw(3000);

        ba.withdraw(8000);

    }
}
