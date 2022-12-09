package src2;

import java.awt.Color;
import java.util.ArrayList;

//(car transport)
public class Bärgarn extends Truck {
	private int loadCapacity;
	private LoadAndUnloadCars loadAndUnloadCars = new LoadAndUnloadCars();
	

	public Bärgarn(int loadCapacity) {
		super(2, 150, Color.pink,"Bärgarn");
		this.loadCapacity = loadCapacity;
	}

	@Override
	protected double speedFactor() {
		//Decreases with heavier load - could be a fun thing to add in the future :)
		return 1;
	}

	// If a xx of type.Car is close enough to Bärgarn, load car
	public void load(Car car) {
		if(getStateOfFlatbed() == true && getLoadedCars().size() < loadCapacity) {
			loadAndUnloadCars.load(car, this);
		}	
	}

	public void unload(Car car) {
		if(getStateOfFlatbed() == true && getLoadedCars().size() < loadCapacity) {
			loadAndUnloadCars.unload(car, this);
		}	
	}

	public ArrayList<Car> getLoadedCars() {
		return loadAndUnloadCars.getLoadedCars();
	}
}