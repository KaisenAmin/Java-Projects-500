

public class Main {
    public static void main(String[] args) {
        int counter = 10;

        while (counter >= 1) {
            System.out.println("Number is " + counter--);
        }

        System.out.println("--------");
        boolean flag = true;
        counter = 10;

        while (flag) {
            if (counter == 0) {
//                flag = false;
                break;
            }
            System.out.printf("Counter is %d\n", counter);
            counter--;
        }

        counter = 11;
        while ((counter--) >= 2) {
            System.out.println("New Counter is " + counter);
        }
    }
}