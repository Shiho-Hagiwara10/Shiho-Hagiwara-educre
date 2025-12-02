public class Main2 {
    public static void main(String[] args) {
        Book b = new Book();

        b.setTitle("JAVA入門");

        b.setIsLent(false);
        b.lend();

        b.returnBook();

        b.lend();

    }
}
