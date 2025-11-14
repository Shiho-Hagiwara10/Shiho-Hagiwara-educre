public class Main1 {

    public static void main(String[] args) {
        int price = 1000;
        int quantity = 3;

        System.out.println("商品価格:" + price + "円,数量:" + quantity);

        int total = calcTotal(price, quantity);

        System.out.println("合計金額(税込):" + total + "円");
    }

    public static int calcTotal(int price, int quantity) {
        int total = (int) (price * quantity * 1.1);
        return total;
    }
}
