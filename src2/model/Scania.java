package src2.model;
import java.awt.Color;

public class Scania extends Truck {
    int platformAngle;
    
    public Scania() {
        super(2, 125, Color.yellow, "Scania");
    }

	@Override
    protected double speedFactor() {
        //Decreases with heavier load could be something to implement for fun - in the future
        return 1;
    }
    
    // Determines whether flatbed is being used 
    @Override
    public void useFlatbed() {
        // Flatbed is considered in use if the angle is greater than zero degrees
         if(platformAngle > 0) {
            setStateOfFlatbed(true);
        } else {
            setStateOfFlatbed(false);
        }
    } 

    public void increasePlatformAngle(int degrees)  {
        // Check if argument is valid
        if(platformAngle > 70) {
            throw new IllegalArgumentException("Valid range: [0, 70]"); 
        }
        // Failsafe - shouldn't be able to access flatbed while moving
        if(getCurrentSpeed() == 0) {
            platformAngle = Math.min(platformAngle + degrees, 70);
            setStateOfFlatbed(true);
        } else {
            throw new IllegalAccessError("Cannot access flatbed while moving");
        }   
    }

    public void decrease_platform_angle(int degrees) {
        // Check if argument is valid
        if(platformAngle < 0) {
            throw new IllegalArgumentException("Valid range: [0, 70]");
        }
        platformAngle = Math.max(platformAngle - degrees, 0);
    }
    
    public int getPlatformAngle() {
        return platformAngle;
    }
}
