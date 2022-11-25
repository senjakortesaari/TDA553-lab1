package src2;

public class Ramp extends Flatbed{
    String state;

    
    public void up(int degrees) {
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
