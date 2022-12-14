package src2.controller;
import javax.swing.*;

import src2.exceptions.InvalidRangeForGasException;
import src2.model.Vehicle;
import src2.view.VehicleView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/*
* This class represents the Controller part in the Mvc pattern.
* It's responsibilities is to listen to the View and responds in a appropriate manner by
* modifying the model state and the updating the view.
 */

public class VehicleController {
    // member fields:

    // The delay (ms) corresponds to 20 updates a sec (hz)
    private final int delay = 50;
    // The timer is started with an listener (see below) that executes the statements
    // each step between delays.
    private Timer timer = new Timer(delay, new TimerListener());
	// The frame that represents this instance View of the Mvc pattern
    public VehicleView frame;
    // A list of Vehicles, modify if needed
    private ArrayList<Vehicle> vehicles = new ArrayList<>();

    // Getters for attributes:
    public Timer getTimer() {
        return timer;
    }
    public ArrayList<Vehicle> getVehiclesList() {
        return vehicles;
    }
    public VehicleView getFrame() {
        return frame;
    }


        //methods:
    
    /* Each step the TimerListener moves all the Vehicles in the list and tells the
    * view to update its images. Change this method to your needs.
    * */
    private class TimerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (Vehicle vehicle : vehicles) {
                vehicle.move();
                int x = (int) Math.round(vehicle.getX());
                int y = (int) Math.round(vehicle.getY());
                frame.drawPanel.moveit(x, y);
                // repaint() calls the paintComponent method of the panel
                frame.drawPanel.repaint();
            }
        }
    }

    // Calls the gas method for each Vehicle once
    public void gas(int amount) throws InvalidRangeForGasException {
        double gas = ((double) amount) / 100;
        for (Vehicle vehicle : vehicles) {
            vehicle.gas(gas);

        }
    }

    public void startEngine() {
        for (Vehicle vehicle : vehicles) {
            vehicle.startEngine();
        }
    }

    public void stopEngine() {
        for (Vehicle vehicle : vehicles) {
            vehicle.stopEngine();
        }
    }
}

//should create buttons