package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

import static hexlet.code.Engine.engine;

public class Progression {
    private static final int COUNT_ELEMENTS = 10;
    private static final int UPPER_RANGE = 10;
    private static final int COUNT_GAME = 3;
    private static int firstElement = 0;
    private static int deltaElements = 0;
    private static int indexElement = 0;
    private static String[] questions = {"", "", ""};
    private static String[] correctAnswers = {"", "", ""};

    public static void progression(Scanner scanner) {
        for (int i = 0; i < COUNT_GAME; i++) {
            setRoundConditions();
            questions[i] = getCondition();
            correctAnswers[i] = String.valueOf(firstElement + indexElement * deltaElements);
        }
        String welcome = "What number is missing in the progression?";
        engine(scanner, welcome, questions, correctAnswers);
    }
    public static void setRoundConditions() {
        Random random = new Random();
        firstElement = random.nextInt(UPPER_RANGE);
        indexElement = random.nextInt(COUNT_ELEMENTS);
        deltaElements = random.nextInt(UPPER_RANGE);
    }

    public static String getCondition() {
        StringBuilder condition = new StringBuilder();
        for (int i = 0; i < COUNT_ELEMENTS; i++) {
            if (i != indexElement) {
                condition.append((firstElement + i * deltaElements)).append(" ");
            } else {
                condition.append(".. ");
            }
        }
        return condition.toString();
    }
}
