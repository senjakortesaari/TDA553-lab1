package src2;

import java.awt.Color;

//(car transport)
public class Bärgarn extends Truck {
	

	public Bärgarn(int nrDoors, double enginePower, Color color, String modelName) {
		super(nrDoors, enginePower, color,"Bärgarn");
		
		//TODO Auto-generated constructor stub
	}

	@Override
	protected double speedFactor() {
		// TODO Auto-generated method stub
		return 0;
	}
}