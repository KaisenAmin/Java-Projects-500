import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        double a, b;
//
//        System.out.print("Enter a : ");
//        a = input.nextDouble();
//
//        System.out.print("Enter b : ");
//        b = input.nextDouble();
//
//        double sum = a + b;
//        double subtraction = a - b;
//        double mul = a * b;
//        double div = a / b;
//        double remain = a % b;
//
//        System.out.printf("%f + %f = %f\n", a, b, sum);
//        System.out.printf("%f - %f = %f\n", a, b, subtraction);
//        System.out.printf("%f * %f = %f\n", a, b, mul);
//        System.out.printf("%f / %f = %f\n", a, b, div);
//        System.out.printf("%f %% %f = %f\n", a, b, remain);

        char ch;

        System.out.println("Enter char : ");
        ch = input.nextLine().charAt(0);

        System.out.println(ch);

    }
}