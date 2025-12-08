import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a : ");
        a = input.nextInt();

        System.out.print("Enter b : ");
        b = input.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("a is " + a);
        System.out.println("b is " + b);
    }
}