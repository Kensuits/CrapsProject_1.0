package crapsProject_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PropBet {
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
    HopFour h4 = new HopFour();
    HopFive h5 = new HopFive();
    HopSix h6 = new HopSix();
    HopSeven h7 = new HopSeven();
    HopEight h8 = new HopEight();
    HopNine h9 = new HopNine();
    HopTen h10 = new HopTen();
    AnyCrap aC = new AnyCrap();
    Horn hb = new Horn();
    HornMenu hm = new HornMenu();
	
	public PropBet() {
		
	}
	
	public void coPropMenu() {
		Options opt = new Options();
	    CrapsTable ct = new CrapsTable();
	    
		try {
			System.out.println("______________________");
			System.out.println("[1]Four    [6]Nine");
			System.out.println("[2]Five    [7]Ten");
			System.out.println("[3]Six     [8]Any Crap");
			System.out.println("[4]Seven   [9]Horn Bet");
			System.out.println("[5]Eight   [10]Return");
			System.out.println("           [0]Roll");
			System.out.println("______________________");
			
			while(true) {
				int select = Integer.parseInt(br.readLine());
				switch(select) {
				case 1:
					h4.hopFour();
					break;
				case 2:
					h5.hopFive();
					break;
				case 3:
					h6.hopSix();
					break;
				case 4:
					h7.hopSeven();
					break;
				case 5:
					h8.hopEight();
					break;
				case 6:
					h9.hopNine();
					break;
				case 7:
					h10.hopTen();
					break;
				case 8:
					aC.anyCrap();
					break;
				case 9:
					hm.coHornMenu();
					break;
				case 10:
					opt.coMenu();
					break;
				case 0:
					ct.pointOff();
					break;
					default:
						break;
				}
			}
			
		}catch(Exception e) {
			System.out.println("Invalid Entry");
		}
	}
	public void pePropMenu() {
		Options opt = new Options();
	    CrapsTable ct = new CrapsTable();
		
		try {
			System.out.println("______________________");
			System.out.println("[1]Four    [6]Nine");
			System.out.println("[2]Five    [7]Ten");
			System.out.println("[3]Six     [8]Any Crap");
			System.out.println("[4]Seven   [9]Horn Bet");
			System.out.println("[5]Eight   [10]Return");
			System.out.println("           [0]Roll");
			System.out.println("______________________");
			
			while(true) {
				int select = Integer.parseInt(br.readLine());
				switch(select) {
				case 1:
					h4.hopFour();
					break;
				case 2:
					h5.hopFive();
					break;
				case 3:
					h6.hopSix();
					break;
				case 4:
					h7.hopSeven();
					break;
				case 5:
					h8.hopEight();
					break;
				case 6:
					h9.hopNine();
					break;
				case 7:
					h10.hopTen();
					break;
				case 8:
					aC.anyCrap();
					break;
				case 9:
					hb.horn();
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
	
	public void checkHop() {
		switch(Roll.call) {
		case 2:
			aC.betWin();
			h4.betLose(); h5.betLose(); h6.betLose(); h7.betLose(); h8.betLose(); h9.betLose(); h10.betLose();
            break;
		case 3:
			aC.betWin();
			h4.betLose(); h5.betLose(); h6.betLose(); h7.betLose(); h8.betLose(); h9.betLose(); h10.betLose();
            break;
		case 4:
			h4.betWin();
			aC.betLose(); h5.betLose(); h6.betLose(); h7.betLose(); h8.betLose(); h9.betLose(); h10.betLose();
            break;	
		case 5:
			h5.betWin();
			h4.betLose(); aC.betLose(); h6.betLose(); h7.betLose(); h8.betLose(); h9.betLose(); h10.betLose();
            break;
		case 6:
			h6.betWin();
			h4.betLose(); h5.betLose(); aC.betLose(); h7.betLose(); h8.betLose(); h9.betLose(); h10.betLose();
            break;
		case 7:
			h7.betWin();
			h4.betLose(); h5.betLose(); h6.betLose(); aC.betLose(); h8.betLose(); h9.betLose(); h10.betLose();
            break;
		case 8:
			h8.betWin();
			h4.betLose(); h5.betLose(); h6.betLose(); h7.betLose(); aC.betLose(); h9.betLose(); h10.betLose();
            break;
		case 9:
			h9.betWin();
			h4.betLose(); h5.betLose(); h6.betLose(); h7.betLose(); h8.betLose(); aC.betLose(); h10.betLose();
            break;
		case 10:
			h10.betWin();
			h4.betLose(); h5.betLose(); h6.betLose(); h7.betLose(); h8.betLose(); h9.betLose(); aC.betLose();
            break;
		case 11:
			aC.betLose(); h4.betLose(); h5.betLose(); h6.betLose(); h7.betLose(); h8.betLose(); h9.betLose(); h10.betLose();
            break;
		case 12:
			aC.betWin();
			h4.betLose(); h5.betLose(); h6.betLose(); h7.betLose(); h8.betLose(); h9.betLose(); h10.betLose();
            break;	
		    default:
				break;
		}
	}
//***********************************************************************
}

class HopFour implements Wager{
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
	public static int hop4;
	public static int remain4;
	
	public void hopFour() {
		System.out.println("There are two variations of a 4.");
		
		try {
			System.out.print("How Much? = $");
			hop4 = Integer.parseInt(br.readLine());
			remain4 = hop4 % 2;
			Bankroll.balance = Bankroll.balance + remain4;
			if(Bankroll.balance >= hop4 || hop4 <= 1000) {
				Bankroll.balance = Bankroll.balance - hop4;
			}

		} catch (NumberFormatException | IOException e) {
			System.out.println("No Bet!");
		}
	}
	
	@Override
	public int betWin() {
		if(Roll.d1 == Roll.d2) {
			hop4 = (hop4 / 2) * 30 + (hop4 / 2);
			Bankroll.balance = Bankroll.balance + hop4;
		}else {
			hop4 = (hop4 / 2 ) * 15 + (hop4 / 2);
			Bankroll.balance = Bankroll.balance + hop4;
		}
		if(HopFour.hop4 > 0) {
			System.out.println("Hop Fours Wins! = $" + hop4);
		}
		//CrapsLog.update();
		hop4 = 0;
		return hop4;
	}

	@Override
	public int betLose() {
		if(HopFour.hop4 > 0) {
			System.out.println("Hop Fours loses.\n");
		}
		hop4 = 0;
		//CrapsLog.update();
		return hop4;
	}
	
}

class HopFive implements Wager{
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
	public static int hop5;
	public static int remain5;
	
	public void hopFive() {
		System.out.println("There are two variations of a 5.");
		
		try {
			System.out.print("How Much? = $");
			hop5 = Integer.parseInt(br.readLine());
			remain5 = hop5 % 2;
			Bankroll.balance = Bankroll.balance + remain5;
			if(Bankroll.balance >= hop5 || hop5 <= 2000) {
				Bankroll.balance = Bankroll.balance - hop5;
			}

		} catch (NumberFormatException | IOException e) {
			System.out.println("No Bet!");
		}
	}
	
	@Override
	public int betWin() {

		hop5 = (hop5 / 2) * 15 + (hop5 / 2);
		Bankroll.balance = Bankroll.balance + hop5;
		if(HopFive.hop5 > 0) {
			System.out.println("Hop Fives Wins! = $" + hop5);
		}
		//CrapsLog.update();
		hop5 = 0;
		return hop5;
	}

	@Override
	public int betLose() {
		if(HopFive.hop5 > 0) {
			System.out.println("Hop Fives loses.\n");
		}
		hop5 = 0;
		//CrapsLog.update();
		return hop5;
	}
}

class HopSix implements Wager{
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
	public static int hop6;
	public static int remain6;
	
	public void hopSix() {
		System.out.println("There are three variations of a 6.");
		
		try {
			System.out.print("How Much? = $");
			hop6 = Integer.parseInt(br.readLine());
			remain6 = hop6 % 3;
			Bankroll.balance = Bankroll.balance + remain6;
			if(Bankroll.balance >= hop6 || hop6 <= 1500) {
				Bankroll.balance = Bankroll.balance - hop6;
			}

		} catch (NumberFormatException | IOException e) {
			System.out.println("No Bet!");
		}
	}
	
	@Override
	public int betWin() {
		if(Roll.d1 == Roll.d2) {
			hop6 = (hop6 / 3) * 30 + (hop6 / 3);
			Bankroll.balance = Bankroll.balance + hop6;
		}else {
			hop6 = (hop6 / 3 ) * 15 + (hop6 / 3);
			Bankroll.balance = Bankroll.balance + hop6;
		}
		if(HopSix.hop6 > 0) {
			System.out.println("Hop Sixes Wins! = $" + hop6);
		}
		//CrapsLog.update();
		hop6 = 0;
		return hop6;
	}

	@Override
	public int betLose() {
		if(HopSix.hop6 > 0) {
			System.out.println("Hop Sixes loses.\n");
		}
		hop6 = 0;
		//CrapsLog.update();
		return hop6;
	}
	
}

class HopSeven implements Wager{
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
	public static int hop7;
	public static int remain7;
	
	public void hopSeven() {
		System.out.println("There are three variations of a 7.");
		
		try {
			System.out.print("How Much? = $");
			hop7 = Integer.parseInt(br.readLine());
			remain7 = hop7 % 3;
			Bankroll.balance = Bankroll.balance + remain7;
			if(Bankroll.balance >= hop7 || hop7 <= 3000) {
				Bankroll.balance = Bankroll.balance - hop7;
			}

		} catch (NumberFormatException | IOException e) {
			System.out.println("No Bet!");
		}
	}
	
	@Override
	public int betWin() {

		hop7 = (hop7 / 3) * 15 + (hop7 / 3);
		Bankroll.balance = Bankroll.balance + hop7;
		if(HopSeven.hop7 > 0) {
			System.out.println("Hop Sevens Wins! = $" + hop7);
		}
		//CrapsLog.update();
		hop7 = 0;
		return hop7;
	}

	@Override
	public int betLose() {
		if(HopSeven.hop7 > 0) {
			System.out.println("Hop Sevens loses.\n");
		}
		hop7 = 0;
		//CrapsLog.update();
		return hop7;
	}
}

class HopEight implements Wager{
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
	public static int hop8;
	public static int remain8;
	
	public void hopEight() {
		System.out.println("There are three variations of an 8.");
		
		try {
			System.out.print("How Much? = $");
			hop8 = Integer.parseInt(br.readLine());
			remain8 = hop8 % 3;
			Bankroll.balance = Bankroll.balance + remain8;
			if(Bankroll.balance >= hop8 || hop8 <= 1500) {
				Bankroll.balance = Bankroll.balance - hop8;
			}

		} catch (NumberFormatException | IOException e) {
			System.out.println("No Bet!");
		}
	}
	
	@Override
	public int betWin() {
		if(Roll.d1 == Roll.d2) {
			hop8 = (hop8 / 3) * 30 + (hop8 / 3);
			Bankroll.balance = Bankroll.balance + hop8;
		}else {
			hop8 = (hop8 / 3 ) * 15 + (hop8 / 3);
			Bankroll.balance = Bankroll.balance + hop8;
		}
		if(HopEight.hop8 > 0) {
			System.out.println("Hop Eights Wins! = $" + hop8);
		}
		//CrapsLog.update();
		hop8 = 0;
		return hop8;
	}

	@Override
	public int betLose() {
		if(HopEight.hop8 > 0) {
			System.out.println("Hop Eights loses.\n");
		}
		hop8 = 0;
		//CrapsLog.update();
		return hop8;
	}
	
}

class HopNine implements Wager{
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
	public static int hop9;
	public static int remain9;
	
	public void hopNine() {
		System.out.println("There are two variations of a 9.");
		
		try {
			System.out.print("How Much? = $");
			hop9 = Integer.parseInt(br.readLine());
			remain9 = hop9 % 2;
			Bankroll.balance = Bankroll.balance + remain9;
			if(Bankroll.balance >= hop9 || hop9 <= 2000) {
				Bankroll.balance = Bankroll.balance - hop9;
			}

		} catch (NumberFormatException | IOException e) {
			System.out.println("No Bet!");
		}
	}
	
	@Override
	public int betWin() {

		hop9 = (hop9 / 2) * 15 + (hop9 / 2);
		Bankroll.balance = Bankroll.balance + hop9;
		if(HopNine.hop9 > 0) {
			System.out.println("Hop Nines Wins! = $" + hop9);
		}
		//CrapsLog.update();
		hop9 = 0;
		return hop9;
	}

	@Override
	public int betLose() {
		if(HopNine.hop9 > 0) {
			System.out.println("Hop Nines loses.\n");
		}
		hop9 = 0;
		//CrapsLog.update();
		return hop9;
	}
}

class HopTen implements Wager{
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
	public static int hop10;
	public static int remain10;
	
	public void hopTen() {
		System.out.println("There are two variations of a 10.");
		
		try {
			System.out.print("How Much? = $");
			hop10 = Integer.parseInt(br.readLine());
			remain10 = hop10 % 2;
			Bankroll.balance = Bankroll.balance + remain10;
			if(Bankroll.balance >= hop10 || hop10 <= 1000) {
				Bankroll.balance = Bankroll.balance - hop10;
			}

		} catch (NumberFormatException | IOException e) {
			System.out.println("No Bet!");
		}
	}
	
	@Override
	public int betWin() {
		if(Roll.d1 == Roll.d2) {
			hop10 = (hop10 / 2) * 30 + (hop10 / 2);
			Bankroll.balance = Bankroll.balance + hop10;
		}else {
			hop10 = (hop10 / 2 ) * 15 + (hop10 / 2);
			Bankroll.balance = Bankroll.balance + hop10;
		}
		if(HopTen.hop10 > 0) {
			System.out.println("Hop Tens Wins! = $" + hop10);
		}
		//CrapsLog.update();
		hop10 = 0;
		return hop10;
	}

	@Override
	public int betLose() {
		if(HopTen.hop10 > 0) {
			System.out.println("Hop Tens loses.\n");
		}
		hop10 = 0;
		//CrapsLog.update();
		return hop10;
	}
	
}

class HornMenu {
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
    Horn hb = new Horn();
    HornH12 hb12 = new HornH12();
    HornHYo hbYo = new HornHYo();
    HornHAd hbAd = new HornHAd();
    HornHAces hbAce = new HornHAces();
    Twelve twelve = new Twelve();
    YoEleven yo = new YoEleven();
    Aces aces = new Aces();
    AceDuece aceD = new AceDuece();

	public HornMenu() {
		
	}
	
	public void coHornMenu() {
		Options opt = new Options();
	    CrapsTable ct = new CrapsTable();
	    
		try {
			System.out.println("_____________________________");
			System.out.println("[1]Horn          [6]Twelve");
			System.out.println("[2]Horn High 12  [7]Eleven");
			System.out.println("[3]Horn High 11  [8]Ace/Duece");
			System.out.println("[4]Horn High 1/2 [9]Aces");
			System.out.println("[5]Horn High 1/1 [10]Return");
			System.out.println("                 [0]Roll");
			System.out.println("_____________________________");
			
			while(true) {
				int select = Integer.parseInt(br.readLine());
				switch(select) {
				case 1:
					hb.horn();
					break;
				case 2:
					hb12.horn();
					break;
				case 3:
					hbYo.horn();
					break;
				case 4:
					hbAd.horn();
					break;
				case 5:
					hbAce.horn();
					break;
				case 6:
					twelve.twelve();
					break;
				case 7:
					yo.eleven();
					break;
				case 8:
					aceD.aceDuece();
					break;
				case 9:
					aces.aces();
					break;
				case 10:
					opt.coMenu();
					break;
				case 0:
					ct.pointOff();
					break;
					default:
						break;
				}
			}
		}catch(Exception e) {
			System.out.println("Invalid Entry");
		}
	}
	
	public void peHornMenu() {
		Options opt = new Options();
	    CrapsTable ct = new CrapsTable();
	    
		try {
			System.out.println("_____________________________");
			System.out.println("[1]Horn          [6]Twelve");
			System.out.println("[2]Horn High 12  [7]Eleven");
			System.out.println("[3]Horn High 11  [8]Ace/Duece");
			System.out.println("[4]Horn High 1/2 [9]Aces");
			System.out.println("[5]Horn High 1/1 [10]Return");
			System.out.println("                 [0]Roll");
			System.out.println("_____________________________");
			
			while(true) {
				int select = Integer.parseInt(br.readLine());
				switch(select) {
				case 1:
					hb.horn();
					break;
				case 2:
					hb12.horn();
					break;
				case 3:
					hbYo.horn();
					break;
				case 4:
					hbAd.horn();
					break;
				case 5:
					hbAce.horn();
					break;
				case 6:
					twelve.twelve();
					break;
				case 7:
					yo.eleven();
					break;
				case 8:
					aceD.aceDuece();
					break;
				case 9:
					aces.aces();
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
	
	public void checkHorn() {
		if(Roll.call == 2 || Roll.call == 3 || Roll.call == 11 || Roll.call == 12) {
			hb.betWin();
			hbAce.betWin();
			hbAd.betWin();
			hbYo.betWin();
			hb12.betWin();
		}else {
			hb.betLose();
			hbAce.betLose();
			hbAd.betLose();
			hbYo.betLose();
			hb12.betLose();
		}
		if(Roll.call == 2) {
			aces.betWin();
		}else if(Roll.call == 3) {
			aceD.betWin();
		}else if(Roll.call == 11) {
			yo.betWin();
		}else if(Roll.call == 12) {
			twelve.betWin();
		}else {
			aces.betLose();
			aceD.betLose();
			yo.betLose();
			twelve.betLose();
		}
	}
}

class Horn implements Wager{
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
	public static int horn;
	public static int remainHorn;
	
	public void horn() {
		System.out.println("There are four numbers in a horn.");
		
		try {
			System.out.print("How Much? = $");
			horn = Integer.parseInt(br.readLine());
			remainHorn = horn % 4;
			Bankroll.balance = Bankroll.balance + remainHorn;
			if(Bankroll.balance >= horn || horn <= 2000) {
				Bankroll.balance = Bankroll.balance - horn;
			}

		} catch (NumberFormatException | IOException e) {
			System.out.println("No Bet!");
		}
	}
	
	@Override
	public int betWin() {
		if(Roll.d1 == Roll.d2) {
			horn = (horn / 4) * 30 + (horn / 4);
			Bankroll.balance = Bankroll.balance + horn;
		}else {
			horn = (horn / 4 ) * 15 + (horn / 4);
			Bankroll.balance = Bankroll.balance + horn;
		}
		if(Horn.horn > 0) {
			System.out.println("Horn Wins! = $" + horn);
		}
		//CrapsLog.update();
		horn = 0;
		return horn;
	}

	@Override
	public int betLose() {
		if(Horn.horn > 0) {
			System.out.println("Horn loses.\n");
		}
		horn = 0;
		//CrapsLog.update();
		return horn;
	}
	
}

class HornHAces implements Wager{
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
	public static int horn2;
	public static int remainHorn2;
	
	public void horn() {
		System.out.println("Bet in increments of 5.");
		
		try {
			System.out.print("How Much? = $");
			horn2 = Integer.parseInt(br.readLine());
			remainHorn2 = horn2 % 5;
			Bankroll.balance = Bankroll.balance + remainHorn2;
			if(Bankroll.balance >= horn2 || horn2 <= 1250) {
				Bankroll.balance = Bankroll.balance - horn2;
			}

		} catch (NumberFormatException | IOException e) {
			System.out.println("No Bet!");
		}
	}
	
	@Override
	public int betWin() {
		if(Roll.d1 + Roll.d2 == 12) {
			horn2 = (horn2 /5) * 30 * 2 + (horn2 / 5 * 2);
			Bankroll.balance = Bankroll.balance + horn2;
		}
		else if(Roll.d1 == Roll.d2){
			horn2 = (horn2 / 5) * 30 + (horn2 / 5);
			Bankroll.balance = Bankroll.balance + horn2;
		}else {
		
			horn2 = (horn2 / 4 ) * 15 + (horn2 / 4);
			Bankroll.balance = Bankroll.balance + horn2;
		}
		if(HornHAces.horn2 > 0) {
			System.out.println("Horn High Aces Wins! = $" + horn2);
		}
		//CrapsLog.update();
		horn2 = 0;
		return horn2;
	}

	@Override
	public int betLose() {
		if(HornHAces.horn2 > 0) {
			System.out.println("Horn High Aces loses.\n");
		}
		horn2 = 0;
		//CrapsLog.update();
		return horn2;
	}
	
}

class HornHAd implements Wager{
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
	public static int hornHAd;
	public static int remainHornAd;
	
	public void horn() {
		System.out.println("Bet in increments of 5.");
		
		try {
			System.out.print("How Much? = $");
			hornHAd = Integer.parseInt(br.readLine());
			remainHornAd = hornHAd % 5;
			Bankroll.balance = Bankroll.balance + remainHornAd;
			if(Bankroll.balance >= hornHAd || hornHAd <= 2500) {
				Bankroll.balance = Bankroll.balance - hornHAd;
			}

		} catch (NumberFormatException | IOException e) {
			System.out.println("No Bet!");
		}
	}
	
	@Override
	public int betWin() {
		if(Roll.d1 + Roll.d2 == 3) {
			hornHAd = (hornHAd /5) * 15 * 2 + (hornHAd / 5 * 2);
			Bankroll.balance = Bankroll.balance + hornHAd;
		}
		else if(Roll.d1 == Roll.d2){
			hornHAd = (hornHAd / 5) * 30 + (hornHAd / 5);
			Bankroll.balance = Bankroll.balance + hornHAd;
		}else {
		
			hornHAd = (hornHAd / 4 ) * 15 + (hornHAd / 4);
			Bankroll.balance = Bankroll.balance + hornHAd;
		}
		if(HornHAd.hornHAd > 0) {
			System.out.println("Horn High Ace Duece Wins! = $" + hornHAd);
		}
		//CrapsLog.update();
		hornHAd = 0;
		return hornHAd;
	}

	@Override
	public int betLose() {
		if(HornHAd.hornHAd > 0) {
			System.out.println("Horn High Ace Duece loses.\n");
		}
		hornHAd = 0;
		//CrapsLog.update();
		return hornHAd;
	}
	
}

class HornHYo implements Wager{
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
	public static int hornHYo;
	public static int remainHornYo;
	
	public void horn() {
		System.out.println("Bet in increments of 5.");
		
		try {
			System.out.print("How Much? = $");
			hornHYo = Integer.parseInt(br.readLine());
			remainHornYo = hornHYo % 5;
			Bankroll.balance = Bankroll.balance + remainHornYo;
			if(Bankroll.balance >= hornHYo || hornHYo <= 2500) {
				Bankroll.balance = Bankroll.balance - hornHYo;
			}

		} catch (NumberFormatException | IOException e) {
			System.out.println("No Bet!");
		}
	}
	
	@Override
	public int betWin() {
		if(Roll.d1 + Roll.d2 == 11) {
			hornHYo = (hornHYo /5) * 15 * 2 + (hornHYo / 5 * 2);
			Bankroll.balance = Bankroll.balance + hornHYo;
		}
		else if(Roll.d1 == Roll.d2){
			hornHYo = (hornHYo / 5) * 30 + (hornHYo / 5);
			Bankroll.balance = Bankroll.balance + hornHYo;
		}else {
		
			hornHYo = (hornHYo / 4 ) * 15 + (hornHYo / 4);
			Bankroll.balance = Bankroll.balance + hornHYo;
		}
		if(HornHYo.hornHYo > 0) {
			System.out.println("Horn High Yo Wins! = $" + hornHYo);
		}
		//CrapsLog.update();
		hornHYo = 0;
		return hornHYo;
	}

	@Override
	public int betLose() {
		if(HornHYo.hornHYo > 0) {
			System.out.println("Horn High Yo loses.\n");
		}
		hornHYo = 0;
		//CrapsLog.update();
		return hornHYo;
	}
	
}
class HornH12 implements Wager{
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
	public static int horn12;
	public static int remainHorn12;
	
	public void horn() {
		System.out.println("Bet in increments of 5.");
		
		try {
			System.out.print("How Much? = $");
			horn12 = Integer.parseInt(br.readLine());
			remainHorn12 = horn12 % 5;
			Bankroll.balance = Bankroll.balance + remainHorn12;
			if(Bankroll.balance >= horn12 || horn12 <= 1250) {
				Bankroll.balance = Bankroll.balance - horn12;
			}

		} catch (NumberFormatException | IOException e) {
			System.out.println("No Bet!");
		}
	}
	
	@Override
	public int betWin() {
		if(Roll.d1 + Roll.d2 == 12) {
			horn12 = (horn12 /5) * 30 * 2 + (horn12 / 5 * 2);
			Bankroll.balance = Bankroll.balance + horn12;
		}
		else if(Roll.d1 == Roll.d2){
			horn12 = (horn12 / 5) * 30 + (horn12 / 5);
			Bankroll.balance = Bankroll.balance + horn12;
		}else {
		
			horn12 = (horn12 / 4 ) * 15 + (horn12 / 4);
			Bankroll.balance = Bankroll.balance + horn12;
		}
		if(HornH12.horn12 > 0) {
			System.out.println("Horn High 12 Wins! = $" + horn12);
		}
		//CrapsLog.update();
		horn12 = 0;
		return horn12;
	}

	@Override
	public int betLose() {
		if(HornH12.horn12 > 0) {
			System.out.println("Horn High 12 loses.\n");
		}
		horn12 = 0;
		//CrapsLog.update();
		return horn12;
	}
	
}

class Aces implements Wager{
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
	public static int aces;
	
	public void aces() {
		
		try {
			System.out.print("How Much? = $");
			aces = Integer.parseInt(br.readLine());
			if(Bankroll.balance >= aces || aces <= 500) {
				Bankroll.balance = Bankroll.balance - aces;
			}

		} catch (NumberFormatException | IOException e) {
			System.out.println("No Bet!");
		}
	}
	
	@Override
	public int betWin() {
		if(Roll.call == 2) {
			aces = aces * 30 + aces;
			Bankroll.balance = Bankroll.balance + aces;
		}
		if(Aces.aces > 0) {
			System.out.println("Aces wins = $" + aces);
		}
		aces = 0;
		return aces;
	}

	@Override
	public int betLose() {
		if(Aces.aces > 0) {
			System.out.println("Aces loses.\n");
		}
		aces = 0;
		return aces;
	}
	
}

class AceDuece implements Wager{
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
	public static int three;
	
	public void aceDuece() {
		
		try {
			System.out.print("How Much? = $");
			three = Integer.parseInt(br.readLine());
			if(Bankroll.balance >= three || three <= 1000) {
				Bankroll.balance = Bankroll.balance - three;
			}

		} catch (NumberFormatException | IOException e) {
			System.out.println("No Bet!");
		}
	}
	
	@Override
	public int betWin() {
		if(Roll.call == 3) {
			three = three * 15 + three;
			Bankroll.balance = Bankroll.balance + three;
		}
		if(AceDuece.three > 0) {
			System.out.println("Ace Duece wins = $" + three);
		}
		three = 0;
		return three;
	}

	@Override
	public int betLose() {
		if(AceDuece.three > 0) {
			System.out.println("Ace Duece loses.\n");
		}
		three = 0;
		return three;
	}
	
}

class YoEleven implements Wager{
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
	public static int eleven;
	
	public void eleven() {
		
		try {
			System.out.print("How Much? = $");
			eleven = Integer.parseInt(br.readLine());
			if(Bankroll.balance >= eleven || eleven <= 1000) {
				Bankroll.balance = Bankroll.balance - eleven;
			}

		} catch (NumberFormatException | IOException e) {
			System.out.println("No Bet!");
		}
	}
	
	@Override
	public int betWin() {
		if(Roll.call == 11) {
			eleven = eleven * 15 + eleven;
			Bankroll.balance = Bankroll.balance + eleven;
		}
		if(YoEleven.eleven > 0) {
			System.out.println("Yo Eleven wins = $" + eleven);
		}
		//CrapsLog.update();
		eleven = 0;
		return eleven;
	}

	@Override
	public int betLose() {
		if(YoEleven.eleven > 0) {
			System.out.println("Yo Eleven loses.\n");
		}
		eleven = 0;
		//CrapsLog.update();
		return eleven;
	}
	
}

class Twelve implements Wager{
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
	public static int twelve;
	
	public void twelve() {
		
		try {
			System.out.print("How Much? = $");
			twelve = Integer.parseInt(br.readLine());
			if(Bankroll.balance >= twelve || twelve <= 500) {
				Bankroll.balance = Bankroll.balance - twelve;
			}

		} catch (NumberFormatException | IOException e) {
			System.out.println("No Bet!");
		}
	}
	
	@Override
	public int betWin() {
		if(Roll.call == 12) {
			twelve = twelve * 30 + twelve;
			Bankroll.balance = Bankroll.balance + twelve;
		}
		if(Twelve.twelve > 0) {
			System.out.println("Twelve wins = $" + twelve);
		}
		//CrapsLog.update();
		twelve = 0;
		return twelve;
	}

	@Override
	public int betLose() {
		if(Twelve.twelve > 0) {
			System.out.println("Twelve loses.\n");
		}
		twelve = 0;
		//CrapsLog.update();
		return twelve;
	}
	
}

class AnyCrap implements Wager{
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
	public static int anyCrap;
	
	public void anyCrap() {
		
		try {
			System.out.print("How Much? = $");
			anyCrap = Integer.parseInt(br.readLine());
			if(Bankroll.balance >= anyCrap || anyCrap <= 2142) {
				Bankroll.balance = Bankroll.balance - anyCrap;
			}

		} catch (NumberFormatException | IOException e) {
			System.out.println("No Bet!");
		}
	}
	
	@Override
	public int betWin() {

		anyCrap = anyCrap * 7 + anyCrap;
		Bankroll.balance = Bankroll.balance + anyCrap;
		if(AnyCrap.anyCrap > 0) {
			System.out.println("Any Crap = $" + anyCrap);
		}
		anyCrap = 0;
		return anyCrap;
	}

	@Override
	public int betLose() {
		if(AnyCrap.anyCrap > 0) {
			System.out.println("Any Crap loses.\n");
		}
		anyCrap = 0;
		return anyCrap;
	}
}

