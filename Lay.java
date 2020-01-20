package crapsProject_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lay {
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
    public static int layBet;
    public static int maxDC;
    public static int layFour, layFive, laySix, layEight, layNine, layTen;
    

	public Lay() {
		
	}
	
	public void lay() {
		Options opt = new Options();
		CrapsTable ct = new CrapsTable();
		System.out.println("______________________");
		System.out.println("[4]Four     [8]Eight");
		System.out.println("[5]Five     [9]Nine");
		System.out.println("[6]Six      [10]Ten");
		System.out.println("            [1]Return");
		System.out.println("            [0]Roll");
		System.out.println("______________________");
		
		while(true) {
		try {
			int select = Integer.parseInt(br.readLine());
			switch(select) {
			case 4:
				lay4();
				break;
			case 5:
				lay5();
				break;
			case 6:
				lay6();
				break;
			case 8:
				lay8();
				break;
			case 9:
				lay9();
				break;
			case 10:
				lay10();
				break;
			case 1:
				if(Point.pnt == 0) {
					opt.coMenu();
				}else {
					opt.peMenu();
				}
				break;
			case 0:
				if(Point.pnt == 0) {
					ct.pointOff();
				}else {
					ct.pointOn();
				}
				default:
					break;
			}

		} catch (IOException e) {
			System.out.println("Invalid Entry");
		}
		}
	}
	
	public void checkLay() {
		if(layFour > 0 && Roll.call == 4) {
			loseLay4();
		}else if(layFive > 0 && Roll.call == 5) {
			loseLay5();
		}else if(laySix > 0 && Roll.call == 6) {
			loseLay6();
		}else if(layEight > 0 && Roll.call == 8) {
			loseLay8();
		}else if(layNine > 0 && Roll.call == 9) {
			loseLay9();
		}else if(layTen > 0 && Roll.call == 10) {
			loseLay10();
		}else if(Roll.call == 7) {
			winLay4();
			winLay5();
			winLay6();
			winLay8();
			winLay9();
			winLay10();
		}
	}
	
	public void lay4() {
		
		if(layFour > 0) {
			Bankroll.balance = Bankroll.balance + layFour;
		}
		
		System.out.print("How Much = $");
		
		try {
		layFour = Integer.parseInt(br.readLine());
		maxDC = DontCome.dontFour * 6;
		int exist = DontCome.dontFour;
		int dont = DontPass.dontBet;
		int maxLay = dont * 6;
		int x = layFour / 2;
		int vig = (int) (x * .05);
		
		if(exist > 0 ||dont > 0 && layFour <= maxLay || layFour <= maxDC && layFour <= Bankroll.balance) {
			Bankroll.balance = Bankroll.balance - layFour;
		}		
		else if(exist == 0 || layFour >= 15000 && layFour + vig <= Bankroll.balance) {
			Bankroll.balance = Bankroll.balance - (layFour + vig);
		}else {
			System.out.println("No Bet!");
		}

		}catch(Exception e) {
			System.out.println("Invalid Entry");
		}
	}
	
	public int winLay4() {
		int win = layFour / 2;
		layFour = (layFour / 2) + layFour;
		Bankroll.balance = Bankroll.balance + layFour;
		if(Lay.layFour > 0) {
			System.out.println("Lay Four Wins = $" + win + "\n");
		}
		layFour = 0;
		return layFour;
	}
	
	public int loseLay4() {
		if(Lay.layFour > 0) {
			System.out.println("Lay Four Loses.\n");
		}
		layFour = layFour * 0;
		return layFour;
	}
	
	public void lay5() {
		
		if(layFive > 0) {
			Bankroll.balance = Bankroll.balance + layFive;
		}
		
		System.out.print("How Much = $");
		
		try {
		layFive = Integer.parseInt(br.readLine());
		maxDC = DontCome.dontFive * 6;
		int exist = DontCome.dontFive;
		int x = layFive / 3 * 2;
		int vig = (int) (x * .05);
		
		if(exist > 0 || layFive <= maxDC && layFive <= Bankroll.balance) {
			Bankroll.balance = Bankroll.balance - layFive;
		}		
		else if(exist == 0 || layFive >= 15000 && layFive + vig <= Bankroll.balance) {
			Bankroll.balance = Bankroll.balance - (layFive + vig);
		}else {
			System.out.println("No Bet!");
		}

		}catch(Exception e) {
			System.out.println("Invalid Entry");
		}
	}
	
	public int winLay5() {
		int win = layFive / 3 * 2;
		layFive = (layFive / 3 * 2) + layFive;
		Bankroll.balance = Bankroll.balance + layFive;
		if(Lay.layFive > 0) {
			System.out.println("Lay Five Wins = $" + win + "\n");
		}
		layFive = 0;
		return layFive;
	}
	
	public int loseLay5() {
		if(Lay.layFive > 0) {
			System.out.println("Lay Five Loses.\n");
		}
		layFive = layFive * 0;
		return layFive;
	}
	
	
	public void lay6() {
		
		if(laySix > 0) {
			Bankroll.balance = Bankroll.balance + laySix;
		}
		
		System.out.print("How Much = $");
		
		try {
		laySix = Integer.parseInt(br.readLine());
		maxDC = DontCome.dontSix * 6;
		int exist = DontCome.dontSix;
		int x = laySix / 6 * 5;
		int vig = (int) (x * .05);
		
		if(exist > 0 || laySix <= maxDC && laySix <= Bankroll.balance) {
			Bankroll.balance = Bankroll.balance - laySix;
		}		
		else if(exist == 0 || laySix >= 15000 && laySix + vig <= Bankroll.balance) {
			Bankroll.balance = Bankroll.balance - (laySix + vig);
		}else {
			System.out.println("No Bet!");
		}

		}catch(Exception e) {
			System.out.println("Invalid Entry");
		}
	}
	
	public int winLay6() {
		int win = laySix / 6 * 5;
		laySix = (laySix / 6 * 5) + laySix;
		Bankroll.balance = Bankroll.balance + laySix;
		if(Lay.laySix > 0) {
			System.out.println("Lay Six Wins = $" + win + "\n");
		}
		laySix = 0;
		return laySix;
	}
	
	public int loseLay6() {
		if(Lay.laySix > 0) {
			System.out.println("Lay Six Loses.\n");
		}
		laySix = laySix * 0;
		return laySix;
	}
	
	public void lay8() {
		
		if(layEight > 0) {
			Bankroll.balance = Bankroll.balance + layEight;
		}
		
		System.out.print("How Much = $");
		
		try {
		layEight = Integer.parseInt(br.readLine());
		maxDC = DontCome.dontEight * 6;
		int exist = DontCome.dontEight;
		int x = layEight / 6 * 5;
		int vig = (int) (x * .05);
		
		if(exist > 0 || layEight <= maxDC && layEight <= Bankroll.balance) {
			Bankroll.balance = Bankroll.balance - layEight;
		}		
		else if(exist == 0 || layEight >= 15000 && layEight + vig <= Bankroll.balance) {
			Bankroll.balance = Bankroll.balance - (layEight + vig);
		}else {
			System.out.println("No Bet!");
		}

		}catch(Exception e) {
			System.out.println("Invalid Entry");
		}
	}
	
	public int winLay8() {
		int win = layEight / 6 * 5;
		layEight = (layEight / 6 * 5) + layEight;
		Bankroll.balance = Bankroll.balance + layEight;
		if(Lay.layEight > 0) {
			System.out.println("Lay Eight Wins = $" + win + "\n");
		}
		layEight = 0;
		return layEight;
	}
	
	public int loseLay8() {
		if(Lay.layEight > 0) {
			System.out.println("Lay Eight Loses.\n");
		}
		layEight = layEight * 0;
		return layEight;
	}
	
	public void lay9() {
		
		if(layNine > 0) {
			Bankroll.balance = Bankroll.balance + layNine;
		}
		
		System.out.print("How Much = $");
		
		try {
		layNine = Integer.parseInt(br.readLine());
		maxDC = DontCome.dontNine * 6;
		int exist = DontCome.dontNine;
		int x = layNine / 3 * 2;
		int vig = (int) (x * .05);
		
		if(exist > 0 || layNine <= maxDC && layNine <= Bankroll.balance) {
			Bankroll.balance = Bankroll.balance - layNine;
		}		
		else if(exist == 0 || layNine >= 15000 && layNine + vig <= Bankroll.balance) {
			Bankroll.balance = Bankroll.balance - (layNine + vig);
		}else {
			System.out.println("No Bet!");
		}

		}catch(Exception e) {
			System.out.println("Invalid Entry");
		}
	}
	
	public int winLay9() {
		int win = layNine / 3 * 2;
		layNine = (layNine / 3 * 2) + layNine;
		Bankroll.balance = Bankroll.balance + layNine;
		if(Lay.layNine > 0) {
			System.out.println("Lay Nine Wins = $" + win + "\n");
		}
		layNine = 0;
		return layNine;
	}
	
	public int loseLay9() {
		if(Lay.layNine > 0) {
			System.out.println("Lay Nine Loses.\n");
		}
		layNine = layNine * 0;
		return layNine;
	}
	
	public void lay10() {
		
		if(layTen > 0) {
			Bankroll.balance = Bankroll.balance + layTen;
		}
		
		System.out.print("How Much = $");
		
		try {
		layTen = Integer.parseInt(br.readLine());
		maxDC = DontCome.dontTen * 6;
		int x = layTen / 2;
		int exist = DontCome.dontTen;
		int vig = (int) (x * .05);
		
		if(exist > 0 || layTen <= maxDC && layTen <= Bankroll.balance) {
			Bankroll.balance = Bankroll.balance - layTen;
		}		
		else if(exist == 0 || layTen >= 15000 && layTen + vig <= Bankroll.balance) {
			Bankroll.balance = Bankroll.balance - (layTen + vig);
		}else {
			System.out.println("No Bet!");
		}

		}catch(Exception e) {
			System.out.println("Invalid Entry");
		}
	}
	
	public int winLay10() {
		int win = layTen / 2;
		layTen = (layTen / 2) + layTen;
		Bankroll.balance = Bankroll.balance + layTen;
		if(Lay.layTen > 0) {
			System.out.println("Lay Ten Wins = $" + win + "\n");
		}
		layTen = 0;
		return layTen;
	}
	
	public int loseLay10() {
		if(Lay.layTen > 0) {
			System.out.println("Lay Ten Loses.\n");
		}
		layTen = layTen * 0;
		return layTen;
	}
		

}
