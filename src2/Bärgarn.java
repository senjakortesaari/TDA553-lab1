package src2;

import java.awt.Color;

//(car transport)
public class Bärgarn extends Truck {
	int loadedCars = 0;

	public Bärgarn(){
		super(2, 150, Color.pink,"Bärgarn");
	}

	@Override
	protected double speedFactor(){
		//Decreases with heavier load
		return 0;
	}

	public void load(){
		if(state_flatbed == false){
			loadedCars += 1;
		}
	}

	public void unload(){
		if(state_flatbed == false && loadedCars != 0){
			loadedCars -= 1;
		}
	}  

	public void checkIfCarIsClose(){
		if(getX() > getX()+10 || getX() < getX()-10){

		}
	}
}