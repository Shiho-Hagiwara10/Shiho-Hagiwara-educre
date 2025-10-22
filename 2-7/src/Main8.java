public class Main8 {
public static void main(String[] args) {
    int attack = 50;
    int defence = 20;
    int damege = attack-defence;
    double critical = damege*1.5;
    System.out.println("攻撃力:" + attack);
    System.out.println("防御力:" + defence);
    System.out.println("通常ダメージ:" + damege);
    System.out.println("クリティカルダメージ:" + (int)critical);
}
}