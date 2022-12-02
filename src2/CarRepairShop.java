package src2;

import java.util.ArrayList;

public class CarRepairShop implements ObjectsWithPositions  {
    //Attributes:
    int carCapacity;

    HasPosition position = new HasPosition();
    Bärgarn loadFunction = new Bärgarn(carCapacity);
    LoadAndUnloadCars loadAndUnloadCars = new LoadAndUnloadCars();

    //Constructor:
    public CarRepairShop(int carCapacity) {
        this.carCapacity = carCapacity;
    }

    // Methods:
    public double getX() {
        return position.getX();
    }

    public double getY() {
        return position.getY();
    }

     public void setX(double x) {
        position.setX(x);
    }

    public void setY(double y) {
        position.setY(y);
    }

    public ArrayList<Car> getLoadedCars() {
        return loadAndUnloadCars.getLoadedCars();
    }

    public void loadCar(Car car) { // Gör om, läs instruktionerna, ksk it behöver delegation
        loadAndUnloadCars.load(car, this);
    }
    
    public void unloadCar(Car car) {
        loadAndUnloadCars.unload(car, this);
    }
}