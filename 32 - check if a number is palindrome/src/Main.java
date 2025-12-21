import java.util.Scanner;


public class Main {

    public static int reverseNumber(int number) {
        int result = 0;
        boolean isNegative = false;

        if (number < 0) {
            String num = Integer.toString(number).substring(1);
            isNegative = true;
            number = Integer.parseInt(num);
        }

        int power = Math.powExact(10, Integer.toString(number).length() - 1);
        while (number != 0) {
            result += ((number % 10) * power);
            power /= 10;
            number /= 10;
        }

        if (isNegative)
            result *= -1;

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Enter number : ");
        number = input.nextInt();

        if (number == reverseNumber(number)) {
            System.out.printf("%d is palindrome\n", number);
        } else {
            System.out.printf("%d is not palindrome\n", number);
        }
    }
}