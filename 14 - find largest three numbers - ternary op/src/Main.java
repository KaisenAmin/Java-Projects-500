import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a : ");
        a = input.nextInt();

        System.out.println("Enter b : ");
        b = input.nextInt();

        System.out.println("Enter c : ");
        c = input.nextInt();

//        int max = (a > b)? (a > c? a: c):(b > c? b: c);
        int max = Math.max(a, Math.max(b, c));

        System.out.println("Max number is " + max);
    }
}