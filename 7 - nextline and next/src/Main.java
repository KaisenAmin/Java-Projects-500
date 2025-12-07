import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        int age;

        System.out.print("Enter age : ");
        age = input.nextInt();

        input.nextLine();
        System.out.print("Enter name : ");
        name = input.nextLine();


        System.out.printf("Name is %s and age is %d\n", name, age);

//
//        System.out.print("enter name : ");
//        name = input.nextLine();
//        name = input.next();
//        System.out.println("Name is " + name);

//        String age, lang;
//        System.out.println("Please Enter age and your programming language : ");
//        age = input.next();
//        lang = input.next();
//
//        System.out.println("Lang is " + lang + " age is " + age);


    }
}