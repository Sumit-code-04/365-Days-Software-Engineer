import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int number = scanner.nextInt();
        System.out.println("\n=========Output=========");

        if (number % 2 == 0){

            System.out.println("The "+number+" is EVEN");
        }
        else {

            System.out.println("The "+number+" is ODD");
        }


        scanner.close();
    }
}
