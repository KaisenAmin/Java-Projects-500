import java.util.Scanner;

public class Main {

    public static boolean isPrime(int number) {
        boolean isPrime = true;
        if (number == 2) {
            isPrime = true;
        } else if (number < 2 || (number % 2 == 0)) {
            isPrime = false;
        } else {
            for (int i = 3; i <= Math.sqrt(number); i += 2) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        return isPrime;
    }
    public static void main(String[] args) {
        final int MIN_NUM = 1;
        final int MAX_NUM = 100;

        for (int i = MIN_NUM; i <= MAX_NUM; i++) {
            if (isPrime(i)) {
                System.out.printf("%d is prime number\n", i);
            }
//            } else {
//                System.out.printf("%d is not prime number\n", i);
//            }

        }

    }
}
