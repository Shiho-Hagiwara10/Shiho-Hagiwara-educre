public class Main3 {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();

        System.out.println("残高: " + ba.getBalance() + "円");

        ba.deposit(10000);
        System.out.println("10000円預けました");
        System.out.println("残高: " + ba.getBalance() + "円");

        if (ba.withdraw(3000)) {
            System.out.println("3000円引き出しました");
        } else {
            System.out.println("残高が不足しています");
        }
        System.out.println("残高: " + ba.getBalance() + "円");

        if (ba.withdraw(8000)) {
            System.out.println("8000円引き出しました");
        } else {
            System.out.println("残高が不足しています");
        }
        System.out.println("残高: " + ba.getBalance() + "円");
    }
}
