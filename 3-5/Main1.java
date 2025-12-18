public class Main1 {
    public static void main(String[] args) {

        Weapon w = new Weapon("鋼鉄の剣", 80);

        GameCharacter c = new GameCharacter("剣士アレックス", 100, w);

        System.out.println(c.name + "は" + c.weapon.name + "を装備しています");
    }
}
