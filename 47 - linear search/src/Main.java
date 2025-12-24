import java.util.ArrayList;
import java.util.List;

public class Main {

    public static int linearSearch(int[] arr, int value) {
//        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
//                index = i;
//                break;
                return i;
            }
        }

        return -1;
    }

    public static int linearSearchString(String[] arr, String value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    public static List<Integer> linearSearchAll(int[] arr, int value) {
        List<Integer> data = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                data.add(i);
            }
        }
        return data;
    }

    public static void main(String[] args) {
        int[] arr = {95, 36, 98, -9, 65, 45, 98, 32, -3};
        String[] langs = {"java", "cpp", "python", "linux", "java", "php"};


        int result = linearSearch(arr, 98);

        if (result >= 0) {
            System.out.println("Index found at " + result);
        }

        int resultString = linearSearchString(langs, "python");

        if (resultString >= 0) {
            System.out.println("String found at " + resultString);
        }

        List<Integer> resultAll = linearSearchAll(arr, 956);

        if (!resultAll.isEmpty()) {
            System.out.println("Result of all indices is " + resultAll);
        } else {
            System.out.println("no index found!");
        }
    }
}