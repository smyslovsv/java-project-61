package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

import static hexlet.code.Engine.engine;

public class Even {
    static int upperRange = 100;
    static int correctAnswer = 0;
    static int countGame = 3;
    static String welcome = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    static String[] questions = {"", "", ""};
    static String[] correctAnswers = {"", "", ""};

    public static void even(Scanner scanner) {
        for (int i = 0; i < countGame; i++) {
            setRoundConditions();
            questions[i] = getCondition();
            correctAnswers[i] = checkAnswer();
        }
        engine(scanner, welcome, questions, correctAnswers);
    }

    public static void setRoundConditions() {
        Random random = new Random();
        correctAnswer = random.nextInt(upperRange);
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
