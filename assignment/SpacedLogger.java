package assignment;
 
public class SpacedLogger implements Logger{

    @Override
    public void Log(String myString) {
        System.out.println("\n" + addSpaces(myString));

    }

    @Override
    public void Error(String myString) {
        System.out.println("\nERROR: " + addSpaces(myString));

    }

    private String addSpaces(String myString) {
        String newString = "";
        for (int i = 0; i < myString.length(); i++) {
            newString += myString.charAt(i) + " ";
        }
        return newString;
    }

    
}