package src2.model;
import java.awt.*;

public abstract class Car extends Vehicle {
    // Constructor used to initalize different cars
    public Car(int nrDoors, double enginePower, Color color, String modelName) { 
        super(nrDoors, enginePower, color, modelName);
    }
}