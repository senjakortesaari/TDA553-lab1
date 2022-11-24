package src2;
import java.awt.*;

abstract class Car extends Vehicle{
    

    // Constructors used to initalize different cars
    public Car(int nrDoors, double enginePower, Color color, String modelName){ 
        super(nrDoors, enginePower, color, modelName);
    }

    //speed x index 0
    //speed y index 1
    // går man till höger -> nästa index i listan
    // går man till vänster -> föregående index i listan
}
