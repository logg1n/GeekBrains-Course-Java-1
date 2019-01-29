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
		this.appetite = rand.nextInt(5) + 5;
		this.satiety = false;
	}

	public void eat(Plate obj){
		if (obj.cutFood(this.appetite))
			this.satiety = true;
	}
/*
	public void eat(Plate obj, int val) {
		if (obj.cutFood(val))
			this.satiety = true;
	}
	*/
// ########################################################
	public void printS(){
		System.out.printf("Cat eat -> %b\n", this.satiety);
	}
}
 