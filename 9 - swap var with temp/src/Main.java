import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a : ");
        a = input.nextInt();

        System.out.print("Enter b : ");
        b = input.nextInt();

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        String one = "Java", two = "programmers";

        one = (one + two);
        two = (one).substring(0, one.length() - two.length());
        one = one.substring(two.length());

        System.out.println(one + "\n" + two);

        System.out.println("a is " + a);
        System.out.println("b is " + b);
    }
}