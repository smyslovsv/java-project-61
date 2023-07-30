package hexlet.code;

import hexlet.code.games.Game;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;

import java.util.Scanner;

import static hexlet.code.Engine.play;
import static hexlet.code.games.Cli.greeting;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n0 - Exit");
        System.out.print("Your choice: ");
        String numberGame = scanner.next();
        System.out.print("\n");

        if (Integer.parseInt(numberGame) == 0) {
            scanner.close();
            return;
        }
        System.out.println("Welcome to the Brain Games!");

        Game game = null;
        switch (Integer.parseInt(numberGame)) {
            case (1) -> greeting(scanner);
            case (2) -> game = new Even();
            case (3) -> game = new Calc();
            case (4) -> game = new Gcd();
            case (5) -> game = new Progression();
            default -> {
                System.out.println("Wrong variant");
                return;
            }
        }

        if (game != null) {
            String userName = greeting(scanner);
            play(scanner, game, userName);
        }
        scanner.close();
    }
}
