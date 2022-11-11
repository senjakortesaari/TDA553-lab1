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
    public void testspeedFactor(){
        Volvo240 volvo1 = new Volvo240();
        assertEquals(1.25, volvo1.speedFactor());
    }
    
    @Test
    public void testGetCurrentSpeed(){
        Volvo240 volvo1 = new Volvo240();
        volvo1.incrementSpeed(0);
        assertEquals(0, volvo1.getCurrentSpeed());
    }

}

