package src2.model;
import java.awt.Color;

public class Scania extends Truck {
    int platformAngle;
    
    public Scania() {
        super(2, 125, Color.yellow, "Scania");
    }

	@Override
    protected double speedFactor() {
        //Decreases with heavier load is something to implement for fun
        return 1;
    }
    
    // Determines whether flatbed is up 
    @Override
    public void flatbedIsBeingUsed() {
        checkIfTryingToUseFlatbedWhilstMoving(); 
        if(conditionsThatNeedToBeMetInOrderForPlatformToBeConsideredOpen() == true) {
            setStateOfFlatbed(true);
        } else {
            setStateOfFlatbed(false);
        }
    }
    public boolean conditionsThatNeedToBeMetInOrderForPlatformToBeConsideredOpen() {
         if(platformAngle > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void increasePlatformAngle(int degrees) {
        if(platformAngle > 70) {
            throw new IllegalArgumentException("Valid range: [0, 70]"); 
        }
        platformAngle = Math.min(platformAngle + degrees, 70);
        setStateOfFlatbed(true);
    }

    public void decrease_platform_angle(int degrees) {
        if(platformAngle < 0) {
            throw new IllegalArgumentException("Valid range: [0, 70]");
        }
        
        platformAngle = Math.max(platformAngle - degrees, 0);
    }
    
    public int getPlatformAngle() {
        return platformAngle;
    }
}