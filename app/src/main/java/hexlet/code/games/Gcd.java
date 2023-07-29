package hexlet.code.games;

import java.util.Random;

public class Gcd implements Game {
    static int upperRange = 100;
    static int firstNumber = 0;
    static int secondNumber = 0;
    static int correctAnswer = 0;

    @Override
    public void welcomeMassage() {
        System.out.println("Find the greatest common divisor of given numbers.");
    }

    @Override
    public void setRoundConditions() {
        Random random = new Random();
        firstNumber = random.nextInt(upperRange);
        secondNumber = random.nextInt(upperRange);

        correctAnswer = gcdByEuclidsAlgorithm(firstNumber, secondNumber);
    }

    @Override
    public void printConditions() {
        System.out.println("Question: " + firstNumber + " " + secondNumber);
        System.out.println(correctAnswer);
    }

    @Override
    public boolean checkAnswer(String answer) {
        if (Integer.parseInt(answer) == correctAnswer) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was " + correctAnswer + "'.");
            return false;
        }
    }

    int gcdByEuclidsAlgorithm(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcdByEuclidsAlgorithm(n2, n1 % n2);
    }
}
