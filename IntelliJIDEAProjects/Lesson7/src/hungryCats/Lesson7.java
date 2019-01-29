package hungryCats;

public class Lesson7 {

	public static void main(String[] args) {
		Plate plate = new Plate();

		Cat[] cats = new Cat[10];
		for (int i = 0; i < cats.length; i++){
			cats[i] = new Cat();
		}

		for (int i = 0; i < cats.length; i++){
			 cats[i].eat(plate);
			 if(!cats[i].getSatiety()) {
				 plate.putEat(cats[i].getAppetite());
				 cats[i].eat(plate);
			 }
			cats[i].printS();
		}
	}

}
