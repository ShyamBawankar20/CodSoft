import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class SimpleQuiz {
    static int score = 0;

    public static void main(String[] args) {
        String[][] questions = {
            {"What is the capital of France?", "1. Berlin", "2. Madrid", "3. Paris", "4. Rome", "2"},
            {"Which planet is known as the Red Planet?", "1. Earth", "2. Mars", "3. Jupiter", "4. Venus", "1"},
            {"What is the largest ocean on Earth?", "1. Atlantic", "2. Indian", "3. Arctic", "4. Pacific", "3"}
        };

        Scanner scanner = new Scanner(System.in);
        for (String[] q : questions) {
            askQuestion(q, scanner);
        }
        System.out.println("Your score: " + score + "/" + questions.length);
        scanner.close();
    }

    static void askQuestion(String[] q, Scanner scanner) {
        System.out.println(q[0]);
        for (int i = 1; i <= 4; i++) System.out.println(q[i]);

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("\nTime's up!");
                scanner.nextLine(); 
            }
        }, 10000); 

        System.out.print("Your answer (1-4): ");
        String answer = scanner.nextLine();
        timer.cancel();

        if (answer.equals(q[5])) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect! Correct answer: " + q[5]);
        }
    }
}
