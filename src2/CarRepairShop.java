package src2;

import java.util.ArrayList;

public class CarRepairShop  {
    //Attributes:
    int carCapacity;

    HasPosition position = new HasPosition();
    Bärgarn loadFunction = new Bärgarn(carCapacity);
    Bärgarn unloadFunction = new Bärgarn(carCapacity);
    Bärgarn getLoadedCars = new Bärgarn(carCapacity);

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
        return getLoadedCars.getLoadedCars();
    }

    public void loadCar(Car car) { // Gör om, läs instruktionerna, ksk it behöver delegation
        loadFunction.load(car);
        System.out.println("iwfwgww");
    }
    
    public void unloadCar(Car car) {
        unloadFunction.unload(car);
    }
}