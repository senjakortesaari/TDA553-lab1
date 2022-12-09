package src2.model;

public class HasPosition {
    private double x;
    private double y;

    public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // To see if the distance between two objects is valid for loading a car
    public boolean getDistanceBetweenObjects(ObjectsWithPositions car, ObjectsWithPositions truck) {
        double range = 10;
        boolean xInterval = (car.getX() >= (truck.getX()) && getX() <= (truck.getX() + range) || car.getX() <= (truck.getX()) && car.getX() >= (truck.getX() - range));
        boolean yInterval = (car.getY() >= (truck.getY()) && car.getY() <= (truck.getY() + range) || car.getY() <= (truck.getY()) && car.getY() >= (truck.getY() - range));
        
        if(xInterval && yInterval) {
            return true;
        }
        return false;
    }

    public boolean getDistanceBetweenObjects(Car car, CarRepairShop carRepairShop) {
        double range = 10;
        boolean xInterval = (car.getX() >= (carRepairShop.getX()) && getX() <= (carRepairShop.getX() + range) || car.getX() <= (carRepairShop.getX()) && car.getX() >= (carRepairShop.getX() - range));
        boolean yInterval = (car.getY() >= (carRepairShop.getY()) && car.getY() <= (carRepairShop.getY() + range) || car.getY() <= (carRepairShop.getY()) && car.getY() >= (carRepairShop.getY() - range));
        
        if(xInterval && yInterval) {
            return true;
        }
        return false;
    }
}