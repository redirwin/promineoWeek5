package assignment;

public class Assignment {
    
    static AsteriskLogger asteriskLogger = new AsteriskLogger();

    public static void main(String[] args) {

        asteriskLogger.Log("Hello");
        asteriskLogger.Error("Hello");

        
    }
}