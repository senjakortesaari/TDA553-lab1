package src;

public class InvalidRangeForGasException extends Exception {
    static String errorMsg = "Only accepts range: ["+ Car.minBrakeAmount+ ", "+ Car.maxBrakeAmount + "]";;
    public InvalidRangeForGasException() {
        super(errorMsg);
    }
    
}
