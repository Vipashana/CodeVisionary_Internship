import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame {

    public static void main(String[] args) {

        // Greeting user
        System.out.println("Welcome To Number Guessing Game!");
        System.out.println("Guess my number!");

        //Creating Scanner object
        Scanner sc = new Scanner(System.in);

        boolean continuePlaying = true;

        while (continuePlaying) {

            // Generating Random Number
            int random_num = generateRandom();

            // Initializing counter to count attempts
            int attempt = 1;
            
            while (true) {
                System.out.println("Enter your guess:");
                //Storing user's guess
                int user_guess = sc.nextInt();

                //Guess Logic
                if (random_num == user_guess) {
                    System.out.println("Congratulations! You won!");
                    break;
                } else if (user_guess < random_num) {
                    System.out.println("Too low");
                } else {
                    System.out.println("Too high");
                }
                attempt += 1;
            }
            System.out.println("It took you "+attempt+" attempts.");

            // Asking if user wants to play again or not
            continuePlaying = askToPlayAgain(sc);
            }
        System.out.println("Thanks for playing!");
        }

    private static boolean askToPlayAgain(Scanner scanner) {
        System.out.print("Do you want to play again? (yes/no): ");
        String response = scanner.next().trim().toLowerCase();
        return response.equals("yes") || response.equals("y");
    }

    private static int generateRandom(){
        Random obj1 = new Random();
        int random = obj1.nextInt(1,100);
        return random;
    }
}

