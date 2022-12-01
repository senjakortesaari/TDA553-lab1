package src2;
import java.awt.*;

public abstract class Car extends Vehicle{
    // Constructors used to initalize different cars
    public Car(int nrDoors, double enginePower, Color color, String modelName){ 
        super(nrDoors, enginePower, color, modelName);
    }
}
