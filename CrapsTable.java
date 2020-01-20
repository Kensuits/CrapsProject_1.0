package crapsProject_1;

import java.io.IOException;

public class CrapsTable {
	Roll roll = new Roll();
	Point pt = new Point();
	Passline pass = new Passline();
	Odds odd = new Odds();
	Come cb = new Come();
	DontPass dp = new DontPass();
	Lay lay = new Lay();
	DontCome dc = new DontCome();
	Field fb = new Field();
	Hardways hard = new Hardways();
	PlaceBets place = new PlaceBets();
	PropBet prop = new PropBet();
	HornMenu hM = new HornMenu();
	ActiveBet act = new ActiveBet();

	//The roll of the dice which occurs on a come out roll.
	public boolean pointOff() throws IOException {
		
		Options opt = new Options();
		act.activeBet();
		roll.die1();
		roll.die2();
		roll.call();
		
		switch(Roll.call) {
		case 2:
		case 3:
			pass.checkPass();  //Checks pass line to determine if it wins or loses.
			dp.checkDont();
			fb.checkField();
			prop.checkHop();
			hM.checkHorn();
			break;
		case 7:
			pass.checkPass();  //Checks pass line to determine if it wins or loses.
            dp.checkDont();
            lay.checkLay();
            dc.checkDc();
            fb.checkField();
            hard.checkHard();
            prop.checkHop();
            hM.checkHorn();
			cb.checkComePoint(); //Checks if there are come bets, if so, they lose.
			odd.saveOdds();  //Returns any odds on come bets.
			break;
		case 11:
		case 12:
			pass.checkPass(); //Checks pass line to determine if it wins or loses.
            dp.checkDont();
            fb.checkField();
            prop.checkHop();
            hM.checkHorn();
			break;
		case 4:
		case 5:
		case 6:
		case 8:
		case 9:
		case 10:
			pt.pointIs(); //Sets the Point.
			System.out.println("\t\t\t\t   'The point is " + Point.pnt + "'\n");
			cb.checkComePoint(); //Checks if come bet exists on the point, if so, it wins.
			pass.pointOdds(); //Prompts user to add odds on the pass line.
            lay.checkLay();
            dc.checkDc();
			dp.pointLay();
			fb.checkField();
			hard.checkHard();
			prop.checkHop();
			hM.checkHorn();
			odd.oddsOff(); //Returns the odds of a come bet on the point.
			opt.peMenu();  //Opens "Point Established Menu" all bets are open.
			default:
				break;
		
		}
		return false;
	}
	
	//The roll of the dice when a point is established.
	public boolean pointOn() throws IOException {
		
		Options opt = new Options();
		act.activeBet();
		roll.die1();
		roll.die2();
		roll.call();
		
		if(Roll.call == Point.pnt) {
			System.out.println("\t\t\t\t 'Frontline Winner!'\n");
			pass.checkPass(); //Pays pass line if it exists.
			odd.checkPassOdds(); //Pays odds if they exist.
            dp.checkDont();
            dc.moveTo();
            lay.checkLay();
            fb.checkField();
            hard.checkHard();
            place.checkPlaceBet();
            prop.checkHop();
            hM.checkHorn();
			cb.moveTo(); //Moves come bet to the point, which is then cleared.
			Point.pnt = 0;
			opt.coMenu(); //Returns to "Come Out Roll Menu."
		}
		
		if(Roll.call == 7) {
			System.out.println("\t\t\t\t'Seven out! Line Away!'\n");
			pass.checkPass(); //If pass line exists, it's a loser.
			odd.checkPassOdds(); //If odds exists, they lose.
            dp.checkDont();
            dc.checkDc();
            lay.checkLay();
            fb.checkField();
            hard.checkHard();
            place.checkPlaceBet();
            prop.checkHop();
            hM.checkHorn();
			cb.betWin(); //A come bet is a winner.
			cb.checkComePoint(); //Any come bets on numbers lose.
			Point.pnt = 0;
			opt.coMenu(); //Returns to "Come Out Roll Menu."
		}
		
		switch(Roll.call) {
		case 2:
		case 3:
			cb.checkCome(); //If come bet exists, its a loser.
			fb.checkField();
			prop.checkHop();
			hM.checkHorn();
			break;
		case 4:
		case 5:
		case 6:
		case 8:
		case 9:
		case 10:
			odd.checkComeOdds(); //Pays any odds placed on a come bet located on a number.
			cb.checkComePoint(); //Pays any come bet located on a number.
			cb.moveTo(); //Moves come bet to number rolled.
			lay.checkLay();
			dc.checkDc();
			dc.moveTo();
			fb.checkField();
			hard.checkHard();
			place.checkPlaceBet();
			prop.checkHop();
			hM.checkHorn();
			break;
		case 11:
		case 12:
			cb.checkCome(); //If come bet exists it wins on 11 and loses on 12.
			fb.checkField();
			prop.checkHop();
			hM.checkHorn();
			default:
				break;
		}
		return false;
	}
}
