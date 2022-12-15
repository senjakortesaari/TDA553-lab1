package src2.model;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        CarRepairShop c = new CarRepairShop(1);
        c.setX(10);
        c.setY(10);
        Saab95 s = new Saab95();
        s.setX(5);
        s.setY(5);
        Volvo240 v = new Volvo240();
        v.setX(5);
        v.setY(5);
        Volvo240 v2 = new Volvo240();
        v2.setX(5);
        v2.setY(5);
        c.loadCar(s);
        c.loadCar(v);
        c.loadCar(v);
        c.loadCar(v);
        c.loadCar(v);
        c.loadCar(v2);
        System.out.println(c.getLoadedCars().size());
    }
}