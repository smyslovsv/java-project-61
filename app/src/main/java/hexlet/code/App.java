package hexlet.code;

import java.util.Scanner;

import static hexlet.code.games.Calc.calc;
import static hexlet.code.games.Cli.greeting;
import static hexlet.code.games.Even.even;
import static hexlet.code.games.Gcd.gcd;
import static hexlet.code.games.Prime.prime;
import static hexlet.code.games.Progression.progression;

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
            case (1) -> greeting(scanner);
            case (2) -> even(scanner);
            case (3) -> calc(scanner);
            case (4) -> gcd(scanner);
            case (5) -> progression(scanner);
            case (6) -> prime(scanner);
            default -> System.out.println("Wrong variant");
        }
        scanner.close();
    }
}
