
public class Main2 {
    public static void main(String[] args) {
        Book b = new Book();

        b.setTitle("Java入門");
        b.lend();   

        b.lend();   

        b.returnBook(); 

        b.lend();     
    }
}
