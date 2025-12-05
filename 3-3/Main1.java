public class Main1 {
    public static void main(String[] args) {

        Pet p = new Pet();

        p.setName("ポチ");
        p.setEnergy(100);

        System.out.println("ポチを生み出しました！");
        System.out.println("初期体力：" + p.energy);
        p.showEnergy();

        p.eat();
        System.out.println("ポチは食事をして元気になった！");
        p.showEnergy();

        p.play();
        System.out.println("ポチは遊んで疲れた！");
        p.showEnergy();
    }
}


