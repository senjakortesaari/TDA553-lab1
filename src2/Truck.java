package src2;
import java.awt.*;

import src2.exceptions.FlatbedException;

abstract class Truck extends Vehicle {
    // Instansattribut:
    protected boolean state_flatbed; 
    

    // Constructors used to initialize different trucks
    public Truck(int nrDoors, double enginePower, Color color, String modelName) {
        super(nrDoors, enginePower, color, modelName);
    }
    
    @Override
    public void incrementSpeed(double amount){
        if(state_flatbed == true){
            try {
                flatbedException();
            } catch (FlatbedException e) {
                System.out.println("DIIIIN MAMMMMMAAAA");
            }
        
        } else {
            currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount, enginePower);
        }
    }

    public void WhileMoving() {
        if(currentSpeed > 0){
            flatbed_down();
        }
    }
    
    public boolean get_state_of_flatbed() {
        return state_flatbed;
    }

    public void flatbed_up() {
        cannotUseFlatbedWhilstDriving();
        state_flatbed = true;
    }

    public void cannotUseFlatbedWhilstDriving() {
        if(currentSpeed > 0) { // create method out of this, called cannotUseFlatbedWhilstDriving
            try {
                flatbedException(); 
            } catch (FlatbedException e) {
                System.out.println("DIIIIIIN MAAAAAAMMMMMAAAAAAAA");
            }
        }
    }
    
    public void flatbed_down() {
        state_flatbed = false;
    }

    protected void flatbedException() throws FlatbedException{
        throw new FlatbedException();
    }
}