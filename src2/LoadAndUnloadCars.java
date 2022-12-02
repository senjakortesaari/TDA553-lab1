package src2;

import java.util.ArrayList;

/**
 * LoadCars
 */
public class LoadAndUnloadCars {
	private ArrayList<Car> loadedCars = new ArrayList<Car>();
	private HasPosition position = new HasPosition();
	
	public ArrayList<Car> getLoadedCars() {
		return loadedCars;
	}
	
// icke specifikt till detta
	//LOAD
    public void load(Car car, CarRepairShop b){
		if(position.getDistanceBetweenObjects(car, b)) {
			loadedCars.add(car);
		}
		// Add so that if a car is loaded into a Bärgarn, it cannot be loaded into another Bärgarn
	}
	public void load(Car car, Truck b){
		if(position.getDistanceBetweenObjects(car, b)) {
			loadedCars.add(car);
		}
		// Add so that if a car is loaded into a Bärgarn, it cannot be loaded into another Bärgarn
	}

	//UNLOAD
	public void unload(Car car, CarRepairShop b){
		double amount = 3;
		double offsetX = b.getX() + amount;
		double offsetY = b.getY() + amount;

		if(loadedCars.size() >=1) {
			loadedCars.remove(car);
			
			//set new coordinates for car range: 3
			car.setX(offsetX);
			car.setY(offsetY);
		}
	}
	public void unload(Car car, Truck b){
		double amount = 3;
		double offsetX = b.getX() + amount;
		double offsetY = b.getY() + amount;

		if(loadedCars.size() >=1) {
			loadedCars.remove(car);
			
			//set new coordinates for car range: 3
			car.setX(offsetX);
			car.setY(offsetY);
		}
	}
}