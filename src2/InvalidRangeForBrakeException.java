package src2;

public class InvalidRangeForBrakeException extends Exception {
    static String errorMsg = "Only accepts range: ["+ Car.minGasAmount+ ", "+ Car.maxGasAmount + "]";
    public InvalidRangeForBrakeException() {
        super(errorMsg);
    }
    
}
