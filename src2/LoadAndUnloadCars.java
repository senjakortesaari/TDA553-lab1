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
	
	//LOAD
    public void load(Car car, CarRepairShop carRepairShop) {
		if(position.getDistanceBetweenObjects(car, carRepairShop)) {
			loadedCars.add(car);
		}
	}
	public void load(Car car, Truck truck) {
		if(position.getDistanceBetweenObjects(car, truck)) {
			loadedCars.add(car);
		}
	}

	//UNLOAD
	public void unload(Car car, CarRepairShop carRepairShop) {
		double amount = 3;
		double offsetX = carRepairShop.getX() + amount;
		double offsetY = carRepairShop.getY() + amount;

		if(loadedCars.size() >=1) {
			loadedCars.remove(car);
			
			//set new coordinates for car, offset amount: 3
			car.setX(offsetX);
			car.setY(offsetY);
		}
	}
	public void unload(Car car, Truck truck) {
		double amount = 3;
		double offsetX = truck.getX() + amount;
		double offsetY = truck.getY() + amount;

		if(loadedCars.size() >=1) {
			loadedCars.remove(car);
			
			//set new coordinates for car, offset amount: 3
			car.setX(offsetX);
			car.setY(offsetY);
		}
	}
}