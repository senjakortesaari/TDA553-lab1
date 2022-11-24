package src;

public class InvalidRangeForBrakeException extends Exception {
    static String errorMsg = "Only accepts range: ["+ Car.minGasAmount+ ", "+ Car.maxGasAmount + "]";
    public InvalidRangeForBrakeException() {
        super(errorMsg);
    }
    
}
