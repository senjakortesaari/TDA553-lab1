package test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import src.Volvo240;
import src.InvalidRangeForBrakeException;
import src.InvalidRangeForGasException;
import src.Saab95;

import java.awt.*;


class FirstTest{

    @Test
    public void test(){ // To test if Jupiter works
        assertEquals(2, 1+1);
    }

    // Below are tests for methods specific to Volvo240
    @Test
    public void volvo_testGetCurrentSpeed_should_return_0(){
        Volvo240 volvo1 = new Volvo240();
        assertEquals(0, volvo1.getCurrentSpeed());
    }

    @Test
    public void volvo_testspeedFactor_should_return_1_point_25(){
        Volvo240 volvo1 = new Volvo240();
        assertEquals(1.25, volvo1.speedFactor());
    }
    
    @Test
    public void volvo_testIncrementSpeed_should_return_12_point_5(){
        Volvo240 volvo1 = new Volvo240();
        volvo1.incrementSpeed(10);
        assertEquals(12.5, volvo1.getCurrentSpeed());
    }

    @Test
    public void volvo_testDecrementSpeed_should_return_0(){
        Volvo240 volvo1 = new Volvo240();
        volvo1.decrementSpeed(10);
        assertEquals(0, volvo1.getCurrentSpeed());
    }

    // Below are tests for methods specific to Saab95
    @Test
    public void saab_test_setTurboOn_should_return_true() {
        Saab95 saab = new Saab95();
        saab.setTurboOn();
        assertTrue(saab.isTurboOn());
    }

    @Test
    public void saab_test_setTurboOff_should_return_false() {
        Saab95 saab = new Saab95();
        saab.setTurboOff();
        assertFalse(saab.isTurboOn());
    }
    @Test
    public void saab_test_speedFactor_with_turbo_on_should_return_1_point_625() {
        Saab95 saab = new Saab95();
        saab.setTurboOn();
        assertEquals(1.625, saab.speedFactor());
    }

    @Test
    public void saab_test_speedFactor_with_turbo_off_should_return_1_point_25() {
        Saab95 saab = new Saab95();
        saab.setTurboOff();
        assertEquals(1.25, saab.speedFactor());
    }

    @Test
    public void saab_test_incrementSpeed_with_turbo_on_should_return_16_point_25(){
        Saab95 saab = new Saab95();
        saab.setTurboOn();
        saab.incrementSpeed(10);
        assertEquals(16.25, saab.getCurrentSpeed());
    }

    @Test
    public void saab_test_incrementSpeed_with_turbo_off_should_return_12_point_5(){
        Saab95 saab = new Saab95();
        saab.setTurboOff();
        saab.incrementSpeed(10);
        assertEquals(12.5, saab.getCurrentSpeed());
    }
    @Test
    public void test_decrementSpeed_with_turbo_on_should_return_0(){
        Saab95 saab = new Saab95();
        saab.setTurboOn();
        saab.decrementSpeed(10);
        assertEquals(0, saab.getCurrentSpeed());
    }

    @Test
    public void test_decrementSpeed_with_turbo_off_should_return_0(){
        Saab95 saab = new Saab95();
        saab.setTurboOff();
        saab.decrementSpeed(10);
        assertEquals(0, saab.getCurrentSpeed());
    }

    // Below are tests for mutual methods of all subclasses derived from Car
    @Test
    public void test_turnLeft_for_x_axis_should_return_negative_12_point_5() {
        Volvo240 volvo = new Volvo240();
        volvo.incrementSpeed(10);
        volvo.move();
        volvo.turnLeft();
        
        assertEquals(-12.5, volvo.getX());
    }
    @Test
    public void test_turnLeft_for_y_axis_should_return_12_point_5() {
        Volvo240 volvo = new Volvo240();
        volvo.incrementSpeed(10);
        volvo.move();
        volvo.turnLeft();
        
        assertEquals(12.5, volvo.getY());
    }
    @Test
    public void test_turnRight_for_x_axis_should_return_12_point_5() {
        Volvo240 volvo = new Volvo240();
        volvo.incrementSpeed(10);
        volvo.move();
        volvo.turnRight();
        
        assertEquals(12.5, volvo.getX());
    }

    @Test
    public void test_turnRight_for_y_axis_should_return_12_point_5() {
        Volvo240 volvo = new Volvo240();
        volvo.incrementSpeed(10);
        volvo.move();
        volvo.turnRight();
        
        assertEquals(12.5, volvo.getY());
    }
    @Test
    public void test_getNrDoors_should_return_4(){
        Volvo240 volvo = new Volvo240();
        assertEquals(4, volvo.getNrDoors());
    }

    @Test
    public void test_getEnginePower_should_return_100_for_volvo(){
        Volvo240 volvo = new Volvo240();
        assertEquals(100, volvo.getEnginePower());
    }

    @Test
    public void test_getColor_should_return_black_for_volvo(){
        Volvo240 volvo = new Volvo240();
        assertEquals(Color.black, volvo.getColor());
    }

    @Test
    public void setColor(){
	    Volvo240 volvo = new Volvo240();
        volvo.setColor(Color.red);
        assertEquals(Color.red, volvo.getColor());
    }

    @Test
    public void test_startEngine_should_return_0_point_1(){
        Volvo240 volvo = new Volvo240();
        volvo.startEngine();
        assertEquals(0.1, volvo.getCurrentSpeed());
    }

    @Test
    public void test_stopEngine_should_return_0(){
        Volvo240 volvo = new Volvo240();
        volvo.stopEngine();
        assertEquals(0, volvo.getCurrentSpeed());
    }

    @Test
    public void test_gas_should_return_0_point_3125() {
        Volvo240 volvo = new Volvo240();
        try {
            volvo.gas(0.25);
        } catch (InvalidRangeForGasException e) {
            System.out.println("Åh nej ... an error has occured: " + e);
        }
        assertEquals(0.3125, volvo.getCurrentSpeed());
    }

    @Test
    public void test_brake_should_return_0() {
        Volvo240 volvo = new Volvo240();
        try {
            volvo.brake(0.25);
        } catch (InvalidRangeForBrakeException e) {
            System.out.println("Åh nej ... an error has occured: " + e);
        }    
        assertEquals(0, volvo.getCurrentSpeed());
    }
}
