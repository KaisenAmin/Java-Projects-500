import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Enter number : ");
        number = input.nextInt();

//        if (number < 0) {
//            System.out.printf("total digits is %d\n", Integer.toString(number).substring(1).length());
//        } else {
//            System.out.printf("total digits is %d\n", Integer.toString(number).length());
//        }

        int counter = 0;

        while (number != 0) {
            number /= 10;
            counter++;
        }

        System.out.printf("total digits is %d\n", counter);

    }
}