public class Book extends Product {
    String actor;
    int stockQuantity;

    public Book(String name, int price, String actor, int stockQuantity) {
        super(name, price);
        this.actor = actor;
        this.stockQuantity = stockQuantity;
    }

    @Override
    public void displayInfo() {
        System.out.println("書籍名:" + name);
        System.out.println("著者:" + actor);
        System.out.println("価格:" + price + "円");
    }

    @Override
    public void checkStock() {
        if (stockQuantity > 0) {
            System.out.println("在庫あり");
        } else {
            System.out.println("在庫なし");
        }

    }
}
