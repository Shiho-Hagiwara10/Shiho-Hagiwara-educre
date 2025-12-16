public class Book {
    String title;
    boolean isLent;  

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
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
        }
    }
}

