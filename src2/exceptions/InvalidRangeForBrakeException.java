package src2.exceptions;
import src2.model.Vehicle;

public class InvalidRangeForBrakeException extends Exception {
    static String errorMsg = "Only accepts range: ["+ Vehicle.minGasAmount+ ", "+ Vehicle.maxGasAmount + "]";
    public InvalidRangeForBrakeException() {
        super(errorMsg);
    }
}