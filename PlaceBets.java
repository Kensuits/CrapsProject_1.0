package crapsProject_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PlaceBets {
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
    Inside in = new Inside();
    Outside out = new Outside();
    Across acr = new Across();
    public static int remain;
    PlaceFour p4 = new PlaceFour();
    PlaceFive p5 = new PlaceFive();
    PlaceSix p6 = new PlaceSix();
    PlaceEight p8 = new PlaceEight();
    PlaceNine p9 = new PlaceNine();
    PlaceTen p10 = new PlaceTen();
    
    public PlaceBets() {
    	
    }
    
    public void placeMenu() {
    	Options opt = new Options();
        CrapsTable ct = new CrapsTable();
    	
    	try {
    		System.out.println("___________________________");
    		System.out.println("[1]Four     [7]Inside");
    		System.out.println("[2]Five     [8]Outside");
    		System.out.println("[3]Six      [9]Across");
    		System.out.println("[4]Eight    [10]Return");
    		System.out.println("[5]Nine     [0]Roll");
    		System.out.println("[6]Ten");
    		System.out.println("___________________________");
    		
			while(true) {
				int select = Integer.parseInt(br.readLine());
				switch(select) {
				case 1:
					Four();
					break;
				case 2:
					Five();
					break;
				case 3:
					Six();
					break;
				case 4:
					Eight();
					break;
				case 5:
					Nine();
					break;
				case 6:
					Ten();
					break;
				case 7:
					in.inside();
					break;
				case 8:
					out.outside();
					break;
				case 9:
					acr.across();
					break;
				case 10:
					opt.peMenu();
					break;
				case 0:
					ct.pointOn();
					break;
					default:
						break;
				}
			}
    	}catch(Exception e) {
			System.out.println("Invalid Entry");
    	}
    }
    
    public void checkPlaceBet() {
        p4.check();
        p5.check();
        p6.check();
        p8.check();
        p9.check();
        p10.check();
    }
    
    
    public void Four()  throws NumberFormatException, IOException {
    	System.out.print("How Much? = $");
    	
    	try {
    		int place4 = Integer.parseInt(br.readLine());
    		if(Bankroll.balance >= place4 && place4 <= 2500) {
        		remain = place4 % 5;
        		Bankroll.balance = Bankroll.balance + remain;
        		
        		if(remain >0) {
        			System.out.println("$" + remain + " change.");
        		}
    			Bankroll.balance = Bankroll.balance - place4;
    			PlaceFour.place4 = place4;
    		}else if(place4 > Bankroll.balance) {
    			System.out.println("You don't have enough money.");
    		}else if(place4 < 5) {
    			System.out.println("$5 is the minimum bet.");
    		}else if(place4 > 2500) {
    			System.out.println("$2500 is the max bet.");
    		}
    	}catch (NumberFormatException e) {
			System.out.println("No Bet!");
		}
    }



    
    
    public void Five()  throws NumberFormatException, IOException {
    	System.out.print("How Much? = $");
	
    	try {
    		int place5 = Integer.parseInt(br.readLine());
    		if(Bankroll.balance >= place5 && place5 <= 2500) {
        		remain = place5 % 5;
        		Bankroll.balance = Bankroll.balance + remain;
        		
        		if(remain >0) {
        			System.out.println("$" + remain + " change.");
        		}
    			Bankroll.balance = Bankroll.balance - place5;
    			PlaceFive.place5 = place5;
    		}
    		else if(place5 > Bankroll.balance) {
    			System.out.println("You don't have enough money.");
    		}else if(place5 < 5) {
    			System.out.println("$5 is the minimum bet.");
    		}else if(place5 > 2500) {
    			System.out.println("$2500 is the max bet.");
    		}
    	}catch (NumberFormatException e) {
    		System.out.println("No Bet!");
    	}
    }
    
    
    
    
    public void Six()  throws NumberFormatException, IOException {
    	System.out.print("How Much? = $");
	
    	try {
    		
    		int place6 = Integer.parseInt(br.readLine());
    		if(Bankroll.balance >= place6 && place6 <= 3000 && place6 >= 6) {
        		remain = place6 % 6;
        		Bankroll.balance = Bankroll.balance + remain;
        		
        		if(remain >0) {
        			System.out.println("$" + remain + " change.");
        		}
        		
    			Bankroll.balance = Bankroll.balance - place6;
    			PlaceSix.place6 = place6;
    			System.out.println("$" + (PlaceSix.place6 - remain) + " on the six.");
    		
    		}else if(place6 > Bankroll.balance) {
    			System.out.println("You don't have enough money.");
    		}else if(place6 < 6) {
    			System.out.println("$6 is the minimum bet.");
    		}else if(place6 > 3000) {
    			System.out.println("$3000 is the max bet.");
    		}
    	}catch (NumberFormatException e) {
    		System.out.println("No Bet!");
    	}
    }
    
    
    
    
    public void Eight()  throws NumberFormatException, IOException {
    	System.out.print("How Much? = $");
	
    	try {
    		int place8 = Integer.parseInt(br.readLine());
    		if(Bankroll.balance >= place8 && place8 <= 3000) {
        		remain = place8 % 6;
        		Bankroll.balance = Bankroll.balance + remain;
        		
        		if(remain >0) {
        			System.out.println("$" + remain + " change.");
        		}
        		
    			Bankroll.balance = Bankroll.balance - place8;
    			PlaceEight.place8 = place8;
    		}else if(place8 > Bankroll.balance) {
    			System.out.println("You don't have enough money.");
    		}else if(place8 < 6) {
    			System.out.println("$6 is the minimum bet.");
    		}else if(place8 > 3000) {
    			System.out.println("$3000 is the max bet.");
    		}
    	}catch (NumberFormatException e) {
    		System.out.println("No Bet!");
    	}
    }
    
    
    
    
    public void Nine()  throws NumberFormatException, IOException {
    	System.out.print("How Much? = $");
	
    	try {
    		int place9 = Integer.parseInt(br.readLine());
    		if(Bankroll.balance >= place9 && place9 <= 2500) {
        		remain = place9 % 5;
        		Bankroll.balance = Bankroll.balance + remain;
        		
        		if(remain >0) {
        			System.out.println("$" + remain + " change.");
        		}
        		
    			Bankroll.balance = Bankroll.balance - place9;
    			PlaceNine.place9 = place9;
    		}else if(place9 > Bankroll.balance) {
    			System.out.println("You don't have enough money.");
    		}else if(place9 < 5) {
    			System.out.println("$5 is the minimum bet.");
    		}else if(place9 > 2500) {
    			System.out.println("$2500 is the max bet.");
    		}
    	}catch (NumberFormatException e) {
    		System.out.println("No Bet!");
    	}
    }
    
    
    
    
    public void Ten()  throws NumberFormatException, IOException {
    	System.out.print("How Much? = $");
	
    	try {
    		int place10 = Integer.parseInt(br.readLine());
    		if(Bankroll.balance >= place10 && place10 <= 2500) {
        		remain = place10 % 5;
        		Bankroll.balance = Bankroll.balance + remain;
        		
        		if(remain >0) {
        			System.out.println("$" + remain + " change.");
        		}
    			Bankroll.balance = Bankroll.balance - place10;
    			PlaceTen.place10 = place10;
    		}else if(place10 > Bankroll.balance) {
    			System.out.println("You don't have enough money.");
    		}else if(place10 < 5) {
    			System.out.println("$5 is the minimum bet.");
    		}else if(place10 > 2500) {
    			System.out.println("$2500 is the max bet.");
    		}
    	}catch (NumberFormatException e) {
    		System.out.println("No Bet!");
    	}
    }
    


}

