package src2.exceptions;

/**
 * FlatbedOpenException - can't drive when flatbed is open
 */
public class FlatbedUpException extends Exception {
    static String errorMsg = "Flatbed is up, please close it before you drive way little one";
    public FlatbedUpException() {
        super(errorMsg);
    }
}