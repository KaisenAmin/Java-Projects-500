import java.util.Scanner;

public class Main {

    public static int reverseNumber(int number) {
        int result = 0;
        int power = Math.powExact(10, Integer.toString(number).length() - 1);

//        System.out.println("Length is " + power);

        while (number != 0) {
            result += ((number % 10) * power);
            power /= 10;
            number /= 10;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Enter number : ");
        number = input.nextInt();

        System.out.println("Result is " + reverseNumber(number));
    }
}