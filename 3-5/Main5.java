public class Main5 {
    public static void main(String[] args) {
        Book b1 = new Book("Java入門", "山田太郎");
        Book b2 = new Book("Python実践" , "鈴木次郎",300);

        System.out.println("本1:" + b1.title + "-" + b1.author + "(" + b1.pages +"ページ)");
        System.out.println("本2:" + b2.title + "-" + b2.author + "(" + b2.pages +"ページ)");

    }
}
