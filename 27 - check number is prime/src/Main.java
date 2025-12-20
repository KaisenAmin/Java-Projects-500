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
        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Enter number : ");
        number = input.nextInt();

        if (isPrime(number)) {
            System.out.print(number + " is prime");
        } else {
            System.out.print(number + " is not prime");
        }
    }

}