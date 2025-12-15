import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double p, r, t, n;

        System.out.println("Enter p : ");
        p = input.nextDouble();

        System.out.println("Enter r : ");
        r = input.nextDouble();

        System.out.println("Enter t : ");
        t = input.nextDouble();

        System.out.println("Enter n : ");
        n = input.nextDouble();


        double totalAmount = p * (Math.pow((1 + (r / (100 * n))), (n * t)));
        double compoundInterest = totalAmount - p;

        System.out.println("Total Amount is " + totalAmount);
        System.out.println("Compound Interest is " + compoundInterest);
    }
}