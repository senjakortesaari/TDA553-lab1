package src2.exceptions;
import src2.*;

public class InvalidRangeForGasException extends Exception {
    static String errorMsg = "Only accepts range: ["+ Vehicle.minBrakeAmount+ ", "+ Vehicle.maxBrakeAmount + "]";;
    public InvalidRangeForGasException() {
        super(errorMsg);
    }
}