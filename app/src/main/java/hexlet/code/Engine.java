package hexlet.code;

import hexlet.code.games.Game;

import java.util.Scanner;

public class Engine {
    static int countGame = 3;
    static int countCorrectAnswer = 0;
    static String userName;

    public static void play(Scanner scanner, Game game, String userName) {
        Engine.userName = userName;

        game.welcomeMassage();

        for (int i = 0; i < countGame; i++) {
            game.setRoundConditions();
            game.printConditions();

            boolean check = game.checkAnswer(scanner.next());

            if (check) {
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
