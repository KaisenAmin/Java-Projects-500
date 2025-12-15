
public class Main {
    public static void main(String[] args) {
        final int MAX = 10;

        System.out.println("=".repeat(20));
        for (int i = 1; i <= MAX; i++) {
            System.out.printf("5 X %2d = %3d\n", i, 5 * i);
        }
        System.out.println("=".repeat(20));
    }
}