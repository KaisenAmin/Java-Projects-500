import java.util.Scanner;

public class Main {
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    public static boolean isPersianLeapYear(int year) {
        int[] numbers = {1, 5, 9, 13, 17, 22, 26, 30};
        int calculate = year % 33;

        for (var number : numbers) {
            if (number == calculate) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter year please : ");
        year = input.nextInt();

//        if (isLeapYear(year)) {
//            System.out.println(year + " is leap year");
//        } else {
//            System.out.println(year + " is not leap year");
//        }

        if (isPersianLeapYear(year)) {
            System.out.println(year + " is persian leap year");
        } else {
            System.out.println(year + " is not persian leap year");
        }

    }
}