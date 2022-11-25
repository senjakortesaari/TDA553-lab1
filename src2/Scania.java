package src2;

import java.awt.Color;

public class Scania extends Truck{
    int platform_angle;
    
    public Scania(int nrDoors, double enginePower, Color color, String modelName) {
        super(nrDoors, enginePower, color, "Scania");
        
        //TODO Auto-generated constructor stub
        
    }

    @Override
    protected double speedFactor() {
        return 0;
    }

    
    @Override
    public void flatbed_up() {
        if(platform_angle > 0){
            state_flatbed = true;
        } else {
            state_flatbed = false;
        }
    }

    public void increase_platform_angle(int degrees) {
        platform_angle += degrees;
    }

    public void decrease_platform_angle(int degrees) {
        platform_angle -= degrees;
    }
    
    public int get_platform_angle() {
        return platform_angle;
    }
}