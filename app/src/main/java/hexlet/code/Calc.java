package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    static int upperRange = 100;
    static int countGame = 3;
    public static void calculate(Scanner scanner, String userName) {
        Random random = new Random();
        int firstOperand;
        int secondOperand;
        String[] typeOperation = {"+", "-", "*"};
        int indexOperation;
        int expected;
        String actual;
        int countCorrectAnswer = 0;

        System.out.println("What is the result of the expression?");

        for (int i = 0; i < countGame; i++) {
            firstOperand = random.nextInt(upperRange);
            secondOperand = random.nextInt(upperRange);
            indexOperation = random.nextInt(typeOperation.length);
            System.out.println("Question: " + firstOperand + " "
                    + typeOperation[indexOperation] + " " + secondOperand);

            if (indexOperation == 0) {
                expected = firstOperand + secondOperand;
            } else if (indexOperation == 1) {
                expected = firstOperand - secondOperand;
            } else {
                expected = firstOperand * secondOperand;
            }

            System.out.print("Your answer: ");
            actual = scanner.next();

            if (Integer.parseInt(actual) == expected) {
                System.out.println("Correct!");
                countCorrectAnswer++;
            } else {
                System.out.println("'" + actual + "' is wrong answer ;(. Correct answer was " + expected + "'.");
                i = countGame;
            }
        }
        if (countCorrectAnswer == countGame) {
            System.out.println("Congratulations, " + userName + "!");
        } else {
            System.out.println("Let's try again, " + userName + "!");
        }
    }
}
