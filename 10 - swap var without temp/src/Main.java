import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;

//        System.out.println("Enter a : ");
//        a = input.nextInt();
//
//        System.out.println("Enter b : ");
//        b = input.nextInt();

//        a = a + b; // 30
//        b = a - b; // 10
//        a = a - b; // 20

//        a = a ^ b;
//        b = a ^ b;
//        a = a ^ b;
//
//        System.out.printf("a is %d and b %d\n", a, b);

        String one = "Java", two = "programmers";

        one = one + two; //Javaprogrammers
        two = one.substring(0, one.length() - two.length());
        one = one.substring(two.length());

        System.out.println("Two -> " + two);
        System.out.println("One -> " + one);
    }
}