class Inside {
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
    
	public Inside() {
		
	}
	
	public void inside() throws NumberFormatException, IOException {
		int inside;
		int each;
		int cap;
		
		switch(Point.pnt) {
		case 4:
		case 10:
			System.out.println("Bet should be in $22 increments.");
			inside = Integer.parseInt(br.readLine());
			cap = inside % 20;
			each = (inside - cap) / 4;
			PlaceFive.place5 = each;
			PlaceSix.place6 = (cap / 2) + each;
			PlaceEight.place8 = (cap / 2) + each;
			PlaceNine.place9 = each;
			Bankroll.balance = Bankroll.balance - inside;
			break;
		case 5:
			System.out.println("Bet should be in $17 increments.");
			inside = Integer.parseInt(br.readLine());
			cap = inside % 15;
			each = (inside - cap) / 3;
			PlaceSix.place6 = (cap / 2) + each;
			PlaceEight.place8 = (cap / 2) + each;
			PlaceNine.place9 = each;
			Bankroll.balance = Bankroll.balance - inside;
			break;
		case 6:
			System.out.println("Bet should be in $16 increments.");
			inside = Integer.parseInt(br.readLine());
			cap = inside % 15;
			each = (inside - cap) / 3;
			PlaceFive.place5 = each;
			PlaceEight.place8 = (cap / 2) + each;
			PlaceNine.place9 = each;
			Bankroll.balance = Bankroll.balance - inside;
			break;
		case 8:
			System.out.println("Bet should be in $16 increments.");
			inside = Integer.parseInt(br.readLine());
			cap = inside % 15;
			each = (inside - cap) / 3;
			PlaceFive.place5 = each;
			PlaceSix.place6 = (cap / 2) + each;
			PlaceNine.place9 = each;
			Bankroll.balance = Bankroll.balance - inside;
			break;
		case 9:
			System.out.println("Bet should be in $17 increments.");
			inside = Integer.parseInt(br.readLine());
			cap = inside % 15;
			each = (inside - cap) / 3;
			PlaceFive.place5 = each;
			PlaceSix.place6 = (cap / 2) + each;
			PlaceEight.place8 = (cap / 2) + each;
			Bankroll.balance = Bankroll.balance - inside;
			default:
				break;
		}
	}
	
}

