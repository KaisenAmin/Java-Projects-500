import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double radius;
        double area;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius please : ");
        radius = input.nextDouble();

        area = Math.PI * Math.pow(radius, 2);

        System.out.printf("Area of Circle is %.3f", area);


    }
}