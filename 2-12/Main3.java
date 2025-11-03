public class Main3 {
    public static void main(String[] args) {
        int height = 5;
        for (int x = 1; x <= height; x++) {
            for (int y =1; y <= height - x; y++)
            System.out.print(" ");
        for (int z = 1; z <= 2 * x - 1; z++) {
                System.out.print("*");
            }
                System.out.println();

            }
        }

    }


