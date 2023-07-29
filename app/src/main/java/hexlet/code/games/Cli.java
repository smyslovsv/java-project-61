package hexlet.code.games;

import java.util.Scanner;

public class Cli {

    public static String greeting(Scanner scanner) {

        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        return userName;
    }
}
