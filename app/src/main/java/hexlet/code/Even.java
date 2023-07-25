package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Even {
    static int upperRange = 100;
    static int countGame = 3;

    static boolean even(Scanner scanner, String userName) {
        Random random = new Random();
        int curValue;
        String answer;
        int countCorrectAnswer = 0;

        System.out.print("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (int i = 0; i < countGame; i++) {
            curValue = random.nextInt(upperRange);
            System.out.println("Question: " + curValue);
            System.out.print("Your answer: ");
            answer = scanner.next();

            switch (answer) {
                case "yes" -> {
                    if (curValue % 2 == 0) {
                        countCorrectAnswer++;
                        System.out.println("Correct!");
                    } else {
                        System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                        i = countGame;
                    }
                }
                case  "no" -> {
                    if (curValue % 2 == 1) {
                        countCorrectAnswer++;
                        System.out.println("Correct!");
                    } else {
                        System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
                        i = countGame;
                    }
                }
                default -> {
                    System.out.print("'" + answer + "' is wrong answer ;(. Correct answer was ");
                    if (curValue % 2 == 0) {
                        System.out.println("'yes'.");
                    } else {
                        System.out.println("'no'.");
                    }
                    i = countGame;
                }
            }

        }
        if (countCorrectAnswer == countGame) {
            System.out.println("Congratulations, " + userName + "!");
        } else {
            System.out.println("Let's try again, " + userName + "!");
        }

        return true;
    }
}
