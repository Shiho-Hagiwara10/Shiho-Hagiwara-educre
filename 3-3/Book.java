public class Book {
    String title;
    boolean isLent;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setIsLent(boolean isLent) {
        this.isLent = isLent;
    }

    public boolean getIsLent() {
        return this.isLent;
    }

    public void lend() {
        this.isLent = true;
    }

    public void returnBook() {
        this.isLent = false;
    }
}
