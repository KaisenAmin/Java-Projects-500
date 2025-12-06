

public class Main {
    public static void main(String[] args) {
        int counter = 1;
        for (int i = 10, j = 20; counter <= 10; ) {
            System.out.print("J is " + (j++) + " ");
            System.out.printf("Counter is %d and i is %d\n", counter, i++);
            counter++;

        }
    }
}