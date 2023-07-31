package hexlet.code.games;

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

import static hexlet.code.Engine.engine;

public class Prime {
    private static final int UPPER_RANGE = 100;
    private static final int COUNT_GAME = 3;
    private static final String WELCOME = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static int number = 0;
    private static String[] questions = {"", "", ""};
    private static String[] correctAnswers = {"", "", ""};

    public static void prime(Scanner scanner) {
        for (int i = 0; i < COUNT_GAME; i++) {
            setRoundConditions();
            questions[i] = getCondition();
            correctAnswers[i] = checkAnswer();
        }
        engine(scanner, WELCOME, questions, correctAnswers);
    }

    private static void setRoundConditions() {
        Random random = new Random();
        number = random.nextInt(UPPER_RANGE);
    }

    private static String getCondition() {
        return String.valueOf(number);
    }

    private static String checkAnswer() {
        BigInteger bigInteger = BigInteger.valueOf(number);
        boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(number));

        if (probablePrime) {
            return "yes";
        } else {
            return "no";
        }
    }
}
