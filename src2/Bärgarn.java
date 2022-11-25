package src2;

import java.awt.Color;

//(car transport)
public class Bärgarn extends Truck {
	

	public Bärgarn() {
		super(2, 150, Color.pink,"Bärgarn");
		
	}

	@Override
	protected double speedFactor() {
		//Decreases with heavier load
		return 0;
		
	}
}