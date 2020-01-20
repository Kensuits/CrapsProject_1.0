package crapsProject_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Odds {
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
    public static int oddsBet;
    public static int maxOdds;
    public static int oddsFour, oddsFive, oddsSix, oddsEight, oddsNine, oddsTen;
    

	public Odds() {
		
	}
	
	//Method to create an odds bet.
	public void odds() {
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
				odds4();
				break;
			case 5:
				odds5();
				break;
			case 6:
				odds6();
				break;
			case 8:
				odds8();
				break;
			case 9:
				odds9();
				break;
			case 10:
				odds10();
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
	
	//Checks if the odds on the point wins or loses.
	public void checkPassOdds() {
		if(Roll.call == Point.pnt && Point.pnt == 4) {
			winOdds4();
		}else if(Roll.call == Point.pnt && Point.pnt == 5) {
			winOdds5();
		}else if(Roll.call == Point.pnt && Point.pnt == 6) {
			winOdds6();
		}else if(Roll.call == Point.pnt && Point.pnt == 8) {
			winOdds8();
		}else if(Roll.call == Point.pnt && Point.pnt == 9) {
			winOdds9();
		}else if(Roll.call == Point.pnt && Point.pnt == 10) {
			winOdds10();
		}else if(Point.pnt > 0 && Roll.call == 7) {
			loseOdds4();
			loseOdds5();
			loseOdds6();
			loseOdds8();
			loseOdds9();
			loseOdds10();
		}
	}
	
	//Checks if odds on a come bet wins or loses.
	public void checkComeOdds() {
		if(Come.comeFour > 0 && Roll.call == 4) {
			winOdds4();
		}else if(Come.comeFive > 0 && Roll.call == 5) {
			winOdds5();
		}else if(Come.comeSix > 0 && Roll.call == 6) {
			winOdds6();
		}else if(Come.comeEight > 0 && Roll.call == 8) {
			winOdds8();
		}else if(Come.comeNine > 0 && Roll.call == 9) {
			winOdds9();
		}else if(Come.comeTen > 0 && Roll.call == 10) {
			winOdds10();
		}else if(Roll.call == 7) {
			loseOdds4();
			loseOdds5();
			loseOdds6();
			loseOdds8();
			loseOdds9();
			loseOdds10();
		}
	}
	
	//Creates an odds bet on 4.
	public void odds4() {
		
		if(oddsFour > 0) {
			Bankroll.balance = Bankroll.balance + oddsFour;
		}
		
		System.out.print("How Much = $");
		
		try {
		oddsFour = Integer.parseInt(br.readLine());
		maxOdds = Come.comeFour * 3;
		int exist = Come.comeFour;
		int pass = Passline.passBet;
		int passMax = pass * 3;
		
		if(exist > 0 || pass > 0 && oddsFour <= passMax || oddsFour <= maxOdds && oddsFour <= Bankroll.balance) {
			Bankroll.balance = Bankroll.balance - oddsFour;
		}else {
			System.out.println("No Bet!");
		}

		}catch(Exception e) {
			System.out.println("Invalid Entry");
		}
	}
	
	//How to pay for odds on 4.
	public int winOdds4() {
		int win = oddsFour * 2;
		oddsFour = (oddsFour * 2) + oddsFour;
		Bankroll.balance = Bankroll.balance + oddsFour;
		if(Odds.oddsFour > 0) {
			System.out.println("Odds on Four Wins = $" + win + "\n");
		}
		oddsFour = 0;
		return oddsFour;
	}
	
	public int loseOdds4() {
		if(Odds.oddsFour > 0) {
			System.out.println("Odds on Four Loses.\n");
		}
		oddsFour = oddsFour * 0;
		return oddsFour;
	}
	
	//Creates an odds bet on 5.
	public void odds5() {
		
		if(oddsFive > 0) {
			Bankroll.balance = Bankroll.balance + oddsFive;
		}
		
		System.out.print("How Much = $");
		
		try {
		oddsFive = Integer.parseInt(br.readLine());
		maxOdds = Come.comeFive * 4;
		int exist = Come.comeFive;
		int pass = Passline.passBet;
		int passMax = pass * 4;
		
		if(exist > 0 || pass > 0 && oddsFive <= passMax || oddsFive <= maxOdds && oddsFive <= Bankroll.balance) {
			Bankroll.balance = Bankroll.balance - oddsFive;
		}else {
			System.out.println("No Bet!");
		}

		}catch(Exception e) {
			System.out.println("Invalid Entry");
		}
	}
	
	//How to pay the odds for 5.
	public int winOdds5() {
		int win = oddsFive /2 * 3;
		oddsFive = (oddsFive / 2 * 3) + oddsFive;
		Bankroll.balance = Bankroll.balance + oddsFive;
		if(Odds.oddsFive > 0) {
			System.out.println("Odds on Five Wins = $" + win + "\n");
		}
		oddsFive = 0;
		return oddsFive;
	}
	
	public int loseOdds5() {
		if(Odds.oddsFive > 0) {
			System.out.println("Odds on Five Loses.\n");
		}
		oddsFive = oddsFive * 0;
		return oddsFive;
	}
	
	// Creates an odds bet for 6.
	public void odds6() {
		
		if(oddsSix > 0) {
			Bankroll.balance = Bankroll.balance + oddsSix;
		}
		
		System.out.print("How Much = $");
		
		try {
		oddsSix = Integer.parseInt(br.readLine());
		maxOdds = Come.comeSix * 5;
		int exist = Come.comeSix;
		int pass = Passline.passBet;
		int passMax = pass * 5;
		
		if(exist > 0 || pass > 0 && oddsSix <= passMax || oddsSix <= maxOdds && oddsSix <= Bankroll.balance) {
			Bankroll.balance = Bankroll.balance - oddsSix;
		}else {
			System.out.println("No Bet!");
		}

		}catch(Exception e) {
			System.out.println("Invalid Entry");
		}
	}
	
	//How to pay the odds on 6.
	public int winOdds6() {
		int win = oddsSix / 5 * 6;
		oddsSix = (oddsSix / 5 * 6) + oddsSix;
		Bankroll.balance = Bankroll.balance + oddsSix;
		if(Odds.oddsSix > 0) {
			System.out.println("Odds on Six Wins = $" + win + "\n");
		}
		oddsSix = 0;
		return oddsSix;
	}
	
	public int loseOdds6() {
		if(Odds.oddsSix > 0) {
			System.out.println("Odds on Six Loses.\n");
		}
		oddsSix = oddsSix * 0;
		return oddsSix;
	}
	
	//Creates an odds bet for 8.
	public void odds8() {
		
		if(oddsEight > 0) {
			Bankroll.balance = Bankroll.balance + oddsEight;
		}
		
		System.out.print("How Much = $");
		
		try {
		oddsEight = Integer.parseInt(br.readLine());
		maxOdds = Come.comeEight * 5;
		int exist = Come.comeEight;
		int pass = Passline.passBet;
		int passMax = pass * 5;
		
		if(exist > 0 || pass > 0 && oddsEight <= passMax || oddsEight <= maxOdds && oddsSix <= Bankroll.balance) {
			Bankroll.balance = Bankroll.balance - oddsEight;
		}else {
			System.out.println("No Bet!");
		}

		}catch(Exception e) {
			System.out.println("Invalid Entry");
		}
	}
	
	//How to pay the odds on Eight.
	public int winOdds8() {
		int win = oddsEight / 5 * 6;
		oddsEight = (oddsEight / 5 * 6) + oddsEight;
		Bankroll.balance = Bankroll.balance + oddsEight;
		if(Odds.oddsEight> 0) {
			System.out.println("Odds on Eight Wins = $" + win + "\n");
		}
		oddsEight = 0;
		return oddsEight;
	}
	
	public int loseOdds8() {
		if(Odds.oddsEight > 0) {
			System.out.println("Odds on Eight Loses.\n");
		}
		oddsEight = oddsEight * 0;
		return oddsEight;
	}
	
	//Creates an odds bet for 9.
	public void odds9() {
		
		if(oddsNine > 0) {
			Bankroll.balance = Bankroll.balance + oddsNine;
		}
		
		System.out.print("How Much = $");
		
		try {
		oddsNine = Integer.parseInt(br.readLine());
		maxOdds = Come.comeNine * 4;
		int exist = Come.comeNine;
		int pass = Passline.passBet;
		int passMax = pass * 4;
		
		if(exist > 0 || pass > 0 && oddsNine <= passMax || oddsNine <= maxOdds && oddsFive <= Bankroll.balance) {
			Bankroll.balance = Bankroll.balance - oddsNine;
		}else {
			System.out.println("No Bet!");
		}

		}catch(Exception e) {
			System.out.println("Invalid Entry");
		}
	}
	
	//How to pay the odds on 9.
	public int winOdds9() {
		int win = oddsNine / 2 * 3;
		oddsNine = (oddsNine / 2 * 3) + oddsNine;
		Bankroll.balance = Bankroll.balance + oddsNine;
		if(Odds.oddsNine > 0) {
			System.out.println("Odds on Nine Wins = $" + win + "\n");
		}
		oddsNine = 0;
		return oddsNine;
	}
	
	public int loseOdds9() {
		if(Odds.oddsNine > 0) {
			System.out.println("Odds on Nine Loses.\n");
		}
		oddsNine = oddsNine * 0;
		return oddsNine;
	}
	
	//Creates an odds bet on 10.
	public void odds10() {
		
		if(oddsTen> 0) {
			Bankroll.balance = Bankroll.balance + oddsTen;
		}
		
		System.out.print("How Much = $");
		
		try {
		oddsTen = Integer.parseInt(br.readLine());
		maxOdds = Come.comeTen * 3;
		int exist = Come.comeTen;
		int pass = Passline.passBet;
		int passMax = pass * 3;
		
		if(exist > 0 || pass > 0 && oddsTen <= passMax || oddsTen <= maxOdds && oddsFour <= Bankroll.balance) {
			Bankroll.balance = Bankroll.balance - oddsTen;
		}else {
			System.out.println("No Bet!");
		}

		}catch(Exception e) {
			System.out.println("Invalid Entry");
		}
	}
	
	//How to pay the odds on 10.
	public int winOdds10() {
		int win = oddsTen * 2;
		oddsTen = (oddsTen * 2) + oddsTen;
		Bankroll.balance = Bankroll.balance + oddsTen;
		if(Odds.oddsTen > 0) {
			System.out.println("Odds on Ten Wins = $" + win + "\n");
		}
		oddsTen = 0;
		return oddsTen;
	}
	
	public int loseOdds10() {
		if(Odds.oddsTen > 0) {
			System.out.println("Odds on Ten Loses.\n");
		}
		oddsTen = oddsTen * 0;
		return oddsTen;
	}
		
	//Method to return odds when a 7 rolls on the come out roll.
	public int saveOdds() {
		int saveAll = 0;
		if(oddsFour > 0 || oddsFive > 0 || oddsSix > 0 || oddsEight > 0 || oddsNine > 0 || oddsTen > 0 && Roll.call == 7) {
			saveAll = oddsFour + oddsFive + oddsSix + oddsEight + oddsNine + oddsTen;
			System.out.println("$" + saveAll + " in odds returned.");
			Bankroll.balance = Bankroll.balance + saveAll;
			oddsFour = 0;
			oddsFive = 0;
			oddsSix = 0;
			oddsEight = 0;
			oddsNine = 0;
			oddsTen = 0;
		}
		return saveAll;
		
	}
	
	public int oddsOff() {
		int odds = 0;
		if(oddsFour > 0 && Roll.call == 4) {
			odds = oddsFour;
			Bankroll.balance = Bankroll.balance + odds;
			oddsFour = 0;
			System.out.println("$" + odds + " returned.");
		}else if(oddsFive > 0 && Roll.call == 5) {
			odds = oddsFive;
			Bankroll.balance = Bankroll.balance + odds;
			oddsFive = 0;
			System.out.println("$" + odds + " returned.");
		}else if(oddsSix > 0 && Roll.call == 6) {
			odds = oddsSix;
			Bankroll.balance = Bankroll.balance + odds;
			oddsSix = 0;
			System.out.println("$" + odds + " returned.");
		}else if(oddsEight > 0 && Roll.call == 8) {
			odds = oddsEight;
			Bankroll.balance = Bankroll.balance + odds;
			oddsEight = 0;
			System.out.println("$" + odds + " returned.");
		}else if(oddsNine > 0 && Roll.call == 9) {
			odds = oddsNine;
			Bankroll.balance = Bankroll.balance + odds;
			oddsNine = 0;
			System.out.println("$" + odds + " returned.");
		}else if(oddsTen > 0 && Roll.call == 10) {
			odds = oddsTen;
			Bankroll.balance = Bankroll.balance + odds;
			oddsTen = 0;
			System.out.println("$" + odds + " returned.");
		}
		return odds;
	}

}
