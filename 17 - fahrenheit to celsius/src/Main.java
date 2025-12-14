import java.util.Scanner;


public class Main {
    public static double fahrenheitToCelsius(double temp) {
        return (temp - 32) * (5. / 9);
    }

    public static void main(String[] args) {
        double temp;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter temp : ");
        temp = input.nextDouble();

        System.out.println(temp + "F in celsius is " + fahrenheitToCelsius(temp));
    }
}