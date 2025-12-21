public class Book {
    String title;
    String author;
    int pages;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.pages = 0;
    }

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
    public void displayInfo(){
        System.out.println( title + "-" + author + "(" + pages +"ページ)");

    }
}
