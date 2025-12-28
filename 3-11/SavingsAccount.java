public class SavingsAccount implements BankAccount {
    String name;
    int blance;
    String transacthionHistry;

    public SavingsAccount(String name, int blance) {
        this.name = name;
        this.blance = blance;
        this.transacthionHistry = "口座作成: 初期残高 = " + blance + "\n";
    }

    @Override
    public void deposit(int amount) {
        blance += amount;
        transacthionHistry += "入金:" + amount + "\n";
    }

    @Override
    public void withdraw(int amount) {
        blance -= amount;
        transacthionHistry += "出金:" + amount + "\n";
    }

    @Override
    public int getBalance() {
        return blance;
    }

    @Override
    public void displayAccountInfo() {
        System.out.println("口座名義人:" + name);
        System.out.println("残高:" + blance);
        System.out.println("取引履歴");
        System.out.print(transacthionHistry);
    }
}
