
public class Main {
    public static void main(String[] args) {
        final int MIN = 1;
        final int MAX = 5;

        for (int i = MAX; i >= MIN; i--) {
            for (int j = i; j >= MIN; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}