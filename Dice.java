package crapsProject_1;

public class Dice implements Die{
	
	@SuppressWarnings("unused")
	private int sides;

	public Dice(int sides) {
	this.sides = sides;
	

	}	

	@Override
	public int go() {

		return ((int) (Math.random() * 6) + 1);

	}

}
