package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

import static hexlet.code.Engine.engine;

public class Calc {
    static int upperRange = 10;
    static int firstOperand = 0;
    static int secondOperand = 0;
    static int indexOperation = 0;
    static String[] typeOperation = {"+", "-", "*"};
    static int correctAnswer = 0;
    static int countGame = 3;
    static String welcome = "What is the result of the expression?";
    static String[] questions = {"", "", ""};
    static String[] correctAnswers = {"", "", ""};

    public static void calc(Scanner scanner) {
        for (int i = 0; i < countGame; i++) {
            setRoundConditions();
            questions[i] = getCondition();
            correctAnswers[i] = String.valueOf(correctAnswer);
        }
        engine(scanner, welcome, questions, correctAnswers);
    }

    public static void setRoundConditions() {
        Random random = new Random();
        firstOperand = random.nextInt(upperRange);
        secondOperand = random.nextInt(upperRange);
        indexOperation = random.nextInt(typeOperation.length);

        if (indexOperation == 0) {
            correctAnswer = firstOperand + secondOperand;
        } else if (indexOperation == 1) {
            correctAnswer = firstOperand - secondOperand;
        } else {
            correctAnswer = firstOperand * secondOperand;
        }
    }

    public static String getCondition() {
        return firstOperand + " " + typeOperation[indexOperation] + " " + secondOperand;
    }
}
