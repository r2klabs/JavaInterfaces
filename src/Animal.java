
public class Animal {

	protected int weight;
	protected int height;
	
	public Animal() {
		this.weight = 0;
		this.height = 0;
	}//end empty-argument constructor
	
	public Animal(int weight, int height) {

		this.weight = weight;
		this.height = height;
	}//preferred constructor
	
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Animal [weight=" + weight + ", height=" + height + "]";
	}//end toString
	
	
}//end class
