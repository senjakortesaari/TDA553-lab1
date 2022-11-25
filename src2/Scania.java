package src2;

import java.awt.Color;

public class Scania extends Truck{
    int platform_angle;
    
    public Scania() {
        super(2, 200, Color.yellow, "Scania");
    }

	@Override
    protected double speedFactor() {
        //Decreases with heavier load
        return 0;
        
    }
    
    // Determines whether flatbed is up 
    @Override
    public void flatbed_up() {
        if(platform_angle > 0){
            state_flatbed = true;
        } else {
            state_flatbed = false;
        }
    }

    public void increase_platform_angle(int degrees) {
        if(platform_angle > 70) {
            throw new IllegalArgumentException("Valid range: [0, 70]"); // FIXA I FRAMTIDEN? - mer allmänt så att man inte ska behöva ändra stringen här
        }
        platform_angle = Math.min(platform_angle + degrees, 70);
    }

    public void decrease_platform_angle(int degrees) {
        if(platform_angle < 0) {
            throw new IllegalArgumentException("Valid range: [0, 70]");
        }
        platform_angle = Math.max(platform_angle - degrees, 0);
    }
    
    public int get_platform_angle() {
        return platform_angle;
    }

}