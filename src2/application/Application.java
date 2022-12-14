package src2.application;

import src2.controller.VehicleController;
import src2.model.Saab95;
import src2.model.Scania;
import src2.model.Volvo240;
import src2.view.VehicleView;

public class Application {
    public static void main(String[] args) {
         // Instance of this class
         VehicleController vc = new VehicleController();

         vc.getVehiclesList().add(new Volvo240());
         vc.getVehiclesList().add(new Saab95());
         vc.getVehiclesList().add(new Scania());
         
         // Start a new view and send a reference of self

         vc.frame = new VehicleView("VehicleSim 1.0", vc);
 
         // Start the timer
         vc.getTimer().start();
     }
}


//should make the window