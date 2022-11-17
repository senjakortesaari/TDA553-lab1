package src;

public class InvalidRangeForGasException extends Exception {
    static String errorMsg = "Only accepts range: [0, 1]";
    public InvalidRangeForGasException() {
        super(errorMsg);
    }
    
}
