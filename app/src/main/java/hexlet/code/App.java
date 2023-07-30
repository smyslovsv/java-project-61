package hexlet.code;

import hexlet.code.games.Cli;
import hexlet.code.games.Progression;
import hexlet.code.games.Gcd;
import hexlet.code.games.Calc;
import hexlet.code.games.Prime;
import hexlet.code.games.Even;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
        System.out.print("Your choice: ");
        String numberGame = scanner.next();
        System.out.print("\n");

        if (Integer.parseInt(numberGame) == 0) {
            return;
        }
        System.out.println("Welcome to the Brain Games!");

        switch (Integer.parseInt(numberGame)) {
            case (1) -> Cli.greeting(scanner);
            case (2) -> Even.even(scanner);
            case (3) -> Calc.calc(scanner);
            case (4) -> Gcd.gcd(scanner);
            case (5) -> Progression.progression(scanner);
            case (6) -> Prime.prime(scanner);
            default -> System.out.println("Wrong variant");
        }
        scanner.close();
    }
}