class Outside {
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
    
    public Outside() {
    	
    }
    
    public void outside() throws NumberFormatException, IOException {
		int outside;
		int each;
		
		switch(Point.pnt) {
		case 6:
		case 8:
			System.out.println("Bet in increments of 4.");
			outside = Integer.parseInt(br.readLine());
			each = outside / 4;
			PlaceFour.place4 = each;
			PlaceFive.place5 = each;
			PlaceNine.place9 = each;
			PlaceTen.place10 = each;
			Bankroll.balance = Bankroll.balance - outside;
			break;
		case 4:
			System.out.println("Bet in increments of 3.");
			outside = Integer.parseInt(br.readLine());
			each = outside / 3;
			PlaceFive.place5 = each;
			PlaceNine.place9 = each;
			PlaceTen.place10 = each;
			Bankroll.balance = Bankroll.balance - outside;
			break;
		case 5:
			System.out.println("Bet in increments of 3.");
			outside = Integer.parseInt(br.readLine());
			each = outside / 3;
			PlaceFour.place4 = each;
			PlaceNine.place9 = each;
			PlaceTen.place10 = each;
			Bankroll.balance = Bankroll.balance - outside;
			break;
		case 9:
			System.out.println("Bet in increments of 3.");
			outside = Integer.parseInt(br.readLine());
			each = outside / 3;
			PlaceFour.place4 = each;
			PlaceFive.place5 = each;
			PlaceTen.place10 = each;
			Bankroll.balance = Bankroll.balance - outside;
			break;
		case 10:
			System.out.println("Bet in increments of 3.");
			outside = Integer.parseInt(br.readLine());
			each = outside / 3;
			PlaceFour.place4 = each;
			PlaceFive.place5 = each;
			PlaceNine.place9 = each;
			Bankroll.balance = Bankroll.balance - outside;
			break;
			default:
				break;
		}
    }

}

class Across {
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
    
    public Across() {
    	
    }
    
