public class Player {
    String name;
    int hp;

    public Player(String name, int hp){
        this.name = name;
        this.hp =hp;
    }

    public void showStatus(){
        System.out.println("プレイヤー名:" + name);
        System.out.println("プレイヤーのHP:" + hp);
    }
    public void displayInfo() {
        System.out.println("プレイヤーのHP:" + hp);
    }
}
