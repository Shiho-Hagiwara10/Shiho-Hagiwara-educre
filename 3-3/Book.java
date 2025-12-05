public class Book {
    String title;
    boolean isLent;  

    public void setTitle(String title) {
        this.title = title;
        System.out.println(this.title + "を登録しました");
    }

    public void lend() {
        if (!isLent) {                     
            isLent = true;              
            System.out.println("本を貸し出しました");
        } else {                           
            System.out.println("申し訳ありません。この本はすでに貸出中です");
        }
    }

    public void returnBook() {
        if (isLent) {                      
            isLent = false;                
            System.out.println("本が返却されました");
        } else {                         
            System.out.println("この本は貸出中ではありません");
        }
    }
}

