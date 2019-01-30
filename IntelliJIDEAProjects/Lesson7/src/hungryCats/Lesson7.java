package hungryCats;

public class Lesson7 {

	public static void main(String[] args) {
		Plate plate = new Plate();
		Cat cat;

		Cat[] cats = new Cat[10];
		for (int i = 0; i < cats.length; i++){
			cats[i] = new Cat();
		}

		for (int i = 0; i < cats.length; i++){
			cat = cats[i];

			System.out.printf("%d \n",i+1);
			plate.printF();
			if(i % 3 == 0) {
				plate.putEat(5);
			}
			cat.eat(plate);
			cat.printS();
		}
	}

}
