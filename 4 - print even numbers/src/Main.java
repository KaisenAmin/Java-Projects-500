import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        double grade = 0.0;
        char ch;

        System.out.print("Enter number please : ");
        number = input.nextInt();
        grade = input.nextDouble();

        System.out.println("Number is " + number);

        System.out.print("Enter grade Please : ");


        System.out.println("Grade in Double is " + grade);
        ch = input.next().charAt(0);

        System.out.println("Char is " + ch);
    }
}