package src2.model;
import java.awt.*;

import src2.exceptions.*;

abstract class Truck extends Vehicle {
    // Instansattribut:
    private boolean stateOfFlatbed = false; 

    // Constructors used to initialize different trucks
    public Truck(int nrDoors, double enginePower, Color color, String modelName) {
        super(nrDoors, enginePower, color, modelName);
    }
    

    @Override // TODO: Skriv om hela den här!!!
    public void gas(double amount) throws InvalidRangeForGasException{
        if(amount < minGasAmount || amount > maxGasAmount) {
                throw new InvalidRangeForGasException();
            } else {
                if(getStateOfFlatbed() == false) {
                    Double currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount, getEnginePower());
                    setCurrentSpeed(currentSpeed);
                } else {
                    throw new IllegalStateException("Cannot drive while flatbed is being used!");
                }
            }
    }
    
    public boolean getStateOfFlatbed() {
        return stateOfFlatbed;
    }

    public void setStateOfFlatbed(boolean bool) {
        stateOfFlatbed = bool;
    }

    public void useFlatbed() {
        // Failsafe - shouldn't be able to access flatbed while moving
        if(getCurrentSpeed() == 0) {
            setStateOfFlatbed(true);
        } else {
            throw new IllegalAccessError("Cannot access flatbed while moving");
        }
    }
    
    public void stopUsingFlatbed() {
        stateOfFlatbed = false;
    }

    protected void flatbedException() throws FlatbedException {
        throw new FlatbedException();
    }
}
