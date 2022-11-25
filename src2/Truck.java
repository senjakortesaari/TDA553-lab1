package src2;
import java.awt.*;

import src2.exceptions.FlatbedException;

abstract class Truck extends Vehicle {
    // Instansattribut:
    private boolean state_flatbed; 
    

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
            Double currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount, getEnginePower());
            setCurrentSpeed(currentSpeed);
        }
    }

    public void WhileMoving() {
        if(getCurrentSpeed() > 0){
            flatbedDown();
        }
    }
    
    public boolean getStateOfFlatbed() {
        return state_flatbed;
    }

    public void setStateOfFlatbed(boolean bool){
        state_flatbed = bool;
    }

    public void flatbed_up() {
        cannotUseFlatbedWhilstDriving();
        state_flatbed = true;
    }

    public void cannotUseFlatbedWhilstDriving() {
        if(getCurrentSpeed() > 0) { // create method out of this, called cannotUseFlatbedWhilstDriving
            try {
                flatbedException(); 
            } catch (FlatbedException e) {
                System.out.println("DIIIIIIN MAAAAAAMMMMMAAAAAAAA");
            }
        }
    }
    
    public void flatbedDown() {
        state_flatbed = false;
    }

    protected void flatbedException() throws FlatbedException{
        throw new FlatbedException();
    }
}