    public void across() throws NumberFormatException, IOException {
		int across;
		int each;
		int unit;
		int change;
		
		switch(Point.pnt) {
		case 4:
			System.out.println("Bet in increments of 27.");
			across = Integer.parseInt(br.readLine());
			if(across <= Bankroll.balance && across > 27 && across <= 13500) {
			unit = across / 27;
			change = across % 27;
			across = across - change;
			each = (across - (unit * 2)) / 5;
			PlaceFive.place5 = each;
			PlaceSix.place6 = unit + each;
			PlaceEight.place8 = unit + each;
			PlaceNine.place9 = each;
		    PlaceTen.place10 = each;
		    Bankroll.balance = Bankroll.balance - across;
			}else {
				System.out.println("No Bet!");
			}
		    break;
		case 5:
			System.out.println("Bet in increments of 27.");
			across = Integer.parseInt(br.readLine());
			if(across <= Bankroll.balance && across > 27 && across <= 13500) {
			unit = across / 27;
			change = across % 27;
			across = across - change;
			each = (across - (unit * 2)) / 5;
			PlaceFour.place4 = each;
			PlaceSix.place6 = unit + each;
			PlaceEight.place8 = unit + each;
			PlaceNine.place9 = each;
		    PlaceTen.place10 = each;
		    Bankroll.balance = Bankroll.balance - across;
			}else {
				System.out.println("No Bet!");
			}
		    break;
		case 6:
			System.out.println("Bet in increments of 26.");
			across = Integer.parseInt(br.readLine());
			if(across <= Bankroll.balance && across > 26 && across <= 13000) {
			unit = across / 26;
			change = across % 26;
			across = across - change;
			each = (across - unit) / 5;
			PlaceFour.place4 = each;
			PlaceFive.place5 = each;
			PlaceEight.place8 = unit + each;
			PlaceNine.place9 = each;
		    PlaceTen.place10 = each;
		    Bankroll.balance = Bankroll.balance - across;
			}else {
				System.out.println("No Bet!");
			}
		    break;
		case 8:
			System.out.println("Bet in increments of 26.");
			across = Integer.parseInt(br.readLine());
			if(across <= Bankroll.balance && across > 26 && across <= 13000) {
			unit = across / 26;
			change = across % 26;
			across = across - change;
			each = (across - unit) / 5;
			PlaceFour.place4 = each;
			PlaceFive.place5 = each;
			PlaceSix.place6 = unit + each;
			PlaceNine.place9 = each;
		    PlaceTen.place10 = each;
		    Bankroll.balance = Bankroll.balance - across;
			}else {
				System.out.println("No Bet!");
			}
		    break;
		case 9:
			System.out.println("Bet in increments of 27.");
			across = Integer.parseInt(br.readLine());
			if(across <= Bankroll.balance && across > 27 && across <= 13500) {
			unit = across / 27;
			change = across % 27;
			across = across - change;
			each = (across - (unit * 2)) / 5;
			PlaceFour.place4 = each;
			PlaceFive.place5 = each;
			PlaceSix.place6 = unit + each;
			PlaceEight.place8 = unit + each;
		    PlaceTen.place10 = each;
		    Bankroll.balance = Bankroll.balance - across;
			}else {
				System.out.println("No Bet!");
			}
		    break;
		case 10:
			System.out.println("Bet in increments of 27.");
			across = Integer.parseInt(br.readLine());
			if(across <= Bankroll.balance && across > 27 && across <= 13500) {
			unit = across / 27;
			change = across % 27;
			across = across - change;
			each = (across - (unit * 2)) / 5;
			PlaceFour.place4 = each;
			PlaceFive.place5 = each;
			PlaceSix.place6 = unit + each;
			PlaceEight.place8 = unit + each;
			PlaceNine.place9 = each;
		    Bankroll.balance = Bankroll.balance - across;
			}else {
				System.out.println("No Bet!");
			}
		    break;
			default:
				break;
		}
		
    }
    
}

class PlaceFour implements Wager{
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
	public static int place4;
	
	public void check() {
		if (Roll.call == 4) {
			betWin();
		}else if(Roll.call == 7){
			betLose();
		}
	}

	@Override
	public int betWin() {
		int pl4 = place4;
		int vig = (int) (place4 * .05);
		
		if(place4 < 20) {
			place4 = (place4 / 5) * 9;
			Bankroll.balance = Bankroll.balance + place4;
		}else if(place4 >= 20) {
			place4 = place4 * 2 - vig;
			Bankroll.balance = Bankroll.balance + place4;
		}
		if(PlaceFour.place4 > 0) {
			System.out.println("Place 4 wins = $" + place4);
		}
		//CrapsLog.update();
		place4 = pl4;
		return place4;
	}

