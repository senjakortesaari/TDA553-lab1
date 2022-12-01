package src2;

public class HasPosition {
    private double x;
    private double y;

    public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }


    public boolean getDistanceBetweenObjects(Car car, Truck truck) { // öuverlöud får diffirentiales types in tha futah💀❤️
        double range = 10;
        boolean xInterval = (car.getX() >= (truck.getX()) && getX() <= (truck.getX() + range) || car.getX() <= (truck.getX()) && car.getX() >= (truck.getX() - range));
        boolean yInterval = (car.getY() >= (truck.getY()) && car.getY() <= (truck.getY() + range) || car.getY() <= (truck.getY()) && car.getY() >= (truck.getY() - range));
        
        if(xInterval && yInterval) {
            return true;
        }
        return false;
    }

    public boolean getDistanceBetweenObjects(Car car, CarRepairShop truck) { // öuverlöud får diffirentiales types in tha futah💀❤️
        double range = 10;
        boolean xInterval = (car.getX() >= (truck.getX()) && getX() <= (truck.getX() + range) || car.getX() <= (truck.getX()) && car.getX() >= (truck.getX() - range));
        boolean yInterval = (car.getY() >= (truck.getY()) && car.getY() <= (truck.getY() + range) || car.getY() <= (truck.getY()) && car.getY() >= (truck.getY() - range));
        
        if(xInterval && yInterval) {
            return true;
        }
        return false;
    }
}