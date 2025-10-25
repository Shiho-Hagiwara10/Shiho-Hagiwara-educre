public class Main2 {
    public static void main(String[] args) {
        int price = 2500;
        double discountRate = 0.2;
        double discountAmount = price * discountRate;
        double sellingPrice = price * (1 - discountRate);
        System.out.println("割引額:" + (int) discountAmount + "円");
        System.out.println("販売価格:" + (int) sellingPrice + "円");

    }
}
