package hexlet.code;

import java.util.Scanner;

import static hexlet.code.games.Cli.greeting;

public class Engine {
    static int countCorrectAnswer = 0;
    public static void engine(Scanner scanner, String message, String[] questions, String[] correctAnswers) {
        String userName = greeting(scanner);
        System.out.println(message);

        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question: " + questions[i]);
            System.out.print("Your answer: ");
            String answer = scanner.next();

            if (answer.equals(correctAnswers[i])) {
                countCorrectAnswer++;
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswers[i] + "'.");
                i = questions.length;
            }
        }

        if (countCorrectAnswer == questions.length) {
            System.out.println("Congratulations, " + userName + "!");
        } else {
            System.out.println("Let's try again, " + userName + "!");
        }
    }
}
