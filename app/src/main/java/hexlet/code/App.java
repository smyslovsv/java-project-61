package hexlet.code;

import hexlet.code.games.Cli;
import hexlet.code.games.Progression;
import hexlet.code.games.Gcd;
import hexlet.code.games.Calc;
import hexlet.code.games.Prime;
import hexlet.code.games.Even;

import java.util.Scanner;

public class App {
    private static final int GREET = 1;
    private static final int EVEN = 2;
    private static final int CALC = 3;
    private static final int GCD = 4;
    private static final int PROGRESSION = 5;
    private static final int PRIME = 6;
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
            case (GREET) -> Cli.greeting(scanner);
            case (EVEN) -> Even.even(scanner);
            case (CALC) -> Calc.calc(scanner);
            case (GCD) -> Gcd.gcd(scanner);
            case (PROGRESSION) -> Progression.progression(scanner);
            case (PRIME) -> Prime.prime(scanner);
            default -> System.out.println("Wrong variant");
        }
        scanner.close();
    }
}
