

public class Main {
    public static void main(String[] args) {
        final int MAX = 5;
        int counter = 1;
//        char counter = 'A';
        int d = 1;

        for (int i = 1; i <= MAX; i++) {
            while (d <= i) {
                System.out.printf("%02d ", counter++);
//                System.out.printf("%c ", counter++);
                d++;
            }
            d = 1;
            System.out.println();
        }
    }
}