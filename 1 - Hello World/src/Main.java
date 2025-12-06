

public class Main {
    public static void main(String[] args) {
        String name = "Java programmers";
        float grade = 15.325151f;
        boolean flag = true;
        byte b = -128;
        char ch = 'm';
        short sh = -12516;
        int data = 541561561;
        long l = 158165165L;
        double d = 15.56156156;

        System.out.printf("Short value %d\n", sh);
        System.out.printf("Double with f %f and with scientefic %e", d, d);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

        System.out.println(Integer.MAX_VALUE);
        String programming = "Java Language";
        System.out.println("Long value " + l);
        System.out.printf("Float value in printf %f\n", grade);
        System.out.printf("Gender is %c\n", ch);
        System.out.println("Byte value is " + b);
        System.out.printf("Flag is %b\n", flag);
        System.out.println("Grade is " + grade);
        System.out.printf("Data is %s\n", name);
        System.out.println("Hello World");

        System.out.print("Data is " + name);

        System.out.print(programming);
    }
}