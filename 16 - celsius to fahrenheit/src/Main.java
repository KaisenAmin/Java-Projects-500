import java.util.Scanner;

public class Main {
    public static double celToFahren(double celTemp) {
        return (celTemp * (9. / 5)) + 32;
    }
    public static void main(String[] args) {
        double temp;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter temp please in celsius : ");
        temp = input.nextDouble();

        if (temp > 0)
            System.out.println(temp + " in fahrenheit is " + celToFahren(temp));
    }
}