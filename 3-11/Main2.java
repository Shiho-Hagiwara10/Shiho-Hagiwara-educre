public class Main2 {
    public static void main(String[] args) {
        Book b = new Book("Java入門", 2500, "山田太郎", 1);

        b.displayInfo();
        b.checkStock();
    }
}
