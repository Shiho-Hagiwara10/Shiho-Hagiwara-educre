public class Main2 {
    public static void main(String[] args) {

        Player p = new Player("勇者", 30);
        p.name = "勇者";
        p.hp = 30;
        System.out.println("プレイヤー名:" + p.name);

        p.displayInfo();

        HealingPotion hpPotion = new HealingPotion();

        hpPotion.heal(p);

        p.displayInfo();
    }

}
