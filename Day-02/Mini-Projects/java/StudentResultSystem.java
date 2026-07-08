import java.util.Scanner;

public class StudentResultSystem {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your FullName: ");
        String Name = scanner.nextLine();

        System.out.print("Enter Your Roll NO.: ");
        int Roll_Name = scanner.nextInt();

        System.out.print("Enter Your 1st Subject Mark: ");
        double sub1 = scanner.nextDouble();

        System.out.print("Enter Your 2nd Subject Mark: ");
        double sub2 = scanner.nextDouble();

        System.out.print("Enter Your 3rd Subject Mark: ");
        double sub3 = scanner.nextDouble();

        System.out.print("Enter Your 4th Subject Mark: ");
        double sub4 = scanner.nextDouble();

        System.out.print("Enter Your 5th Subject Mark: ");
        double sub5 = scanner.nextDouble();

        double total_marks =  sub1 + sub2 + sub3 + sub4 + sub5;
        double percentage = total_marks / 5;

        System.out.println("\n==================RESULT==================\n");
        System.out.println("Name: "+Name.toUpperCase());
        System.out.println("Roll No.: "+Roll_Name);
        System.out.println("Total Marks: "+total_marks);
        System.out.println("percentage: "+percentage+"%");

        if (percentage >= 90 && percentage <= 100){
            System.out.println("Excellent Your Grade is:'A'");
            System.out.println("Result: PASS");
        } else if (percentage >= 80 && percentage <= 89) {
            System.out.println("Above Average Your Grade is:'B'");
            System.out.println("Result: PASS");
        } else if (percentage >= 70 && percentage <= 79) {
            System.out.println("Average Competency Your Grade is:'C'");
            System.out.println("Result: PASS");
        }else if (percentage >= 40 && percentage <= 69){
            System.out.println("Below Average But pass Your Grade is:'D'");
            System.out.println("Result: PASS");
        }else if (percentage < 40){
            System.out.println("Result: FAILED");
            System.out.println("Failed!Immediately Reapply for exam");
        }else {
            System.out.println("Invalid percentage "+percentage);
        }

        scanner.close();
    }
}
