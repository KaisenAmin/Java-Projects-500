import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a and b : ");
        a = input.nextInt();
        b = input.nextInt();

        if (a > b) {
            System.out.println(a + " is bigger than " + b);
        } else if(a < b) {
            System.out.println(a + " is smaller than " + b);
        } else {
            System.out.println(a + " is equal to " + b);
        }
    }
}