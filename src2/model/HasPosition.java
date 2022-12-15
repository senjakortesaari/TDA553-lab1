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
    public boolean getDistanceBetweenObjects(ObjectsWithPositions car, ObjectsWithPositions obj) {
        double range = 10;
        boolean xInterval = (car.getX() >= (obj.getX()) && getX() <= (obj.getX() + range) || car.getX() <= (obj.getX()) && car.getX() >= (obj.getX() - range));
        boolean yInterval = (car.getY() >= (obj.getY()) && car.getY() <= (obj.getY() + range) || car.getY() <= (obj.getY()) && car.getY() >= (obj.getY() - range));
        
        if(xInterval && yInterval) {
            return true;
        }
        return false;
    }
}