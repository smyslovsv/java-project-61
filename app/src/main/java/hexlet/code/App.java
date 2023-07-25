package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Cli.greeting;
import static hexlet.code.Even.even;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n0 - Exit");
        System.out.print("Your choice: ");
        String numberGame = scanner.next();
        String userName;

        System.out.println("Welcome to the Brain Games!");
        if (Integer.parseInt(numberGame) == 1) {
            userName = greeting(scanner);
        } else if (Integer.parseInt(numberGame) == 2) {
            userName = greeting(scanner);
            even(scanner, userName);
        }
        scanner.close();
    }
}
