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

        if (a > b && a > c) {
            System.out.println("a is bigger");
        } else if (b > a && b > c) {
            System.out.println("b is bigger");
        } else if (a == b && b == c){
            System.out.println("numbers are equal");
        } else {
            System.out.println("c is bigger");
        }
    }
}