package hexlet.code;

import java.util.Scanner;

public class Cli {

    static String greeting(Scanner scanner) {

        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        return userName;
    }
}
