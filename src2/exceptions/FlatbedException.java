package src2.exceptions;

/**
 * FlatbedOpenException - can't drive when flatbed is open
 */
public class FlatbedException extends Exception{
    static String errorMsg = "Check your flatbed bitch!!";
    public FlatbedException() {
        super(errorMsg);
    }
}