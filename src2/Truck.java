package src2;
import java.awt.*;
import src2.exceptions.*;

abstract class Truck extends Vehicle {
    // Instansattribut:
    private boolean state_flatbed; 

    // Constructors used to initialize different trucks
    public Truck(int nrDoors, double enginePower, Color color, String modelName) {
        super(nrDoors, enginePower, color, modelName);
    }
    

    @Override
    public void gas(double amount) throws InvalidRangeForGasException{
        if(get_stateEngine()) {
            if(amount < minGasAmount || amount > maxGasAmount) {
            throw new InvalidRangeForGasException();
        } else { 
            if(getStateOfFlatbed()) {
            try {
                flatbedException();
            } catch (FlatbedException e) {
                System.out.println("Cannot drive while flatbed is in use!");
            }
        } else {
            Double currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount, getEnginePower());
            setCurrentSpeed(currentSpeed);
        }  
        }
        }
    }

    public void WhileMoving() {
        if(getCurrentSpeed() > 0) {
            flatbed_not_in_use();
        }
    }
    
    public boolean getStateOfFlatbed() {
        return state_flatbed;
    }

    public void setStateOfFlatbed(boolean bool) {
        state_flatbed = bool;
    }

    public void flatbed_in_use() {
        checkIfTryingToUseFlatbedWhilstMoving();
        setStateOfFlatbed(true);
    }

    public void checkIfTryingToUseFlatbedWhilstMoving() {
        if(getCurrentSpeed() > 0) { 
            try {
                flatbedException(); 
            } catch (FlatbedException e) {
                System.out.println("Cannot use the flatbed while driving!");
            }
        }
    }
    
    public void flatbed_not_in_use() {
        state_flatbed = false;
    }

    protected void flatbedException() throws FlatbedException {
        throw new FlatbedException();
    }
}