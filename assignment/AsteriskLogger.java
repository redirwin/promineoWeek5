package assignment;

public class AsteriskLogger implements Logger {

    @Override
    public void Log(String myString) {
        System.out.println("\n***" + myString + "***\n");

    }

    @Override
    public void Error(String myString) {
        printAsterisks(myString.length() + 13);
        System.out.println("\n\n***Error: " + myString + "***\n");
        printAsterisks(myString.length() + 13); 

    }

    private void printAsterisks(int length) {
        for (int i = 0; i < length; i++){
            System.out.print("*");
        }
    }

}