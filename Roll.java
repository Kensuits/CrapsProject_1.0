package crapsProject_1;

public class Roll implements Die {
	private Die[] dice;
	public static int d1, d2, call;
	Dice roll = new Dice(6);
	//ActiveBet act = new ActiveBet();

	public Roll(Die...die) {
		this.dice = die;
		die.toString();
	}
		
	public int die1() {
		d1 = roll.go();
		System.out.print("\n\t\t\t\t-------[" + d1 + "] ");
		return d1;
	
	}
	
	public int die2() {
		d2 = roll.go();
		System.out.println("[" + d2 + "]-------");
		return d2;
	}
	
	public int call() {
		call = d1 + d2;
		System.out.println("\t\t\t\t\t (" + call + ")\n");
		//act.activeBet();
		//CrapsLog.update();
		return call;
	}

	

	@Override
	public int go() {

		int response = ((int) (Math.random() * 6) + 1);
		for (Die d : dice) {
			response += d.go();
		}
		return response;

	}

}
