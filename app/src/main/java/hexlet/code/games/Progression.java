package hexlet.code.games;

import java.util.Random;

public class Progression implements Game {
    static int upperRange = 10;
    static int firstElement = 0;
    static int countElements = 10;
    static int deltaElements = 0;
    static int indexElement = 0;
    static int correctAnswer = 0;
    @Override
    public void welcomeMassage() {
        System.out.println("What number is missing in the progression?");
    }

    @Override
    public void setRoundConditions() {
        Random random = new Random();
        firstElement = random.nextInt(upperRange);
        indexElement = random.nextInt(countElements);
        deltaElements = random.nextInt(upperRange);

        correctAnswer = firstElement + indexElement * deltaElements;
    }

    @Override
    public void printConditions() {
        for (int i = 0; i < countElements; i++) {
            if (i != indexElement) {
                System.out.print((firstElement + i * deltaElements) + " ");
            } else {
                System.out.print(".. ");
            }
        }
        System.out.print("\n");
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
