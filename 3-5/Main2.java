public class Main2 {
    public static void main(String[] args) {

        Player p = new Player("勇者", 30);
        p.displayInfo();

        HealingPotion hpPotion = new HealingPotion();
        hpPotion.heal(p);

        p.displayHP();
    }

}
