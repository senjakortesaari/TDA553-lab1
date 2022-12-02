package src2;

import java.awt.Color;
import java.util.ArrayList;

//(car transport)
public class Bärgarn extends Truck {
	private int loadCapacity;
	private LoadAndUnloadCars loadAndUnloadCars = new LoadAndUnloadCars();
	
	public ArrayList<Car> getLoadedCars() {
		return loadAndUnloadCars.getLoadedCars();
	}

	boolean state_flatbed = getStateOfFlatbed();

	public Bärgarn(int loadCapacity){
		super(2, 150, Color.pink,"Bärgarn");
		this.loadCapacity = loadCapacity;
	}

	@Override
	protected double speedFactor(){
		//Decreases with heavier load
		return 0;
	}

	// If a xx of type.Car is close enough to Bärgarn, LoadCar()
	public void load(Car car){
		if(state_flatbed == false && getLoadedCars().size() < loadCapacity) {
			loadAndUnloadCars.load(car, this);
		}	
	}

	public void unload(Car car){
		if(state_flatbed == false && getLoadedCars().size() < loadCapacity) {
			loadAndUnloadCars.unload(car, this);
		}	
	}
}