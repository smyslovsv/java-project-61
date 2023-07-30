package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

import static hexlet.code.Engine.engine;

public class Progression {
    static int upperRange = 10;
    static int firstElement = 0;
    static int countElements = 10;
    static int deltaElements = 0;
    static int indexElement = 0;
    static int correctAnswer = 0;

    static int countGame = 3;
    static String welcome = "What number is missing in the progression?";
    static String[] questions = {"", "", ""};
    static String[] correctAnswers = {"", "", ""};

    public static void progression(Scanner scanner) {
        for (int i = 0; i < countGame; i++) {
            setRoundConditions();
            questions[i] = getCondition();
            correctAnswers[i] = String.valueOf(firstElement + indexElement * deltaElements);
        }
        engine(scanner, welcome, questions, correctAnswers);
    }
    public static void setRoundConditions() {
        Random random = new Random();
        firstElement = random.nextInt(upperRange);
        indexElement = random.nextInt(countElements);
        deltaElements = random.nextInt(upperRange);

        correctAnswer = firstElement + indexElement * deltaElements;
    }

    public static String getCondition() {
        StringBuilder condition = new StringBuilder();
        for (int i = 0; i < countElements; i++) {
            if (i != indexElement) {
                condition.append((firstElement + i * deltaElements)).append(" ");
            } else {
                condition.append(".. ");
            }
        }
        return condition.toString();
    }
}
