public class Main9 {

    public static void main(String[] args) {
        int number1 = 3;
        int number2 = 9;
        char operator = '+';
        switch (operator) {
            case '+':
                System.out.println("結果" + (number1 + number2));
                break;
            case '-':
                System.out.println("結果" + (number1 - number2));
                break;
            case '*':
                System.out.println("結果" + (number1 * number2));
                break;
            case '/':
                if (number2 == 0) {
                    System.out.println("エラー:0で割ることはできません");
                } else {
                    System.out.println("結果" + (number1 / number2));
                }
                break;
            default:
                System.err.println("エラー:無効な演算子です");

        }

    }
}
