public class Main5 {
    public static void main(String[] args) {
        int note = 280*3;
        int pencil= 120*5;
        int eraser = 100*2;
        int cash = 2000;
    int price = note+pencil+eraser;
    System.out.println("小計:"+price+"円");
    double tax = price*0.1;
    double total = price + tax;
    System.out.println("消費税:" + (int)tax + "円");
    System.out.println("合計金額:" + (int)total + "円");
    System.out.println("おつり:" + (int)(cash-total) + "円");
    }
}
