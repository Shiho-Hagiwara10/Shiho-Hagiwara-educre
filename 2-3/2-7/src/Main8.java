import java.util.Scanner;
public class Main8 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("攻撃力を入力してください:");
    int attack = sc.nextInt();

    System.out.println("防御力を入力してください:");
    int defence = sc.nextInt();

    int normalDamege = attack-defence;
    int criticalDamege = (int)(normalDamege*1.5);

    System.err.println("通常ダメージ:" + normalDamege);
    System.out.println("クリティカルダメージ:" + criticalDamege);

    sc.close();

}
}