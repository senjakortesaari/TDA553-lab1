package src2;
import javax.swing.*;

import src2.exceptions.InvalidRangeForGasException;

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
    VehicleView frame;
    // A list of Vehicles, modify if needed
    ArrayList<Vehicle> Vehicles = new ArrayList<>();

    //methods:

    public static void main(String[] args) {
        // Instance of this class
        VehicleController vc = new VehicleController();

        vc.Vehicles.add(new Volvo240());
        vc.Vehicles.add(new Saab95());
        vc.Vehicles.add(new Scania());
        
        // Start a new view and send a reference of self
        vc.frame = new VehicleView("VehicleSim 1.0", vc);

        // Start the timer
        vc.timer.start();
    }

    /* Each step the TimerListener moves all the Vehicles in the list and tells the
    * view to update its images. Change this method to your needs.
    * */
    private class TimerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (Vehicle Vehicle : Vehicles) {
                Vehicle.move();
                int x = (int) Math.round(Vehicle.getX());
                int y = (int) Math.round(Vehicle.getY());
                frame.drawPanel.moveit(x, y);
                // repaint() calls the paintComponent method of the panel
                frame.drawPanel.repaint();
            }
        }
    }

    // Calls the gas method for each Vehicle once
    void gas(int amount) throws InvalidRangeForGasException {
        double gas = ((double) amount) / 100;
        for (Vehicle Vehicle : Vehicles) {
            Vehicle.gas(gas);

        }
    }

    public void startEngine() {
        for (Vehicle Vehicle : Vehicles) {
            Vehicle.startEngine();
        }
    }

    public void stopEngine() {
        for (Vehicle Vehicle : Vehicles) {
            Vehicle.stopEngine();
        }
    }
}