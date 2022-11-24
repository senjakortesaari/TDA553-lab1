package src2;
import java.awt.*;

public class Saab95 extends Car {
    protected boolean turboOn;
    
    public Saab95(){
        super(2, 125, Color.red, "Saab95");
        stopEngine();
    }

    public void setTurboOn(){
	    turboOn = true;
    }

    public void setTurboOff(){
	    turboOn = false;
    }
    
    @Override
    public double speedFactor(){
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return enginePower * 0.01 * turbo;
    }
    
    public boolean isTurboOn() {
        return turboOn;
    }
}
