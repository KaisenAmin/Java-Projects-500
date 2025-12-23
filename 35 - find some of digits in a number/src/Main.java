import java.util.Scanner;

public class Main {
    public static int sumOfDigits(int number) {
        int result = 0;

        while (number != 0) {
            result += (number % 10);
            number /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.print("Enter number : ");
        number = scanner.nextInt();

        System.out.printf("Sum of digits of %d is %d\n", number, sumOfDigits(number));
    }
}