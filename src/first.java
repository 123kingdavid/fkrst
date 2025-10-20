
import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        // Initialize scanner for user input
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        
        // Array of questions
        String[] questions = {
            "What is the capital of France?\nA) London\nB) Paris\nC) Berlin\nD) Madrid",
            "Which planet is known as the Red Planet?\nA) Venus\nB) Mars\nC) Jupiter\nD) Saturn",
            "What is 2 + 2?\nA) 3\nB) 4\nC) 5\nD) 6"
        };
        
        // Array of correct answers
        char[] answers = {'B', 'B', 'B'};
        
        System.out.println("Welcome to the Java Quiz App!\n");
        
        // Loop through each question
        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ":");
            System.out.println(questions[i]);
            System.out.print("Your answer (A/B/C/D): ");
            
            // Get user's answer
            char userAnswer = Character.toUpperCase(scanner.next().charAt(0));
            
            // Check if answer is correct
            if (userAnswer == answers[i]) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong! The correct answer is " + answers[i] + "\n");
            }
        }
        
        // Display final score
        System.out.println("Quiz completed!");
        System.out.println("Your score: " + score + " out of " + questions.length);
        
        // Close scanner
        scanner.close();
    }
}
