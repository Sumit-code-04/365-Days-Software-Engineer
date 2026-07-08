import java.util.Random;
import java.util.Scanner;

public class NumberGuessingProgram {
    public static void main(String[] args){

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess = 0;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min,max +1);

        System.out.println("=====Number Guessing game==========");
        System.out.printf("Guess The Number Between %d-%d\n",min ,max);

        do {
            System.out.print("Enter the guess Number: ");
            guess = scanner.nextInt();
            attempts++;
            if (guess < randomNumber){
                System.out.println("TOO LOW! Try Again");
            } else if (guess > randomNumber) {
                System.out.println("TOO HIGH! Try Again");
            }else {
                System.out.println("\nCORRECT NUMBER WAS "+guess);
                System.out.println("Number of attempts "+attempts);
            }

        } while (randomNumber!= guess);

        scanner.close();

    }

}