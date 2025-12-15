import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double p, r, t;
        double totalInterest;
        double totalPrincipal;

        System.out.print("Enter principal please : ");
        p = input.nextDouble();

        System.out.print("Enter rate please : ");
        r = input.nextDouble();

        System.out.print("Enter time please : ");
        t = input.nextDouble();

        totalInterest = (p * r * t) / 100;
        totalPrincipal = p + totalInterest;

        System.out.println("Total interest is " + totalInterest);
        System.out.println("Total Money with interest is " + totalPrincipal);


    }
}