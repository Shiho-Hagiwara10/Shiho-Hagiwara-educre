public class Main6 {
    public static void main(String[] args) {
        //現在の経験値
        int EXP = 1000;
        //ボーナスで25%付与
        double point = 1.25;
        System.out.println("現在の経験値:" + EXP);
        System.out.println("ボーナス後の経験値:"+ (int)(EXP*point));
    }
}

