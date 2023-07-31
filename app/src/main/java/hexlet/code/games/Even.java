package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

import static hexlet.code.Engine.engine;

public class Even {
    private static final int UPPER_RANGE = 100;
    private static final int COUNT_GAME = 3;
    private static int correctAnswer = 0;
    private static final String WELCOME = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static String[] questions = {"", "", ""};
    private static String[] correctAnswers = {"", "", ""};

    public static void even(Scanner scanner) {
        for (int i = 0; i < COUNT_GAME; i++) {
            setRoundConditions();
            questions[i] = getCondition();
            correctAnswers[i] = checkAnswer();
        }
        engine(scanner, WELCOME, questions, correctAnswers);
    }

    public static void setRoundConditions() {
        Random random = new Random();
        correctAnswer = random.nextInt(UPPER_RANGE);
    }

    public static String getCondition() {
        return String.valueOf(correctAnswer);
    }

    public static String checkAnswer() {
        if (correctAnswer % 2 == 0) {
            return "yes";
        } else {
            return "no";
        }
    }
}
