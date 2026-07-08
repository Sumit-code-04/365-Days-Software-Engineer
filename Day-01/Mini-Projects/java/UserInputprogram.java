import java.util.Scanner;
public class UserInputprogram {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your name: ");
        String name = scanner.nextLine();

        System.out.print("How old are you: ");
        int age = scanner.nextInt();

        System.out.println("==========Your Details============");

        System.out.println("Hello "+name.toUpperCase());
        System.out.println("You are " + age + " years old");
        scanner.close();
    }
}
