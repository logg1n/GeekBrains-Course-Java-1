package hungryCats;

public class Plate {
	private int food;
	
	public Plate() {
		this.food = 30;
	}

	protected boolean cutFood(int val) {
		if (val > this.food){
			return false;
		}
		else {
			this.food -= val;
			return true;
		}
	}

	public void putEat( int val){
		this.food += val;
	}
// ########################################################
	public void printF(){
		System.out.printf("plate h foood -> %d\n", this.food);
	}
}
