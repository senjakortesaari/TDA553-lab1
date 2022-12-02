package src2;
import java.awt.*;

import src2.exceptions.*;

public abstract class Vehicle implements Movable, ObjectsWithPositions {
    
    private int nrDoors; // Number of doors on the car
    private double enginePower; // Engine power of the car
    private double currentSpeed; // The current speed of the car
    private Color color; // Color of the car
    private String modelName; // The car model name
    private double x;
    private double y;
    private HasPosition position = new HasPosition();
    

    public Vehicle(int nrDoors, double enginePower,Color color, String modelName){
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.color = color;
        this.modelName = modelName;
        this.position = new HasPosition();
    }

    //speed x index 0
    //speed y index 1
    // går man till höger -> nästa index i listan
    // går man till vänster -> föregående index i listan
    
    double[][] directionList = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    
    public static final int minGasAmount = 0;
    public static final int maxGasAmount = 1;

    public static final int minBrakeAmount = 0;
    public static final int maxBrakeAmount = 1;

    int directionIndex = 0;

    public void move() {
        x += currentSpeed * directionList[directionIndex][0];
        y += currentSpeed * directionList[directionIndex][1];

        position.setX(x);
        position.setY(y);
    }

    public void turnLeft(){
        directionIndex -= 1;
        if (directionIndex == -1){
            directionIndex = 3;
        }
        move();
    }

    public void turnRight(){
        directionIndex += 1;
        if (directionIndex == 4){
            directionIndex = 0;
        }
        move();
    }

    public double getX(){
        return position.getX();
    }

    public double getY(){
        return position.getY();
    }

    public void setX(double x){
        position.setX(x);
    }

    public void setY(double y){
        position.setY(y);
    }

    public int getNrDoors(){
        return nrDoors;
    }
    public double getEnginePower(){
        return enginePower;
    }

    public double getCurrentSpeed(){
        return currentSpeed;
    }

    public Color getColor(){
        return color;
    } 

    public void setColor(Color clr){
	    color = clr;
    }

    public void startEngine(){
	    currentSpeed = 0.1;
    }

    public void stopEngine(){
	    currentSpeed = 0;
    }

    public void setCurrentSpeed(double amount) { // Nu kan man setta till infinite speed... behöver exception men alla ser annorlunda ut för olika typer av bilar osv osv fuck
        currentSpeed = amount;
    }

    public boolean checkIfVehiclesAreClose(ObjectsWithPositions a, ObjectsWithPositions b){
        return position.getDistanceBetweenObjects(a, b);
	}
    
    protected abstract double speedFactor();
    
    public void incrementSpeed(double amount){
        currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount, enginePower);
    }
    public void decrementSpeed(double amount){
        currentSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount, 0);
    }

    public void gas(double amount) throws InvalidRangeForGasException{
        if(amount < minGasAmount || amount > maxGasAmount) {
            throw new InvalidRangeForGasException();
        } else { 
            incrementSpeed(amount);    
        }
    }

    public void brake(double amount) throws InvalidRangeForBrakeException{
        if(amount < minBrakeAmount || amount > maxBrakeAmount) {
            throw new InvalidRangeForBrakeException();
        } else {
            decrementSpeed(amount);
        }
    }
}
// God Jul!