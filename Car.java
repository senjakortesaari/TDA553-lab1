import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

abstract class Car implements Movable {

    public int nrDoors; // Number of doors on the car
    public double enginePower; // Engine power of the car
    public double currentSpeed; // The current speed of the car
    public Color color; // Color of the car
    public String modelName; // The car model name
    public double x;
    public double y;

    double[][] directionList = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

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

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
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
    
    public abstract double speedFactor();

    public abstract void incrementSpeed(double amount);

    public abstract void decrementSpeed(double amount);

    // TODO fix this method according to lab pm
    public void gas(double amount){
        incrementSpeed(amount);
    }

    // TODO fix this method according to lab pm
    public void brake(double amount){
        decrementSpeed(amount);
    }
}
