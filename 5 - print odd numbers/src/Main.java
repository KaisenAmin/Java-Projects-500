public class Main {
    public static void main(String[] args) {
//        for (int i = 1; i <= 20; i++) {
//            if (i % 2 != 0) {
//                System.out.println(i + " is odd number");
//            }
//        }

//        for (int i = 1; i <= 20; i += 2) {
//            System.out.println(i + " is odd number");
//        }

        int counter = 1;

//        do {
//            System.out.println((counter) + " is odd number");
//            counter += 2;
//        } while (counter <= 20);

        while (counter <= 20) {
            if (counter % 2 != 0) {
                System.out.printf("%d is odd number\n", counter);
            }
            counter++;
        }

    }
}