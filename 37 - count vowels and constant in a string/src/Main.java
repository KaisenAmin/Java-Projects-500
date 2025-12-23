import java.util.Scanner;


public class Main {
    public static int[] counterVowels(String data) {
        int[] counter = new int[2];

        for (int i = 0; i < data.length(); i++) {
            char ch = data.charAt(i);
            if (ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u')
                counter[0]++;
            else if (Character.isAlphabetic(ch))
                counter[1]++;
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String data;

        System.out.print("Enter data please : ");
        data = scanner.nextLine().toLowerCase();

        int[] result = counterVowels(data);

        System.out.printf("Length of Data is %d\n", data.length());
        System.out.println("Vowels Number is " + result[0]);
        System.out.println("Constants Number is " + result[1]);


    }
}