
public class Main {
    public static void main(String[] args) {
        final int MAX = 5;
        int i = 1, c = 1;

        while (i <= (MAX * 2) && c != 0) {
            String row = "*".repeat(c);

            if (i != 1) {
                row = " ".repeat(MAX - c) + row + row.substring(0, c - 1) + " ".repeat(MAX - c);
            } else {
                row = " ".repeat(MAX - c) + row + " ".repeat(MAX - c);
            }

            System.out.println(row);
            if (i >= MAX) {
                c--;
            } else {
                c++;
            }
            i++;
        }

//        for (int i = 1; i <= MAX; i++) {
//            String row = "*".repeat(i);
//
//            if (i != 1) {
//                row = " ".repeat(MAX - i) + row + row.substring(0, i - 1) + " ".repeat(MAX - i);
//            } else {
//                row = " ".repeat(MAX - i) + row + " ".repeat(MAX - i);
//            }
//            System.out.println(row);
//        }
//
//        for (int i = MAX; i >= 1; i--) {
//            String row = "*".repeat(i);
//            if (i != 1) {
//                row = " ".repeat(MAX - i) + row + row.substring(0, i - 1) + " ".repeat(MAX - i);
//            } else {
//                row = " ".repeat(MAX - i) + row + " ".repeat(MAX - i);
//            }
//            System.out.println(row);
//        }
    }
}