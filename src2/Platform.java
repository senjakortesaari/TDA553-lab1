package src2;

/**
 * Platform
 */
public class Platform extends Flatbed{
    int angle;
    //TODO Exception for angle, interval should be [0, 70]
    @Override
    public void up(int degrees) {
        angle += degrees;
    }

    @Override
    public void down(int degrees) {
        angle -= degrees;
    }

    @Override
    public boolean state() {
         // If is max value, then return true, if min val return false
        if(angle > 0){
            return true;
        } else {
            return false;
        }
    }

    

    // startläge är att platform är down, börjar på 0 grader
    // the angle of the platform can not be lower than 0 degrees or higher than 70 degrees.
    // if platform has angle other than 0 then truck is stationary. 
    // platform not raised while moving.
    // must not be able to drive if platform.up == true.

    
}