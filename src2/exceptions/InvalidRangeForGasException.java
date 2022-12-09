package src2.exceptions;
import src2.*;
import src2.model.Vehicle;

public class InvalidRangeForGasException extends Exception {
    static String errorMsg = "Only accepts range: ["+ Vehicle.minBrakeAmount+ ", "+ Vehicle.maxBrakeAmount + "]";;
    public InvalidRangeForGasException() {
        super(errorMsg);
    }
}