public class Main4 {
    public static void main(String[] args) {
        Weapon w = new Weapon();

        w.setWeapon("伝説の剣", 100);

        for (int i = 0; i < 10; i++) {
            w.use();
        }
        w.use();
        w.repair();
        w.use();

    }
}
