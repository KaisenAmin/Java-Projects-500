public class Main {
    public static void main(String[] args) {
    /*    for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is even number");
            }
        }

        System.out.println("------");
*/
        int counter = 0;
//
//        while (counter <= 20) {
//            if (counter % 2 == 0) {
//                System.out.println(counter + " is even number");
//            }
//            counter++;
//        }


//        counter = 1;
//
//        do {
//            if (counter % 2 == 0) {
//                System.out.printf("%d is even number\n", counter);
//            }
//        } while (++counter <= 20);

//        while (counter <= 20) {
//            if (counter == 0) {
//                counter += 2;
//                continue;
//            }
//            System.out.println(counter + " is even");
//            counter += 2;
//        }

        for (int i = 0; i <= 20; i += 2) {
            System.out.println(i + " is Even");
        }
    }
}