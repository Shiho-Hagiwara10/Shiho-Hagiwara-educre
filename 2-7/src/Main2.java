public class Main2 {
    public static void main(String[] args) {
        int price =2500;
        double discountRate  =0.2;
        double discountAmount = price*discountRate;
        double sellingPrice = price-discountAmount;
    System.out.println("割引額:"+ (int)(price*discountRate) + "円");   
    System.out.println("販売価格:"+ (int)(sellingPrice) + "円"); 



    }
}
