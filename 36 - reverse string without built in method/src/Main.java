import java.util.Scanner;

public class Main {

    public static String reverseString(String data) {
        StringBuilder result = new StringBuilder();

        for (int i = data.length() - 1; i >= 0; i--) {
            result.append(data.charAt(i));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String data;

        System.out.print("Enter data please : ");
        data = scanner.nextLine();

        System.out.println("Reverse of String is " + reverseString(data));
    }
}