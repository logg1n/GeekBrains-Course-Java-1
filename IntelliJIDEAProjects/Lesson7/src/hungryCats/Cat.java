package hungryCats;

import java.util.Random;

public class Cat {
	Random rand = new Random();

	private boolean satiety;
	private int appetite;

	public boolean getSatiety() {
		return satiety;
	}

	public int getAppetite() {
		return appetite;
	}

	public Cat() {
		appetite = rand.nextInt(5) + 5;
	}

	public void eat(Plate obj){
		if (appetite > obj.getFood()){
			return;
		}
		if (obj.cutFood(appetite))
			satiety = true;
	}

/* ########################################################
	public void printSatiety(){
		System.out.printf("Cat eat -> %b,\n Apettit -> %d\n", satiety, appetite);
	}
	*/
}
 