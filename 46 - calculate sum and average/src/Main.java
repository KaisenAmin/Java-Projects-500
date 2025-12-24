import java.util.Random;

public class Main {

    public static double getSum(double[] arr) {
        double sum = 0;
        for (double value : arr) {
            sum += value;
        }

        return sum;
    }

    public static double getAverage(double[] arr) {
        double sum = getSum(arr);
        return sum / arr.length;
    }

    public static void main(String[] args) {
        Random random = new Random();
        double[] arr = new double[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextDouble(100);
        }

        double sum = getSum(arr);
        double average = getAverage(arr);

        System.out.println("Sum of numbers is " + sum);
        System.out.println("Average of number is " + average);
    }
}