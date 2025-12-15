import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int limit, number;

        System.out.print("Enter number : ");
        number = input.nextInt();

        System.out.print("Enter limit : ");
        limit = input.nextInt();

        System.out.println("=".repeat(15));
        for (int i = 1; i <= limit; i++) {
            System.out.printf("%2d X %2d = %3d\n", number, i, number * i);
        }
        System.out.println("=".repeat(15));
    }
}