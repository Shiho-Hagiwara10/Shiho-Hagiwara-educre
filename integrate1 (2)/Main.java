import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] englishWords = new String[20];
        String[] japaneseWords = new String[20];
        int WordCount = 0;

        while (true) {

            System.out.println("====メニュー====");
            System.out.println("1.単語登録");
            System.out.println("2.クイズ実施");
            System.out.println("3.終了");

            System.out.print("番号を入力してください:");

            if (!sc.hasNextInt()) {
                System.out.println("1-3の数字を入力してください");
                sc.nextLine();
                continue;   
            }

            int menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                if (WordCount >= 20) {
                    System.out.println("これ以上登録できません");
                    continue;

                }
                System.out.println("[単語登録]");
                System.out.println("英単語を入力してください");
                String e = sc.nextLine();

                System.out.println("日本語訳を入力してください");
                String j = sc.nextLine();

                japaneseWords[WordCount] = j;
                englishWords[WordCount] = e;
                WordCount++;

                System.out.println("登録しました！");

            } else if (menu == 2) {
                if (WordCount == 0) {
                    System.out.println("単語が登録されていません");
                    continue;
                }
                System.out.println("[クイズ実施]");
                int correctCount = 0;
                for (int i = 0; i < WordCount; i++) {
                    System.out.println("問題" + (i + 1) + ":" +
                            englishWords[i] + "の意味は？");
                    String answer = sc.nextLine();
                    if (answer.equals(japaneseWords[i])) {
                        System.out.println("正解です！");
                        correctCount++;
                    } else {
                        System.out.println("不正解...");
                    }
                }
                System.out.println(WordCount + "問中" + correctCount + "問正解！");

            } else if (menu == 3) {
                System.out.println("[終了]");
                break;
            } else {
                System.out.println("1-3の数字を入力してください");
            }

        }

    }
}
