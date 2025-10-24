/**
 * ダメージを計算するプログラム。
 * （攻撃力*2-防御力）/3
 */
public class Main3 {
    public static void main(String[] args) {
        //攻撃力と防御力を設定
        int attack=15;
        int defence=5;
        //ダメージを計算
        //整数以外の計算では小数点以外は切り捨てられる
        int damage=(attack*2-defence)/3;
        //結果を表示
        System.out.println("与えたダメージ:" + damage);

    }
}
