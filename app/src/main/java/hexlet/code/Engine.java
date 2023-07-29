package hexlet.code;

import hexlet.code.games.Game;

import java.util.Scanner;

public class Engine {
    static int countGame = 3;
    static int countCorrectAnswer = 0;
    public static void play(Scanner scanner, Game game, String userName) {
        game.welcomeMassage();

        for (int i = 0; i < countGame; i++) {
            game.setRoundConditions();
            game.printConditions();

            if (game.checkAnswer(scanner.next())) {
                countCorrectAnswer++;
            } else {
                i = countGame;
            }
        }
        if (countCorrectAnswer == countGame) {
            System.out.println("Congratulations, " + userName + "!");
        } else {
            System.out.println("Let's try again, " + userName + "!");
        }
    }
}
