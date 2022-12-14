package test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import src2.exceptions.*;
import src2.model.Bärgarn;
import src2.model.Car;
import src2.model.CarRepairShop;
import src2.model.HasPosition;
import src2.model.Saab95;
import src2.model.Scania;
import src2.model.Volvo240;
import src2.*;
import java.awt.*;
import java.util.ArrayList;


class FirstTest {

//     @Test
//     public void test() { // To test if Jupiter works
//         assertEquals(2, 1+1);
//     }

//     // Below are tests for methods specific to Volvo240
//     @Test
//     public void volvo_testGetCurrentSpeed_should_return_0() {
//         Volvo240 volvo1 = new Volvo240();
//         assertEquals(0, volvo1.getCurrentSpeed());
//     }

//     @Test
//     public void volvo_testspeedFactor_should_return_1_point_25() {
//         Volvo240 volvo1 = new Volvo240();
//         assertEquals(1.25, volvo1.speedFactor());
//     }
    
//     @Test
//     public void volvo_testIncrementSpeed_should_return_12_point_5() {
//         Volvo240 volvo1 = new Volvo240();
//         volvo1.incrementSpeed(10);
//         assertEquals(12.5, volvo1.getCurrentSpeed());
//     }

//     @Test
//     public void volvo_testDecrementSpeed_should_return_0() {
//         Volvo240 volvo1 = new Volvo240();
//         volvo1.decrementSpeed(10);
//         assertEquals(0, volvo1.getCurrentSpeed());
//     }

//     // Below are tests for methods specific to Saab95
//     @Test
//     public void saab_test_setTurboOn_should_return_true() {
//         Saab95 saab = new Saab95();
//         saab.setTurboOn();
//         assertTrue(saab.isTurboOn());
//     }

//     @Test
//     public void saab_test_setTurboOff_should_return_false() {
//         Saab95 saab = new Saab95();
//         saab.setTurboOff();
//         assertFalse(saab.isTurboOn());
//     }
//     @Test
//     public void saab_test_speedFactor_with_turbo_on_should_return_1_point_625() {
//         Saab95 saab = new Saab95();
//         saab.setTurboOn();
//         assertEquals(1.625, saab.speedFactor());
//     }

//     @Test
//     public void saab_test_speedFactor_with_turbo_off_should_return_1_point_25() {
//         Saab95 saab = new Saab95();
//         saab.setTurboOff();
//         assertEquals(1.25, saab.speedFactor());
//     }

//     @Test
//     public void saab_test_incrementSpeed_with_turbo_on_should_return_16_point_25() throws InvalidRangeForGasException {
//         Saab95 saab = new Saab95();
//         saab.setTurboOn();
//         saab.gas(10);
//         Volvo240 v = new Volvo240();
//         v.gas(100);
//         assertEquals(16.25, saab.getCurrentSpeed());
//     }

//     @Test
//     public void saab_test_incrementSpeed_with_turbo_off_should_return_12_point_5() {
//         Saab95 saab = new Saab95();
//         saab.setTurboOff();
//         saab.incrementSpeed(10);
//         assertEquals(12.5, saab.getCurrentSpeed());
//     }
//     @Test
//     public void test_decrementSpeed_with_turbo_on_should_return_0() {
//         Saab95 saab = new Saab95();
//         saab.setTurboOn();
//         saab.decrementSpeed(10);
//         assertEquals(0, saab.getCurrentSpeed());
//     }

//     @Test
//     public void test_decrementSpeed_with_turbo_off_should_return_0() {
//         Saab95 saab = new Saab95();
//         saab.setTurboOff();
//         saab.decrementSpeed(10);
//         assertEquals(0, saab.getCurrentSpeed());
//     }

//     // Below are tests for mutual methods of all subclasses derived from Car
//     @Test
//     public void test_turnLeft_for_x_axis_should_return_negative_12_point_5() {
//         Volvo240 volvo = new Volvo240();
//         volvo.incrementSpeed(10);
//         volvo.move();
//         volvo.turnLeft();
        
//         assertEquals(-12.5, volvo.getX());
//     }
//     @Test
//     public void test_turnLeft_for_y_axis_should_return_12_point_5() {
//         Volvo240 volvo = new Volvo240();
//         volvo.incrementSpeed(10);
//         volvo.move();
//         volvo.turnLeft();
        
//         assertEquals(12.5, volvo.getY());
//     }
//     @Test
//     public void test_turnRight_for_x_axis_should_return_12_point_5() {
//         Volvo240 volvo = new Volvo240();
//         volvo.incrementSpeed(10);
//         volvo.move();
//         volvo.turnRight();
        
//         assertEquals(12.5, volvo.getX());
//     }

//     @Test
//     public void test_turnRight_for_y_axis_should_return_12_point_5() {
//         Volvo240 volvo = new Volvo240();
//         volvo.incrementSpeed(10);
//         volvo.move();
//         volvo.turnRight();
        
//         assertEquals(12.5, volvo.getY());
//     }
//     @Test
//     public void test_getNrDoors_should_return_4() {
//         Volvo240 volvo = new Volvo240();
//         assertEquals(4, volvo.getNrDoors());
//     }

//     @Test
//     public void test_getEnginePower_should_return_100_for_volvo() {
//         Volvo240 volvo = new Volvo240();
//         assertEquals(100, volvo.getEnginePower());
//     }

//     @Test
//     public void test_getColor_should_return_black_for_volvo() {
//         Volvo240 volvo = new Volvo240();
//         assertEquals(Color.black, volvo.getColor());
//     }

//     @Test
//     public void tet_set_Color() {
// 	    Volvo240 volvo = new Volvo240();
//         volvo.setColor(Color.red);
//         assertEquals(Color.red, volvo.getColor());
//     }

//     @Test
//     public void test_startEngine_should_return_0_point_1() {
//         Volvo240 volvo = new Volvo240();
//         volvo.startEngine();
//         assertEquals(0.1, volvo.getCurrentSpeed());
//     }

//     @Test
//     public void test_stopEngine_should_return_0() {
//         Volvo240 volvo = new Volvo240();
//         volvo.stopEngine();
//         assertEquals(0, volvo.getCurrentSpeed());
//     }

//     @Test
//     public void test_gas_should_return_0_point_3125() {
//         Volvo240 volvo = new Volvo240();
//         try {
//             volvo.gas(0.25);
//         } catch (InvalidRangeForGasException e) {
//             System.out.println("Åh nej ... an error has occured: " + e);
//         }
//         assertEquals(0.3125, volvo.getCurrentSpeed());
//     }

//     @Test
//     public void test_brake_should_return_0() {
//         Volvo240 volvo = new Volvo240();
//         try {
//             volvo.brake(0.25);
//         } catch (InvalidRangeForBrakeException e) {
//             System.out.println("Åh nej ... an error has occured: " + e);
//         }    
//         assertEquals(0, volvo.getCurrentSpeed());
//     }

//     // Below are tests for ...(scania) --------------------------------------------------------------------------------------------------

//     @Test
//     public void test_platform_angle_in_range_increase_should_return_34() {
//         Scania scania = new Scania();
//         scania.increase_platform_angle(34);
//         assertEquals(34, scania.get_platform_angle());
//         }

//     @Test
//     public void test_platform_angle_in_range_decrease_should_return_0() {
//         Scania scania = new Scania();
//         scania.increase_platform_angle(10);
//         scania.decrease_platform_angle(5);
//         assertEquals(5, scania.get_platform_angle());
//     }
    
//     @Test
//     public void test_ramp_up_should_return_true() {
//         Bärgarn bärgarn = new Bärgarn(10);
//         bärgarn.flatbed_in_use();
//         assertEquals(true, bärgarn.getStateOfFlatbed());
//     }

//     @Test
//     public void test_ramp_down_should_return_false() {
//         Bärgarn bärgarn = new Bärgarn(10);
//         bärgarn.flatbed_not_in_use();
//         assertEquals(false, bärgarn.getStateOfFlatbed());
//     }

//     @Test
//     public void test_increment_speed_while_flatbed_up_scania() {
//         Scania scania = new Scania();
//         scania.flatbed_in_use();
//         scania.incrementSpeed(10);
//         assertEquals(0, scania.getCurrentSpeed());
//     }
    
//     // @Test
//     // public void test_increment_speed_while_flatbed_in_use_bärgarn_should_return_zero_cuz_cant_drive_bruv() {
//     //     Bärgarn bärgarn = new Bärgarn(10);
//     //     bärgarn.flatbed_in_use();
//     //     bärgarn.incrementSpeed(10);
//     //     assertEquals(0, bärgarn.getCurrentSpeed());
//     // }

//     // @Test
//     // public void test_flatbed_down_while_moving_scania() {
//     //     Scania scania = new Scania();
//     //     scania.incrementSpeed(125);
//     //     scania.move();
//     //     scania.flatbed_in_use();
//     //     assertEquals(false, scania.getStateOfFlatbed());
//     // }

//     @Test
//     public void test_with_Volvo_load_should_return_true() {
//         Volvo240 volvo = new Volvo240();
//         Bärgarn bärgarn = new Bärgarn(10);
//         HasPosition position = new HasPosition();
        
//         volvo.setX(48);
//         bärgarn.setX(50);

//         volvo.setY(55);
//         bärgarn.setY(50);
        
//         Boolean volvoBärgarn = position.getDistanceBetweenObjects(volvo, bärgarn);

//         assertTrue(volvoBärgarn);
//     }

//     @Test
//     public void test_load_transporter_if_a_car_is_close_should_return_one() {
//         Bärgarn bärgarn = new Bärgarn(10);
//         Bärgarn borgir = new Bärgarn(10);
//         Saab95 saab = new Saab95();
//         Saab95 saabis = new Saab95();
//         ArrayList<Car> loadedCarsBär = bärgarn.getLoadedCars();
//         ArrayList<Car> loadedCarsBorg = borgir.getLoadedCars();

    
//         bärgarn.flatbed_in_use();
//         borgir.flatbed_in_use();
        
//         saab.setX(48);
//         saabis.setX(48);
//         bärgarn.setX(50);
//         borgir.setX(50);

//         saab.setY(48);
//         saabis.setY(48);
//         bärgarn.setY(50);
//         borgir.setY(50);
        
//         bärgarn.load(saab);
//         bärgarn.load(saabis);
        
//         borgir.load(saab);

//         assertTrue(loadedCarsBär.size() > loadedCarsBorg.size());
//     }
    
//     @Test
//     public void test_load_car_repair_shop_if_a_car_is_close_should_return_one() {
//         CarRepairShop cps1 = new CarRepairShop(10);
//         CarRepairShop cps2 = new CarRepairShop(10);
//         Saab95 saab = new Saab95();
//         Saab95 saabis = new Saab95();
//         ArrayList<Car> loadedCarsBär = cps1.getLoadedCars();
//         ArrayList<Car> loadedCarsBorg = cps2.getLoadedCars();

//         saab.setX(48);
//         saabis.setX(48);
//         cps1.setX(50);
//         cps2.setX(50);

//         saab.setY(48);
//         saabis.setY(48);
//         cps1.setY(50);
//         cps2.setY(50);

//         cps1.loadCar(saab);
//         cps1.loadCar(saabis);
        
//         cps2.loadCar(saab);

//         assertTrue(loadedCarsBär.size() > loadedCarsBorg.size());
//     }
    
//     @Test
//     public void test_transporter_unload_cars() {
//         Bärgarn bärgarn = new Bärgarn(10);
//         Saab95 saab = new Saab95();
//         ArrayList<Car> loadedCars = bärgarn.getLoadedCars();

//         saab.setX(48);
//         bärgarn.setX(50);

//         saab.setY(48);
//         bärgarn.setY(50);

//         bärgarn.load(saab);
//         bärgarn.unload(saab);

//         assertEquals(0, loadedCars.size());
//     }

//     @Test
//     public void test_car_repair_shop_unload_cars() {
//         Saab95 saab = new Saab95();
//         CarRepairShop carRepairShop = new CarRepairShop(10);

//         saab.setX(48);
//         carRepairShop.setX(50);

//         saab.setY(48);
//         carRepairShop.setY(50);

//         carRepairShop.loadCar(saab);
//         carRepairShop.unloadCar(saab);
    
//         assertEquals(0, carRepairShop.getLoadedCars().size());
//     }

//     @Test
//     public void test_bärgarn_load_while_driving_should_return_0() {
//         Saab95 saab = new Saab95();
//         Bärgarn bärgarn = new Bärgarn(10);
//         ArrayList<Car> loadedCars = bärgarn.getLoadedCars();

//         bärgarn.setX(5);
//         saab.setX(0);

//         bärgarn.setY(5);
//         saab.setY(0);

//         bärgarn.incrementSpeed(100);
//         bärgarn.move();
//         bärgarn.load(saab);
        
//         assertEquals(0, loadedCars.size());
//     }
    //TODO: fix this shiet
    @Test
    public void testIfFlatbedCanBeChangedWhilstMoving() throws InvalidRangeForGasException {
        Scania sc = new Scania();
        sc.gas(1);
        sc.increasePlatformAngle(50);
        assertEquals(0, sc.getPlatformAngle());
    }

    // VI ÄR HÄR BRO
    @Test
    public void testIfTruckCanMoveWhenFlatbedInUse() throws InvalidRangeForGasException {
        Scania sc = new Scania();
        sc.increasePlatformAngle(45);
        // sc.flatbedIsBeingUsed();
        System.out.println("Apapapa:" + sc.getStateOfFlatbed());
        sc.gas(1);
        
        assertEquals(0, sc.getCurrentSpeed());
    }
}

    