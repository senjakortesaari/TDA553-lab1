package src2;
import java.awt.*;

public class Truck extends Vehicle{
    

    public Truck(int nrDoors, double enginePower, Color color, String modelName){
        super(nrDoors, enginePower, color, modelName);
    }

	@Override
	protected double speedFactor() {
		// TODO Auto-generated method stub
		return 0;
	}
}