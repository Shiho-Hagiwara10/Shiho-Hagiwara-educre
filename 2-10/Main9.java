public class Main9 {

    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 9;
        char operator = '+';
        switch (operator) {
            case '+':
                System.out.println("結果:" + (num1 + num2));
                break;
            case '-':
                System.out.println("結果:" + (num1 - num2));
                break;
            case '*':
                System.out.println("結果:" + (num1 * num2));
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("エラー:0で割ることはできません");
                } else {
                    System.out.println("結果:" + (num1 / num2));
                }
                break;
            default:
                System.err.println("エラー:無効な演算子です");

        }

    }
}
