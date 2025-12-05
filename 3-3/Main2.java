public class Main2 {
    public static void main(String[] args) {

        Book book = new Book();
        book.setTitle("Java入門");

        System.out.println(book.getTitle() + "を登録しました");

    
        if (!book.getIsLent()) {
            book.lend();
            System.out.println("本を貸し出しました");
        } else {
            System.out.println("申し訳ございません。この本はすでに貸し出し中です");
        }

    
        if (!book.getIsLent()) {
            book.lend();
            System.out.println("本を貸し出しました");
        } else {
            System.out.println("申し訳ございません。この本はすでに貸し出し中です");
        }

    
        book.returnBook();
        System.out.println("本が返却されました");

    
        if (!book.getIsLent()) {
            book.lend();
            System.out.println("本を貸し出しました");
        } else {
            System.out.println("申し訳ございません。この本はすでに貸し出し中です");
        }
    }
}

