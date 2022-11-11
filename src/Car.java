package src;
import java.awt.*;

abstract class Car implements Movable {

    protected int nrDoors; // Number of doors on the car
    protected double enginePower; // Engine power of the car
    protected double currentSpeed; // The current speed of the car
    protected Color color; // Color of the car
    protected String modelName; // The car model name
    protected double x;
    protected double y;

    double[][] directionList = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    // Constructors used to initalize different cars
    public Car(int nrDoors, double enginePower,Color color, String modelName){
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.color = color;
        this.modelName = modelName;
    }

    //speed x index 0
    //speed y index 1
    // går man till höger -> nästa index i listan
    // går man till vänster -> föregående index i listan
    

    int directionIndex = 0;

    public void move() {
        x += currentSpeed * directionList[directionIndex][0];
        y += currentSpeed * directionList[directionIndex][1];
    }

    public void turnLeft(){
        directionIndex -= 1;
        if (directionIndex == -1){
            directionIndex = 3;
        }
    }

    public void turnRight(){
        directionIndex += 1;
        if (directionIndex == 4){
            directionIndex = 0;
        }
    }

    protected double getX(){
        return x;
    }

    protected double getY(){
        return y;
    }
    protected int getNrDoors(){
        return nrDoors;
    }
    protected double getEnginePower(){
        return enginePower;
    }

    public double getCurrentSpeed(){
        return currentSpeed;
    }

    protected Color getColor(){
        return color;
    }

    protected void setColor(Color clr){
	    color = clr;
    }

    protected void startEngine(){
	    currentSpeed = 0.1;
    }

    protected void stopEngine(){
	    currentSpeed = 0;
    }
    
    protected abstract double speedFactor();

    protected abstract void incrementSpeed(double amount);

    protected abstract void decrementSpeed(double amount);

    // TODO fix this method according to lab pm
    public void gas(double amount){
        incrementSpeed(amount);
    }

    // TODO fix this method according to lab pm
    public void brake(double amount){
        decrementSpeed(amount);
    }

    
}

