package src2;

import java.awt.Color;
import java.util.ArrayList;

//(car transport)
public class Bärgarn extends Truck {
	private ArrayList<Car> loadedCars = new ArrayList<Car>();
	private int loadCapacity;
	
	public ArrayList<Car> getLoadedCars() {
		return loadedCars;
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
		if(state_flatbed == false && checkIfCarIsClose(car, this) && loadedCars.size() < loadCapacity) {
			loadedCars.add(car);
			
			System.out.println(loadedCars.size());
			System.out.println("apapapapappa");
		}
		
		// Add so that if a car is loaded into a Bärgarn, it cannot be loaded into another Bärgarn
		
	}

	public void unload(Car car){
		double amount = 3;
		double offsetX = this.getX() + amount;
		double offsetY = this.getY() + amount;

		if(state_flatbed == false && loadedCars.size() >=1) {
			loadedCars.remove(car);
			
			//set new coordinates for car range: 3
			car.setX(offsetX);
			car.setY(offsetY);
		}
	}
}