import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
//        int number;
        Scanner input = new Scanner(System.in);
        boolean flag;
        double grade;

//        System.out.print("Enter number : ");
//        number = input.nextInt();
//        number = input.nextInt(2);

//        System.out.println("Number is " + number);

//        System.out.print("Enter flag please in boolean (true | false) : ");
//        flag = input.nextBoolean();

//        System.out.println("Bool value is " + flag);

        System.out.println("Enter grade of student : ");
        grade = input.nextDouble();

        System.out.printf("Grade is %.2f\n", grade);
    }
}