public class Main {
    public static void main(String[] args) {
        final int MAX = 10;
        int f0 = 0, f1 = 1, f2;

        for (int i = 1; i <= MAX; i++) {
            if (i == MAX)
                System.out.print(f0);
            else
                System.out.print(f0 + ", ");

            f2 = f0 + f1;
            f0 = f1;
            f1 = f2;
        }
    }
}