	@Override
	public int betLose() {
		if(PlaceFour.place4 > 0) {
			System.out.println("Place Four loses.");
		}
		place4 = 0;
		return place4;
	}

}

class PlaceFive implements Wager{
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
	public static int place5;
	
	public void check() {
		if (Roll.call == 5) {
			betWin();
		}else if(Roll.call == 7){
			betLose();
		}
	}

	@Override
	public int betWin() {
		place5 = (place5 / 5) * 7;
		if(PlaceFive.place5 > 0) {
			System.out.println("Place five wins = $" + place5);
			Bankroll.balance =Bankroll.balance + place5;
		}
		//CrapsLog.update();
		place5 = (place5 / 7) * 5;
		return place5;
	}

	@Override
	public int betLose() {
		if(PlaceFive.place5 > 0) {
			System.out.println("Place five loses.");
		}
		place5 = 0;
		return place5;
	}
}

class PlaceSix implements Wager{
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
	public static int place6;
	
	public void check() {
		if (Roll.call == 6) {
			betWin();
		}else if(Roll.call == 7){
			betLose();
		}
	}

	@Override
	public int betWin() {
		place6 = (place6 / 6) * 7;
		if(PlaceSix.place6 > 0) {
			System.out.println("Place six wins = $" + place6);
			Bankroll.balance =Bankroll.balance + place6;
		}
		//CrapsLog.update();
		place6 = (place6 / 7) * 6;
		return place6;
	}

	@Override
	public int betLose() {
		if(PlaceSix.place6 > 0) {
			System.out.println("Place six loses.");
		}
		place6 = 0;
		return place6;
	}
}

class PlaceEight implements Wager{
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
	public static int place8;
	
	public void check() {
		if (Roll.call == 8) {
			betWin();
		}else if(Roll.call == 7){
			betLose();
		}
	}

	@Override
	public int betWin() {
		place8 = (place8 / 6) * 7;
		if(PlaceEight.place8 > 0) {
			System.out.println("Place eight wins = $" + place8);
			Bankroll.balance =Bankroll.balance + place8;
		}
		//CrapsLog.update();
		place8 = (place8 / 7) * 6;
		return place8;
	}

	@Override
	public int betLose() {
		if(PlaceEight.place8 > 0) {
			System.out.println("Place eight loses.");
		}
		place8 = 0;
		return place8;
	}
}

class PlaceNine  implements Wager{
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
	public static int place9;
	
	public void check() {
		if (Roll.call == 9) {
			betWin();
		}else if(Roll.call == 7){
			betLose();
		}
	}

	@Override
	public int betWin() {
		place9 = (place9 / 5) * 7;
		if(PlaceNine.place9 > 0) {
			System.out.println("Place nine wins = $" + place9);
			Bankroll.balance =Bankroll.balance + place9;
		}
		//CrapsLog.update();
		place9 = (place9 / 7) * 5;
		return place9;
	}

	@Override
	public int betLose() {
		if(PlaceNine.place9 > 0) {
			System.out.println("Place nine loses.");
		}
		place9 = 0;
		return place9;
	}


}

class PlaceTen implements Wager{
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
	public static int place10;
	
	public void check() {
		if (Roll.call == 10) {
			betWin();
		}else if(Roll.call == 7){
			betLose();
		}
	}

	@Override
	public int betWin() {
		int pl10 = place10;
		int vig = (int) (place10 * .05);
		
		if(place10 < 20) {
			place10 = (place10 / 5) * 9;
			Bankroll.balance = Bankroll.balance + place10;
		}else if(place10 >= 20) {
			place10 = place10 * 2 - vig;
			Bankroll.balance = Bankroll.balance + place10;
		}
		if(PlaceTen.place10 > 0) {
			System.out.println("Place 10 wins = $" + place10);
		}
		//CrapsLog.update();
		place10 = pl10;
		return place10;
	}

	@Override
	public int betLose() {
		if(PlaceTen.place10 > 0) {
			System.out.println("Place Ten loses.");
		}
		place10 = 0;
		return place10;
	}

}
