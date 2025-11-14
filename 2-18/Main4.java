public class Main4 {
    public static void main(String[] args) {
        int[] prices = { 100, 200, 300 };
        int[] quantities = { 1, 2, 3 };

        int[] totals = calcTotal(prices, quantities);

        System.out.print("商品価格:[");
        for (int i = 0; i < prices.length; i++) {
            System.out.print(prices[i]);
            if (i < quantities.length - 1) {
                System.out.print(",");

            }
        }
        System.out.print("]");
        System.out.print(",数量:[");
        for (int i = 0; i < quantities.length; i++) {
            System.out.print(quantities[i]);
            if (i < quantities.length - 1) {
                System.out.print(",");

            }
        }
        System.out.println("]");

        System.out.print("合計金額:[");
        for (int i = 0; i < totals.length; i++) {
            System.out.print(totals[i]);
            if (i < totals.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }

    public static int[] calcTotal(int[] prices, int[] quantities) {
        int[] totals = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            totals[i] = (int) (prices[i] * quantities[i] * 1.1);
        }
        return totals;

    }
}
