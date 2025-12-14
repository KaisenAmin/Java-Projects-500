import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double base, height;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base please : ");
        base = input.nextDouble();

        System.out.print("Enter height please : ");
        height = input.nextDouble();

        double area = base * height / 2;
        System.out.println("Area of triangle is " + area);
    }
}