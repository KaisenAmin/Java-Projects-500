import java.util.Scanner;


public class Main {
    public static void showFibonacci(int max) {
        if (max < 0) {
            System.out.print("this is not true number -> should be positive");
        }
        else {
            int f0 = 0, f1 = 1, f2;

            for (int i = 1; i <= max; i++) {
                if (i == max)
                    System.out.print(f0);
                else
                    System.out.print(f0 + ", ");

                f2 = f0 + f1;
                f0 = f1;
                f1 = f2;         }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Enter number for fibo : ");
        number = input.nextInt();

        showFibonacci(number);
    }
}