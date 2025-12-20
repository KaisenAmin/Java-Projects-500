import java.util.Scanner;

public class Main {

    public static int factorial(int number) {
        if (number < 0) {
            return -1;
        } else if (number == 1) {
            return 1;
        } else {
            return factorial(number - 1) * number;
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Enter number : ");
        number = input.nextInt();
        int result = factorial(number);

        if (result < 0) {
            System.out.println("[Error] -> negative number");
        } else {
            System.out.printf("factorial of %d is %d\n", number, result);
        }
    }
}