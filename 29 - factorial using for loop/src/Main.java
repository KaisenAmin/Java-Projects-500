import java.util.Scanner;

public class Main {

    public static int factorial(int number) {
        int fact = 1;
        if (number < 0) {
            fact = -1;
        }
        else if (number == 0 || number == 1) {
            fact = 1;
        } else {
            for (int i = 2; i <= number; i++) {
                fact *= i;
            }
        }

        return fact;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Enter number : ");
        number = input.nextInt();

        int result = factorial(number);
        if (result != -1) {
            System.out.printf("Factorial of %d is %d\n", number, result);
        } else {
            System.out.println("[Error] -> negative number is not correct for calculate factorial");
        }
    }
}
