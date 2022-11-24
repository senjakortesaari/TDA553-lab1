package src2;

public class Ramp extends Flatbed{
    String state;

    @Override
    public void up() {
        state = "Up";
        
    }

    @Override
    public void down() {
        state = "Down";
    }

    @Override
    public boolean state() {
        if(state == "Down") {
            return false;
        } else {
            return true;
        }
        
    }
   
}
