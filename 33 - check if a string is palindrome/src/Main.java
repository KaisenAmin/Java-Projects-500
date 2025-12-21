import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String data;

        System.out.print("Enter data please : ");
        data = input.nextLine();


        if (!data.isEmpty()) {
            boolean isPalindrome = true;

            for (int i = data.length() - 1, j = 0; i >= 0; i--, j++) {
                if (data.charAt(i) != data.charAt(j)) {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome) {
                System.out.printf("%s is palindrome string", data);
            } else {
                System.out.printf("%s is not palindrome string", data);
            }
        } else {
            System.out.print(data + "is blank string");
        }

    }
}