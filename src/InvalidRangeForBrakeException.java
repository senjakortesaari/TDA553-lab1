package src;

public class InvalidRangeForBrakeException extends Exception {
    static String errorMsg = "Only accepts range: [0, 1]";
    public InvalidRangeForBrakeException() {
        super(errorMsg);
    }
    
}
