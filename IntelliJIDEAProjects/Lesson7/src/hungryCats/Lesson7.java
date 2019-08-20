package hungryCats;

public class Lesson7 {
	public static void main(String[] args) {
		Plate plate = new Plate();
		Cat cat;
		Cat[] cats = new Cat[20];
		int middleAppetit = 0;

		for (int i = 0; i < cats.length; i++){
			cats[i] = new Cat();
			middleAppetit += cats[i].getAppetite();
		}
		middleAppetit /= cats.length;
		System.out.printf("middleAppetit - %d\n", middleAppetit);

		for (int i = 0; i < cats.length; i++){
			cat = cats[i];
		//										System.out.println(i+ 1);
		//										plate.printFood();
			cat.eat(plate);
		//										cat.printSatiety();
			if(middleAppetit > plate.getFood()) {
				plate.putEat(middleAppetit);
		//		System.out.printf("putEAT\n");
			}
		}
	}

}
