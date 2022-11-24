package src2;
/**
 * Flatbed - used by vehicles that have a flatbed
 */
public abstract class Flatbed {
    // Flatbed moves up
    public void up(){}

    public void up(int degrees){}
    
    // Flatbed moves down
    public void down(){}
    
    public void down(int degrees){}

    // is state of Flatbed up or down?
    abstract public boolean state();
    
}