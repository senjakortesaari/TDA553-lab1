package src2;
import java.awt.*;

abstract class Truck extends Vehicle{
    // Instansattribut:
    protected boolean state_flatbed; 
    

    // Constructors used to initialize different trucks
    public Truck(int nrDoors, double enginePower, Color color, String modelName){
        super(nrDoors, enginePower, color, modelName);
    }
    
    @Override
    public void move() {
        // TODO Auto-generated method stub
        super.move();
    }

    public boolean get_state_of_flatbed() {
        return state_flatbed;
    }

    public void flatbed_up() {
        state_flatbed = true;
    }
    
    public void flatbed_down() {
        state_flatbed = false;
    }

    public void stationary_condition() {
        if(state_flatbed 
    }
}