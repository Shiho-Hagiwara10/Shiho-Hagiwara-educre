public class Pet {
    String name;
    int energy;

    public void setName(String name) {
        this.name = name;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getEnergy() {
        return this.energy;
    }

    public void showEnergy(){
        System.out.println("現在の体力:" + energy);
    }

    public void eat() {
        energy += 10;
    }

    public void play() {
        energy -= 20;
    }
}
