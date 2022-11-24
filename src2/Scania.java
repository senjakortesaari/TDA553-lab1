package src2;

import java.awt.Color;

public class Scania extends Truck{
    Platform platform = new Platform();
    
    
    public Scania(int nrDoors, double enginePower, Color color, String modelName) {
        super(nrDoors, enginePower, color, "Scania");
        this.platform = new Platform();
        //TODO Auto-generated constructor stub
        
    }

    @Override
    protected double speedFactor() {
        // TODO Auto-generated method stub
        return 0;
    }

    public void platformUp() {
        platform.up();
    }
    
    public void platformDown(){
        platform.down();
    }
    
}