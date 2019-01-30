package hungryCats;

public class Plate {
	private int food;

	public int getFood(){
		return food;
	}
	
	public Plate() {
		food = 30;
	}

	protected boolean cutFood(int val) {
		food -= val;
		return true;
	}

	public void putEat( int val){
		food += val;
	}
// ########################################################
	public void printF(){
		System.out.printf("plate h foood -> %d\n", food);
	}
}
