public class Main1 {
    public static void main(String[] args) {
        
        String text = "Hello world";
        int count = countWords(text);
        System.out.println("大文字:" + text.toUpperCase());
        System.out.println("文字数:" + count);
    }
        public static int countWords(String str){
            String upper = str.toUpperCase();
            return upper.length();
        

    }
}

