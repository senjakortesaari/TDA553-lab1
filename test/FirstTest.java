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


}

