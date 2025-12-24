import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static int findMax(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    public static Map<String, Integer> findMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        Map<String, Integer> data = new HashMap<String, Integer>();

        data.put("min", min);
        data.put("max", max);

        return data;
    }

    public static void main(String[] args) {
        int[] arr = {15, -9, 10, 20, 12, 65, -85, 652, 123, -16};

        System.out.println("Min number is " + findMin(arr));
        System.out.println("Max number is " + findMax(arr));

        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();

        System.out.println("Min by stream is " + min);
        System.out.println("Max by stream is " + max);

        var data = findMinMax(arr);

        System.out.println("Min by findMinMax is " + data.get("min"));
        System.out.println("Max by findMinMax is " + data.get("max"));

    }
}