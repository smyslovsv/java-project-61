package hexlet.code;

import hexlet.code.games.Game;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;

import java.util.Scanner;

import static hexlet.code.Engine.play;
import static hexlet.code.games.Cli.greeting;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n0 - Exit");
        System.out.print("Your choice: ");
        String numberGame = scanner.next();

        System.out.println("Welcome to the Brain Games!");

        if (Integer.parseInt(numberGame) == 1) {
            greeting(scanner);
        } else if (Integer.parseInt(numberGame) == 2) {
            String userName = greeting(scanner);
            Game game = new Even();
            play(scanner, game, userName);
        } else if (Integer.parseInt(numberGame) == 3) {
            String userName = greeting(scanner);
            Game game = new Calc();
            play(scanner, game, userName);
        }
        scanner.close();
    }
}
