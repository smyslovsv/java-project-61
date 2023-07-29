package hexlet.code.games;

import java.util.Random;

public class Calc implements Game {
    static int upperRange = 10;
    static int firstOperand = 0;
    static int secondOperand = 0;
    static int indexOperation = 0;
    static String[] typeOperation = {"+", "-", "*"};
    static int correctAnswer = 0;

    @Override
    public void welcomeMassage() {
        System.out.println("What is the result of the expression?");
    }

    @Override
    public void setRoundConditions() {
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

    @Override
    public void printConditions() {
        System.out.println("Question: " + firstOperand + " "
                + typeOperation[indexOperation] + " " + secondOperand);
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
}
