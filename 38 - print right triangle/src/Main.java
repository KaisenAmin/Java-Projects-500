

public class Main {
    public static void main(String[] args) {
//        int counter = 1;
//        do {
//            System.out.println(counter++);
//        } while (counter <= 10);

        final int MIN = 1;
        final int MAX = 5;

        for (int i = MIN; i <= MAX; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}