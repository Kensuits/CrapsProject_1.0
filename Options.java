package crapsProject_1;

import java.io.*;

public class Options {
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
    CrapsTable ct = new CrapsTable();
    Passline pass = new Passline();
    Come cb = new Come();
    Odds odd = new Odds();
    DontPass dp = new DontPass();
    Lay lay = new Lay();
    DontCome dc = new DontCome();
    Field fb = new Field();
    Hardways hard = new Hardways();
    PlaceBets place = new PlaceBets();
    PropBet prop = new PropBet();
    Horn horn = new Horn();
    
    public Options() {
    	
    }
    
    //The main menu, this is where the game starts.
	public void coMenu() throws IOException {
		
		
		System.out.print("\n  ---- " + Player.name + " - $" + Bankroll.balance + " ----\n");
		System.out.println("     THE COME OUT ROLL   ");
		System.out.println("___________________________\n");
		System.out.println("[1]Passline   [5]Bets Work");
		System.out.println("[2]Don't Pass [6]Cashout");
		System.out.println("[3]Field Bet  [7]Rebuy");
		System.out.println("[4]Prop Bet   [0]Roll Dice");
		System.out.println("___________________________");
		
		while(true) {
		int select = Integer.parseInt(br.readLine());
		
		switch(select) {
		case 1:
			pass.passBet();
			break;
		case 2: 
			dp.dontBet();
			break;
		case 3:
			fb.fieldBet();
			break;
		case 4:
			prop.coPropMenu();
			break;
		case 5:
			peMenu();
			break;
		case 6:
			CrapsLog.cashout();
			System.out.println("$" + Bankroll.balance);
		case 7:
			CrapsLog.rebuy();
			System.out.println("$" + Bankroll.balance);
		case 0:
			ct.pointOff();
			default:
				break;
		}
		}
	}
		
        //This menu is used when there is a point established.
	    //All bets are available.
		public void peMenu() throws IOException {
			
			
			System.out.print("\n  ---- " + Player.name + " - $" + Bankroll.balance + " ----\n");
			System.out.println("    The Point is = " + Point.pnt);
			System.out.println("____________________________\n");
			System.out.println("[1]Come Bet   [8]Prop Bet");
			System.out.println("[2]Don't Come [9]Horn Bet");
			System.out.println("[3]Field Bet  [10]Bets Off");
			System.out.println("[4]Odds       [11]Cashout");
			System.out.println("[5]Lay Bet    [12]Rebuy");
			System.out.println("[6]Place Bet  [0]Roll Dice");
			System.out.println("[7]Hardways   ");
			System.out.println("____________________________");
			while(true) {
			int select = Integer.parseInt(br.readLine());
			
			switch(select) {
			case 1:
				cb.comeBet();
				break;
			case 2:
				dc.dontComeBet();
				break;
			case 3:
				fb.fieldBet();
				break;
			case 4:
				odd.odds();
				break;
			case 5:
				lay.lay();
				break;
			case 6:
				place.placeMenu();
				break;
			case 7:	
				hard.hardMenu();
				break;
			case 8:
				prop.pePropMenu();
				break;
			case 9:
				horn.horn();
				break;
			case 10:
			case 11:
				CrapsLog.cashout();
				System.out.println("$" + Bankroll.balance);
				break;
			case 12:
				CrapsLog.rebuy();
				System.out.println("$" + Bankroll.balance);
			case 0:
				ct.pointOn();
				default:
					break;
			}
			}
	}
}
	
