package hexlet.code.games;

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

import static hexlet.code.Engine.engine;

public class Prime {
    static int upperRange = 100;
    static int number = 0;
    static int countGame = 3;
    static String welcome = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    static String[] questions = {"", "", ""};
    static String[] correctAnswers = {"", "", ""};

    public static void prime(Scanner scanner) {
        for (int i = 0; i < countGame; i++) {
            setRoundConditions();
            questions[i] = getCondition();
            correctAnswers[i] = checkAnswer();
        }
        engine(scanner, welcome, questions, correctAnswers);
    }

    public static void setRoundConditions() {
        Random random = new Random();
        number = random.nextInt(upperRange);
    }

    public static String getCondition() {
        return String.valueOf(number);
    }

    public static String checkAnswer() {
        BigInteger bigInteger = BigInteger.valueOf(number);
        boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(number));

        if (probablePrime) {
            return "yes";
        } else {
            return "no";
        }
    }
}
