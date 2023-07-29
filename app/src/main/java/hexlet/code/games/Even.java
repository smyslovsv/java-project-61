package hexlet.code.games;

import java.util.Random;

public class Even implements Game {
    static int upperRange = 100;
    static int correctAnswer = 0;

    @Override
    public void welcomeMassage() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
    }

    @Override
    public void setRoundConditions() {
        Random random = new Random();
        correctAnswer = random.nextInt(upperRange);
    }

    @Override
    public void printConditions() {
        System.out.println("Question: " + correctAnswer);
        System.out.print("Your answer: ");
    }

    @Override
    public boolean checkAnswer(String answer) {
        switch (answer) {
            case "yes" -> {
                if (correctAnswer % 2 == 0) {
                    System.out.println("Correct!");
                    return true;
                } else {
                    System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                    return false;
                }
            }
            case  "no" -> {
                if (correctAnswer % 2 == 1) {
                    System.out.println("Correct!");
                    return true;
                } else {
                    System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
                    return false;
                }
            }
            default -> {
                System.out.print("'" + answer + "' is wrong answer ;(. Correct answer was ");
                if (correctAnswer % 2 == 0) {
                    System.out.println("'yes'.");
                } else {
                    System.out.println("'no'.");
                }
                return false;
            }
        }
    }
}
