public class Main5 {
    public static void main(String[] args) {
        int a = 280*3;
        int b = 120*5;
        int c = 100*2;
        int x = 2000;
    int price = a+b+c;
    System.out.println("小計:"+price+"円");
    double tax = price*0.1;
    double total = price + tax;
    System.out.println("消費税:" + (int)tax + "円");
    System.out.println("合計金額:" + (int)total + "円");
    System.out.println("おつり:" + (int)(x-total) + "円");
    }
}
