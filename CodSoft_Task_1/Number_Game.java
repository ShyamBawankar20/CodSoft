import java.util.Random; 
import java.util.Scanner; 

 class Numberguessinggame {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        Random random = new Random();
        
        
        int numberToGuess = random.nextInt(100) + 1; 
        int numberOfTries = 0; 
        boolean hasGuessedCorrectly = false; 

        
        System.out.println("=========================================");
        System.out.println("       Welcome to the Number Guessing Game!");
        System.out.println("=========================================");
        System.out.println("I've picked a number between 1 and 100.");
        System.out.println("Can you guess what it is? Let's find out!");
        System.out.println("=========================================");

        
        while (!hasGuessedCorrectly) {
            System.out.print("Please enter your guess (1-100): ");
            int playerGuess = scanner.nextInt(); 
            numberOfTries++; 

            
            if (playerGuess < 1 || playerGuess > 100) {
                System.out.println("Oops! That's not between 1 and 100. Try again.");
            } else if (playerGuess < numberToGuess) {
                System.out.println("Your guess is too low! Give it another shot.");
            } else if (playerGuess > numberToGuess) {
                System.out.println("Your guess is too high! Try again.");
            } else {
            
                hasGuessedCorrectly = true; 
                System.out.println("=========================================");
                System.out.println("Congratulations! You've guessed the number " + numberToGuess + "!");
                System.out.println("It took you " + numberOfTries + " tries.");
                System.out.println("=========================================");
            }
        }

        
        scanner.close();
    }
}
