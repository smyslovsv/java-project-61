package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

import static hexlet.code.Engine.engine;

public class Gcd {
    private static final int UPPER_RANGE = 100;
    private static final int COUNT_GAME = 3;
    private static final String WELCOME = "Find the greatest common divisor of given numbers.";
    private static int firstNumber = 0;
    private static int secondNumber = 0;
    private static int correctAnswer = 0;
    private static String[] questions = {"", "", ""};
    private static String[] correctAnswers = {"", "", ""};

    public static void gcd(Scanner scanner) {
        for (int i = 0; i < COUNT_GAME; i++) {
            setRoundConditions();
            questions[i] = getCondition();
            correctAnswers[i] = String.valueOf(correctAnswer);
        }
        engine(scanner, WELCOME, questions, correctAnswers);
    }

    private static void setRoundConditions() {
        Random random = new Random();
        firstNumber = random.nextInt(UPPER_RANGE);
        secondNumber = random.nextInt(UPPER_RANGE);

        correctAnswer = gcdByEuclidsAlgorithm(firstNumber, secondNumber);
    }

    private static String getCondition() {
        return firstNumber + " " + secondNumber;
    }

    private static int gcdByEuclidsAlgorithm(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcdByEuclidsAlgorithm(n2, n1 % n2);
    }
}
