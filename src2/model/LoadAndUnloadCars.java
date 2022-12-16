package src2.model;

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
    public void load(Car car, ObjectsWithPositions obj) {
		if(position.getDistanceBetweenObjects(car, obj)) {
			loadedCars.add(car);
		}
	}
	
	//UNLOAD
	public void unload(Car car, ObjectsWithPositions carRepairShop) {
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
}
