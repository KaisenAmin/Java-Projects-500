import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int height, width;
        int area;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter height : ");
        height = input.nextInt();

        System.out.print("Enter width : ");
        width = input.nextInt();

        area = height * width;
        System.out.println("Area of Rectangle is " + area);
    }
}