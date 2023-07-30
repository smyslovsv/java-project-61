package hexlet.code.games;

import java.math.BigInteger;
import java.util.Random;

public class Prime implements Game {
    static int upperRange = 100;
    static int number = 0;
    @Override
    public void welcomeMassage() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }

    @Override
    public void setRoundConditions() {
        Random random = new Random();
        number = random.nextInt(upperRange);
    }

    @Override
    public void printConditions() {
        System.out.println("Question: " + number);
    }

    @Override
    public boolean checkAnswer(String answer) {
        BigInteger bigInteger = BigInteger.valueOf(number);
        boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(number));

        switch (answer) {
            case "yes" -> {
                if (probablePrime) {
                    System.out.println("Correct!");
                    return true;
                } else {
                    System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                    return false;
                }
            }
            case  "no" -> {
                if (!probablePrime) {
                    System.out.println("Correct!");
                    return true;
                } else {
                    System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
                    return false;
                }
            }
            default -> {
                System.out.print("'" + answer + "' is wrong answer ;(. Correct answer was ");
                if (probablePrime) {
                    System.out.println("'yes'.");
                } else {
                    System.out.println("'no'.");
                }
                return false;
            }
        }
    }
}
