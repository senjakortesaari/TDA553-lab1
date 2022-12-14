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
                    System.out.println("AYYYYYYYY");
                }
                // do down below if conditions are met
                
                }
        // if(getStateOfFlatbed() == false) {
        //     // Gas interval:
        //     if(amount < minGasAmount || amount > maxGasAmount) {
        //         throw new InvalidRangeForGasException();
        //     } else {
        //         Double currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount, getEnginePower());
        //         setCurrentSpeed(currentSpeed);
        //         }
        //     } 
        // else {
        //     //  exceptions
        //     System.out.println("Stanna smarthead");
        // }
        // if(get_stateEngine()) {
        //     if(amount < minGasAmount || amount > maxGasAmount) {
        //     throw new InvalidRangeForGasException();
        // } else { 
        //     if(getStateOfFlatbed()) {
        //     try {
        //         flatbedException();
        //     } catch (FlatbedException e) {
        //         System.out.println("Cannot drive while flatbed is in use!");
        //     }
        // } else {
        //     Double currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount, getEnginePower());
        //     setCurrentSpeed(currentSpeed);
        // }  
        // }
        // }
    }

    public void WhileMoving() {
        if(getCurrentSpeed() > 0) {
            flatbedNotInUse();
        }
    }
    
    public boolean getStateOfFlatbed() {
        return stateOfFlatbed;
    }

    public void setStateOfFlatbed(boolean bool) {
        stateOfFlatbed = bool;
    }

    public void flatbedIsBeingUsed() {
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
    
    public void flatbedNotInUse() {
        stateOfFlatbed = false;
    }

    protected void flatbedException() throws FlatbedException {
        throw new FlatbedException();
    }
}