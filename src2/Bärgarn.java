package src2;

import java.awt.Color;

//(car transport)
public class Bärgarn extends Truck {
	Ramp ramp;

	public Bärgarn(int nrDoors, double enginePower, Color color, String modelName) {
		super(nrDoors, enginePower, color,"Bärgarn");
		this.ramp = new Ramp();
		//TODO Auto-generated constructor stub
	}

	@Override
	protected double speedFactor() {
		// TODO Auto-generated method stub
		return 0;
	}
    public void rampUp() {
		ramp.up();
	}


	public void rampDown() {
		ramp.down(); 

	}
	

}
// car transporter kan ha en metod som heter car.load som funkar om flatbed.down == true