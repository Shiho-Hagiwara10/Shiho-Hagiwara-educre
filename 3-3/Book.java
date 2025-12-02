public class Book {
    String title;
    boolean isLent;

    public void setTitle(String title) {
        this.title = title;
        System.out.println(this.title + "を登録しました");

    }

    public void setIsLent(boolean isLent) {
        this.isLent = isLent;
        System.out.println("本を貸し出しました");
    }

    public boolean getIsLent() {
        return this.isLent;
    }

    public void lend() {
        if (isLent) {
            System.out.println("本を貸し出しました");
        } else {
            isLent = true;
            System.out.println("申し訳ございません。この本はすでに貸し出し中です");
        }
    }

    public void returnBook() {
        System.out.println("本が返却されました");

    }

}
