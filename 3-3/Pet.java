public class Pet {
    String name;
    int energy;

    public void setName(String name) {
        this.name = name;
        System.out.println(this.name + "を生み出しました！");
    }

    public void setEnergy(int energy) {
        this.energy = energy;
        System.out.println("初期体力:" + this.energy);
    }

    public void eat() {
        energy += 10;
        System.out.println(this.name + "は食事をして元気になった！");
        System.out.println("現在の体力:" + energy);
    }

    public void play() {
        energy -= 20;
        System.out.println(this.name + "は遊んで疲れた！");
        System.out.println("現在の体力:" + energy);
    }

}
