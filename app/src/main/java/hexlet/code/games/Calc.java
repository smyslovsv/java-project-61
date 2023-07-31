package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

import static hexlet.code.Engine.engine;

public class Calc {
    private static final int UPPER_RANGE = 10;
    private static int firstOperand = 0;
    private static int secondOperand = 0;
    private static int indexOperation = 0;
    private static final String[] TYPE_OPERATION = {"+", "-", "*"};
    private static int correctAnswer = 0;
    private static final int COUNT_GAME = 3;
    private static final String WELCOME = "What is the result of the expression?";
    private static String[] questions = {"", "", ""};
    private static String[] correctAnswers = {"", "", ""};

    public static void calc(Scanner scanner) {
        for (int i = 0; i < COUNT_GAME; i++) {
            setRoundConditions();
            questions[i] = getCondition();
            correctAnswers[i] = String.valueOf(correctAnswer);
        }
        engine(scanner, WELCOME, questions, correctAnswers);
    }

    private static void setRoundConditions() {
        Random random = new Random();
        firstOperand = random.nextInt(UPPER_RANGE);
        secondOperand = random.nextInt(UPPER_RANGE);
        indexOperation = random.nextInt(TYPE_OPERATION.length);

        if (indexOperation == 0) {
            correctAnswer = firstOperand + secondOperand;
        } else if (indexOperation == 1) {
            correctAnswer = firstOperand - secondOperand;
        } else {
            correctAnswer = firstOperand * secondOperand;
        }
    }

    private static String getCondition() {
        return firstOperand + " " + TYPE_OPERATION[indexOperation] + " " + secondOperand;
    }
}
