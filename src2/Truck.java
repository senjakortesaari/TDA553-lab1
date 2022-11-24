package src2;
import java.awt.*;

abstract class Truck extends Vehicle{
    // Instanattribut:
    

    // Constructors used to initalize different trucks
    public Truck(int nrDoors, double enginePower, Color color, String modelName){
        super(nrDoors, enginePower, color, modelName);
        
    }
}