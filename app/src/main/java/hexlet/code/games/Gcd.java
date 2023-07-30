package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

import static hexlet.code.Engine.engine;

public class Gcd {
    static int upperRange = 100;
    static int firstNumber = 0;
    static int secondNumber = 0;
    static int correctAnswer = 0;
    static int countGame = 3;
    static String welcome = "Find the greatest common divisor of given numbers.";
    static String[] questions = {"", "", ""};
    static String[] correctAnswers = {"", "", ""};

    public static void gcd(Scanner scanner) {
        for (int i = 0; i < countGame; i++) {
            setRoundConditions();
            questions[i] = getCondition();
            correctAnswers[i] = String.valueOf(correctAnswer);
        }
        engine(scanner, welcome, questions, correctAnswers);
    }

    public static void setRoundConditions() {
        Random random = new Random();
        firstNumber = random.nextInt(upperRange);
        secondNumber = random.nextInt(upperRange);

        correctAnswer = gcdByEuclidsAlgorithm(firstNumber, secondNumber);
    }

    public static String getCondition() {
        return firstNumber + " " + secondNumber;
    }

    static int gcdByEuclidsAlgorithm(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcdByEuclidsAlgorithm(n2, n1 % n2);
    }
}
