
public class Main {
    public static void main(String[] args) {
        final int MAX = 5;

        for (int i = 1; i <= MAX; i++) {
            String row = "*".repeat(i);

            if (i != 1) {
                row = " ".repeat(MAX - i) + row + row.substring(0, i - 1) + " ".repeat(MAX - i);
            } else {
                row = " ".repeat(MAX - i) + row + " ".repeat(MAX - i);
            }

            System.out.println(row);
        }
    }
}