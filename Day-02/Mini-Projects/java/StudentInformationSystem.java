import java.util.Scanner;
public class StudentInformationSystem {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your name: ");
        String name = scanner.nextLine();

        System.out.print("How old are YOU?: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Your College name: ");
        String colgname = scanner.nextLine();

        System.out.print("Enter Your Branch: ");
        String branch = scanner.nextLine();

        System.out.print("Enter Your percentage: ");
        double percentage = scanner.nextDouble();

        System.out.println("\n============== Your Information ================\n");
        System.out.println("Your Name: "+name.toUpperCase());
        System.out.println("Your Age: "+age+"yrs old");
        System.out.println("Your College Name: "+colgname.toUpperCase());
        System.out.println("Your Branch: "+branch.toUpperCase());
        System.out.println("Your percentage: "+percentage+"%");

        scanner.close();
    }
}
