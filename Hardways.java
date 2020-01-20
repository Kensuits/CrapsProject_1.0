package crapsProject_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hardways {
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
    HardFour hard4 = new HardFour();
    HardSix hard6 = new HardSix();
    HardEight hard8 = new HardEight();
    HardTen hard10 = new HardTen();
    
    public Hardways() {
    	
    }
    
    public void hardMenu() {
    	Options opt = new Options();
    	CrapsTable ct = new CrapsTable();
    	
    	try {
    		System.out.println("___________________________");
    		System.out.println("[1]Hard Four  [6]High Four");
    		System.out.println("[2]Hard Six   [7]High Six");
    		System.out.println("[3]Hard Eight [8]High Eight");
    		System.out.println("[4]Hard Ten   [9]High Ten");
    		System.out.println("[5]All Hards  [10]Return");
    		System.out.println("              [0]Roll");
    		System.out.println("___________________________");
    		
			while(true) {
				int select = Integer.parseInt(br.readLine());
				switch(select) {
				case 1:
					hard4.hard4();
					break;
				case 2:
					hard6.hard6();
					break;
				case 3: 
					hard8.hard8();
					break;
				case 4:
					hard10.hard10();
					break;
				case 5:
					allHards();
					break;
				case 6:
					hardHighFour();
					break;
				case 7:
					hardHighSix();
					break;
				case 8:
					hardHighEight();
					break;
				case 9:
					hardHighTen();
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
 
    
    public void allHards() throws NumberFormatException, IOException {
    	System.out.println("Bet in increments of four.");
    	System.out.print("How Much? = $");
    	
    	try {
    	int allHard = Integer.parseInt(br.readLine());
    	int each = allHard / 4;
    	if(Bankroll.balance >= allHard && allHard <= 6400) {
    		Bankroll.balance = Bankroll.balance - allHard;
    		HardFour.hard4 = each;
    		HardSix.hard6 = each;
    		HardEight.hard8 = each;
    		HardTen.hard10 = each;
    	}
    	}catch (NumberFormatException e) {
			System.out.println("No Bet!");
		}
    	
    }
    
    public void hardHighFour() throws NumberFormatException, IOException {
    	System.out.println("Bet in increments of five.");
    	System.out.print("How Much? = $");
    	
    	try {
    	int allHard = Integer.parseInt(br.readLine());
    	int each = allHard / 5;
    	if(Bankroll.balance >= allHard && allHard <= 5357) {
    		Bankroll.balance = Bankroll.balance - allHard;
    		HardFour.hard4 = each * 2;
    		HardSix.hard6 = each;
    		HardEight.hard8 = each;
    		HardTen.hard10 = each;
    	}
    	}catch (NumberFormatException e) {
			System.out.println("No Bet!");
		}
    	
    }
    
    public void hardHighSix() throws NumberFormatException, IOException {
    	System.out.println("Bet in increments of five.");
    	System.out.print("How Much? = $");
    	
    	try {
    	int allHard = Integer.parseInt(br.readLine());
    	int each = allHard / 5;
    	if(Bankroll.balance >= allHard && allHard <= 4166) {
    		Bankroll.balance = Bankroll.balance - allHard;
    		HardFour.hard4 = each;
    		HardSix.hard6 = each * 2;
    		HardEight.hard8 = each;
    		HardTen.hard10 = each;
    	}
    	}catch (NumberFormatException e) {
			System.out.println("No Bet!");
		}
    	
    }
    
    public void hardHighEight() throws NumberFormatException, IOException {
    	System.out.println("Bet in increments of five.");
    	System.out.print("How Much? = $");
    	
    	try {
    	int allHard = Integer.parseInt(br.readLine());
    	int each = allHard / 5;
    	if(Bankroll.balance >= allHard && allHard <= 4166) {
    		Bankroll.balance = Bankroll.balance - allHard;
    		HardFour.hard4 = each;
    		HardSix.hard6 = each;
    		HardEight.hard8 = each * 2;
    		HardTen.hard10 = each;
    	}
    	}catch (NumberFormatException e) {
			System.out.println("No Bet!");
		}
    	
    }
    
    public void hardHighTen() throws NumberFormatException, IOException {
    	System.out.println("Bet in increments of five.");
    	System.out.print("How Much? = $");
    	
    	try {
    	int allHard = Integer.parseInt(br.readLine());
    	int each = allHard / 5;
    	if(Bankroll.balance >= allHard && allHard <= 5357) {
    		Bankroll.balance = Bankroll.balance - allHard;
    		HardFour.hard4 = each;
    		HardSix.hard6 = each;
    		HardEight.hard8 = each;
    		HardTen.hard10 = each * 2;
    	}
    	}catch (NumberFormatException e) {
			System.out.println("No Bet!");
		}
    	
    }
    
    public void checkHard() {
    	hard4.checkHard4();
    	hard6.checkHard6();
    	hard8.checkHard8();
    	hard10.checkHard10();
    }
}

class HardFour implements Wager {
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
	public static int hard4;
	
	public void hard4() throws IOException {
		System.out.print("How Much? = $");
		
		try {
			hard4 = Integer.parseInt(br.readLine());
			if(Bankroll.balance >= hard4 && hard4 <= 2142) {
				Bankroll.balance = Bankroll.balance - hard4;
			}
			
		} catch (NumberFormatException e) {
			System.out.println("No Bet!");
		}
	}

    public void checkHard4() {
		if(Roll.d1 == Roll.d2 && Roll.call == 4) {
			betWin();
		}else if(Roll.call == 7 || Roll.d1 != Roll.d2 && Roll.call == 4){
			betLose();
		}
		
	}
	
	@Override
	public int betWin() {
		hard4 = hard4 * 7;
		Bankroll.balance = Bankroll.balance + hard4;
		if(HardFour.hard4 > 0) {
			System.out.println("Hard 4 Wins = $" + hard4);
		}
		//CrapsLog.update();
		hard4 = hard4 / 7;
		return hard4;
	}

	@Override
	public int betLose() {
		if(HardFour.hard4 > 0) {
			System.out.println("Hard Four Loses.");
		}
		hard4 = 0;
		return hard4;
	}
	
	

}

class HardSix implements Wager {
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
	public static int hard6;
	
	public void hard6() throws IOException {
		System.out.print("How Much? = $");
		
		try {
			hard6 = Integer.parseInt(br.readLine());
			if(Bankroll.balance >= hard6 && hard6 <= 1666) {
				Bankroll.balance = Bankroll.balance - hard6;
			}
			
		} catch (NumberFormatException e) {
			System.out.println("No Bet!");
		}
	}

	public void checkHard6() {
		if(Roll.d1 == Roll.d2 && Roll.call == 6) {
			betWin();
		}else if(Roll.call == 7 || Roll.d1 != Roll.d2 && Roll.call == 6){
			betLose();
		}
		
	}
	@Override
	public int betWin() {
		hard6 = hard6 * 9;
		Bankroll.balance = Bankroll.balance + hard6;
		if(HardSix.hard6 > 0) {
			System.out.println("Hard 6 Wins = $" + hard6);
		}
		//CrapsLog.update();
		hard6 = hard6 / 9;
		return hard6;
	}

	@Override
	public int betLose() {
		if(HardSix.hard6 > 0) {
			System.out.println("Hard Six Loses.");
		}
		hard6 = 0;
		return hard6;
	}
	
	

}

class HardEight implements Wager {
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
	public static int hard8;
	
	public void hard8() throws IOException {
		System.out.print("How Much? = $");
		
		try {
			hard8 = Integer.parseInt(br.readLine());
			if(Bankroll.balance >= hard8 && hard8 <= 1666) {
				Bankroll.balance = Bankroll.balance - hard8;
			}
			
		} catch (NumberFormatException e) {
			System.out.println("No Bet!");
		}
	}

	public void checkHard8() {
		if(Roll.d1 == Roll.d2 && Roll.call == 8) {
			betWin();
		}else if(Roll.call == 7 || Roll.d1 != Roll.d2 && Roll.call == 8){
			betLose();
		}
		}
	
	@Override
	public int betWin() {
	    hard8 = hard8 * 9;
	    Bankroll.balance = Bankroll.balance + hard8;
		if(HardEight.hard8 > 0) {
			System.out.println("Hard 8 Wins = $" + hard8);
		}
		//CrapsLog.update();
		hard8 = hard8 / 9;
		return hard8;
	}

	@Override
	public int betLose() {
		if(HardEight.hard8 > 0) {
			System.out.println("Hard Eight Loses.");
		}
		hard8 = 0;
		return hard8;
	}
	
	

}

class HardTen implements Wager {
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
	public static int hard10;
	
	public void hard10() throws IOException {
		System.out.print("How Much? = $");
		
		try {
			hard10 = Integer.parseInt(br.readLine());
			if(Bankroll.balance >= hard10 && hard10 <= 2142) {
				Bankroll.balance = Bankroll.balance - hard10;
			}
			
		} catch (NumberFormatException e) {
			System.out.println("No Bet!");
		}
	}

	public void checkHard10() {
		if(Roll.d1 == Roll.d2 && Roll.call == 10) {
			betWin();
		}else if(Roll.call == 7 || Roll.d1 != Roll.d2 && Roll.call == 10){
			betLose();
		}
		
	}
	
	@Override
	public int betWin() {
		hard10 = hard10 * 7;
		Bankroll.balance = Bankroll.balance + hard10;
		if(HardTen.hard10 > 0) {
			System.out.println("Hard 10 Wins = $" + hard10);
		}
		//CrapsLog.update();
		hard10 = hard10 / 7;
		return hard10;
	}

	@Override
	public int betLose() {
		if(HardTen.hard10 > 0) {
			System.out.println("Hard Ten Loses.");
		}
		hard10 = 0;
		return hard10;
	}
	
	

}
