package test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.rules.Verifier;

import src.Volvo240;

import java.awt.*;


class FirstTest{

    @Test
    public void test(){
        assertEquals(2, 1+1);
    }

    @Test
    public void testGetCurrentSpeed_should_return_0(){
        Volvo240 volvo1 = new Volvo240();
        assertEquals(0, volvo1.getCurrentSpeed());
    }

    @Test
    public void testspeedFactor_should_return_1_point_25(){
        Volvo240 volvo1 = new Volvo240();
        assertEquals(1.25, volvo1.speedFactor());
    }
    
    @Test
    public void testIncrementSpeed_should_return_12_point_5(){
        Volvo240 volvo1 = new Volvo240();
        volvo1.incrementSpeed(10);
        assertEquals(12.5, volvo1.getCurrentSpeed());
    }

    @Test
    public void testDecrementSpeed_should_return_0(){
        Volvo240 volvo1 = new Volvo240();
        volvo1.decrementSpeed(10);
        assertEquals(0, volvo1.getCurrentSpeed());
    }

    @Test
    public void test_turnLeft_for_x_axis_should_return_minus_12_point_5() {
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
    public void setColor(Color clr){
	    Volvo240 volvo = new Volvo240();
        volvo.setColor(Color.red);
        
        assertEquals(Color.red, volvo.getColor());
    }
}

