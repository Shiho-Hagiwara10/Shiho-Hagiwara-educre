import java.util.Scanner;
public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("現在の経験値:");
        int exp = sc.nextInt();
        double bonusRate =0.25;
        int bonusExp = (int)(exp*(1 + bonusRate));
        System.out.println("ボーナス後の経験値:"+ bonusExp);
        sc.close();
    }
}

