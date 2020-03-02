package assignment;

import java.util.Scanner;

public class App {
    
    static AsteriskLogger asteriskLogger = new AsteriskLogger();
    static SpacedLogger spacedLogger = new SpacedLogger();

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter word to test: ");
        String testWord = scanner.nextLine();

        asteriskLogger.Log(testWord);
        asteriskLogger.Error(testWord);

        spacedLogger.Log(testWord);
        spacedLogger.Error(testWord);
                
    }
}