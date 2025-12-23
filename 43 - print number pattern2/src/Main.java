
public class Main {
    public static void main(String[] args) {
        final int MAX = 5;
        for (int i = MAX; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}