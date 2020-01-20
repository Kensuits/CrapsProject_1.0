package crapsProject_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DontCome implements Wager{
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
    public static int dontComeBet;
    public static int dontFour, dontFive, dontSix, dontEight, dontNine, dontTen;
    Lay lay = new Lay();
    DontComeFour dc4 = new DontComeFour();
    DontComeFive dc5 = new DontComeFive();
    DontComeSix dc6 = new DontComeSix();
    DontComeEight dc8 = new DontComeEight();
    DontComeNine dc9 = new DontComeNine();
    DontComeTen dc10 = new DontComeTen();

	public DontCome() {
		
	}
	
	public void dontComeBet() {
		
		if(dontComeBet > 0) {
			Bankroll.balance = Bankroll.balance + dontComeBet;
		}
		
		System.out.print("Don't Come Bet = $");
		
		try {
		dontComeBet = Integer.parseInt(br.readLine());
		if(Bankroll.balance >= dontComeBet && dontComeBet <= 2500 && dontComeBet >= 5) {
			Bankroll.balance = Bankroll.balance - dontComeBet;
		}else {
			System.out.println("No Bet!");
		}
		}catch(Exception e) {
			System.out.println("Invalid Entry");
		}
	}
	
	public void moveTo() {
		switch(Roll.call) {
		case 2:
		case 3:
			System.out.println("Don't come Bet Wins = $" + dontComeBet);
			betWin();
		case 4:
			if(dontComeBet > 0) {
				dontFour = dontComeBet;
				System.out.print("Lay the Four? ");
				System.out.println("[1]Yes [2]No");

				try {
					int select = Integer.parseInt(br.readLine());
					if(select == 1) {
						lay.lay4();
					}else {
						
					}
				} catch (NumberFormatException e) {
					System.out.println("Invalid Entry");
				} catch (IOException e) {
					System.out.println("Invalid Entry");
				}
				dontComeBet = 0;
			}
		case 5:
			if(dontComeBet > 0) {
				dontFive = dontComeBet;
				System.out.print("Lay the Five? ");
				System.out.println("[1]Yes [2]No");

				try {
					int select = Integer.parseInt(br.readLine());
					if(select == 1) {
						lay.lay5();
					}else {
						
					}
				} catch (NumberFormatException e) {
					System.out.println("Invalid Entry");
				} catch (IOException e) {
					System.out.println("Invalid Entry");
				}
				dontComeBet = 0;
			}
		case 6:
			if(dontComeBet > 0) {
				dontSix = dontComeBet;
				System.out.print("Lay the Six? ");
				System.out.println("[1]Yes [2]No");

				try {
					int select = Integer.parseInt(br.readLine());
					if(select == 1) {
						lay.lay6();
					}else {
						
					}
				} catch (NumberFormatException e) {
					System.out.println("Invalid Entry");
				} catch (IOException e) {
					System.out.println("Invalid Entry");
				}
				dontComeBet = 0;
			}
			break;
		case 7:
			System.out.println("Don't come Bet Loses");
			betLose();
			break;
		case 8:
			if(dontComeBet > 0) {
				dontEight = dontComeBet;
				System.out.print("Lay the Eight? ");
				System.out.println("[1]Yes [2]No");

				try {
					int select = Integer.parseInt(br.readLine());
					if(select == 1) {
						lay.lay8();
					}else {
						
					}
				} catch (NumberFormatException e) {
					System.out.println("Invalid Entry");
				} catch (IOException e) {
					System.out.println("Invalid Entry");
				}
				dontComeBet = 0;
			}
		case 9:
			if(dontComeBet > 0) {
				dontNine = dontComeBet;
				System.out.print("Lay the Nine? ");
				System.out.println("[1]Yes [2]No");

				try {
					int select = Integer.parseInt(br.readLine());
					if(select == 1) {
						lay.lay9();
					}else {
						
					}
				} catch (NumberFormatException e) {
					System.out.println("Invalid Entry");
				} catch (IOException e) {
					System.out.println("Invalid Entry");
				}
				dontComeBet = 0;
			}
		case 10:
			if(dontComeBet > 0) {
				dontTen = dontComeBet;
				System.out.print("Lay the Ten? ");
				System.out.println("[1]Yes [2]No");

				try {
					int select = Integer.parseInt(br.readLine());
					if(select == 1) {
						lay.lay10();
					}else {
						
					}
				} catch (NumberFormatException e) {
					System.out.println("Invalid Entry");
				} catch (IOException e) {
					System.out.println("Invalid Entry");
				}
				dontComeBet = 0;
			}
			break;
		case 11:
			System.out.println("Don't come Bet Loses");
			betLose();
			break;
		case 12:
			System.out.println("Don't come pushes.");
			Bankroll.balance = Bankroll.balance + dontComeBet;
			default:
				break;
		}
		
	}
	
	public void checkDc() {
		if(dontFour > 0 && Roll.call == 4) {
			dc4.betLose();
		}else if (dontFive > 0 && Roll.call == 5) {
			dc5.betLose();
		}else if (dontSix > 0 && Roll.call == 6) {
			dc5.betLose();
		}else if (dontEight > 0 && Roll.call == 8) {
			dc5.betLose();
		}else if (dontNine > 0 && Roll.call == 9) {
			dc5.betLose();
		}else if (dontTen > 0 && Roll.call == 10) {
			dc5.betLose();
		}else if (Roll.call == 7) {
			dc4.betWin();
			dc5.betWin();
			dc6.betWin();
			dc8.betWin();
			dc9.betWin();
			dc10.betWin();
		}
	}
	
	
	@Override
	public int betWin() {
		int win = dontComeBet * 2;
		dontComeBet = dontComeBet * 2;
		Bankroll.balance = Bankroll.balance + dontComeBet;
		if(DontCome.dontComeBet > 0) {
			System.out.println("Come Bet Wins = $" + win + "\n");
		}
		dontComeBet = 0;
		return dontComeBet;
	}

	@Override
	public int betLose() {
		if(DontCome.dontComeBet > 0) {
			System.out.println("Don't come Bet Loses.\n");
		}
		dontComeBet = dontComeBet * 0;
		return dontComeBet;
	}
	
}

class DontComeFour implements Wager {

	public void dontCome4() {
		if(DontCome.dontFour > 0 && Roll.call == 4) {
			betLose();
		}
		if(DontCome.dontFour > 0 && Roll.call == 7) {
			betWin();
		}
	}
	
	
	@Override
	public int betWin() {
		int win = DontCome.dontFour;
		DontCome.dontFour = DontCome.dontFour * 2;
		Bankroll.balance = Bankroll.balance + DontCome.dontFour;
		if(DontCome.dontFour > 0) {
			System.out.println("Don't come Bet Four Wins = $" + win + "\n");
		}
		DontCome.dontFour = 0;
		return DontCome.dontFour;
	}

	@Override
	public int betLose() {
		if(DontCome.dontFour > 0) {
			System.out.println("Don't come Bet Four Loses.\n");
		}
		DontCome.dontFour = DontCome.dontFour * 0;
		return DontCome.dontFour;
	}
	
}

class DontComeFive implements Wager {

	public void dontCome5() {
		if(DontCome.dontFive > 0 && Roll.call == 5) {
			betLose();
		}
		if(DontCome.dontFive > 0 && Roll.call == 7) {
			betWin();
		}
	}
	
	
	@Override
	public int betWin() {
		int win = DontCome.dontFive;
		DontCome.dontFive = DontCome.dontFive * 2;
		Bankroll.balance = Bankroll.balance + DontCome.dontFive;
		if(DontCome.dontFive > 0) {
			System.out.println("Don't come Bet Five Wins = $" + win + "\n");
		}
		DontCome.dontFive = 0;
		return DontCome.dontFive;
	}

	@Override
	public int betLose() {
		if(DontCome.dontFive > 0) {
			System.out.println("Don't come Bet Five Loses.\n");
		}
		DontCome.dontFive = DontCome.dontFive * 0;
		return DontCome.dontFive;
	}
	
}

class DontComeSix implements Wager {

	public void dontCome6() {
		if(DontCome.dontSix > 0 && Roll.call == 6) {
			betLose();
		}
		if(DontCome.dontSix > 0 && Roll.call == 7) {
			betWin();
		}
	}
	
	
	@Override
	public int betWin() {
		int win = DontCome.dontSix;
		DontCome.dontSix = DontCome.dontSix * 2;
		Bankroll.balance = Bankroll.balance + DontCome.dontSix;
		if(DontCome.dontSix > 0) {
			System.out.println("Don't come Bet Six Wins = $" + win + "\n");
		}
		DontCome.dontSix = 0;
		return DontCome.dontSix;
	}

	@Override
	public int betLose() {
		if(DontCome.dontSix > 0) {
			System.out.println("Don't come Bet Six Loses.\n");
		}
		DontCome.dontSix = DontCome.dontSix * 0;
		return DontCome.dontSix;
	}
	
}

class DontComeEight implements Wager {

	public void dontCome8() {
		if(DontCome.dontEight > 0 && Roll.call == 8) {
			betLose();
		}
		if(DontCome.dontEight > 0 && Roll.call == 7) {
			betWin();
		}
	}
	
	
	@Override
	public int betWin() {
		int win = DontCome.dontEight;
		DontCome.dontEight = DontCome.dontEight * 2;
		Bankroll.balance = Bankroll.balance + DontCome.dontEight;
		if(DontCome.dontEight > 0) {
			System.out.println("Don't come Bet Eight Wins = $" + win + "\n");
		}
		DontCome.dontEight = 0;
		return DontCome.dontEight;
	}

	@Override
	public int betLose() {
		if(DontCome.dontEight > 0) {
			System.out.println("Don't come Bet Eight Loses.\n");
		}
		DontCome.dontEight = DontCome.dontEight * 0;
		return DontCome.dontEight;
	}
	
}

class DontComeNine implements Wager {

	public void dontCome9() {
		if(DontCome.dontNine > 0 && Roll.call == 9) {
			betLose();
		}
		if(DontCome.dontNine > 0 && Roll.call == 7) {
			betWin();
		}
	}
	
	
	@Override
	public int betWin() {
		int win = DontCome.dontNine;
		DontCome.dontNine = DontCome.dontNine * 2;
		Bankroll.balance = Bankroll.balance + DontCome.dontNine;
		if(DontCome.dontNine > 0) {
			System.out.println("Don't come Bet Nine Wins = $" + win + "\n");
		}
		DontCome.dontNine = 0;
		return DontCome.dontNine;
	}

	@Override
	public int betLose() {
		if(DontCome.dontNine > 0) {
			System.out.println("Don't come Bet Nine Loses.\n");
		}
		DontCome.dontNine = DontCome.dontNine * 0;
		return DontCome.dontNine;
	}
	
}

class DontComeTen implements Wager {

	public void dontCome10() {
		if(DontCome.dontTen > 0 && Roll.call == 10) {
			betLose();
		}
		if(DontCome.dontTen > 0 && Roll.call == 7) {
			betWin();
		}
	}
	
	
	@Override
	public int betWin() {
		int win = DontCome.dontTen;
		DontCome.dontTen = DontCome.dontTen * 2;
		Bankroll.balance = Bankroll.balance + DontCome.dontTen;
		if(DontCome.dontTen > 0) {
			System.out.println("Don't come Bet Ten Wins = $" + win + "\n");
		}
		DontCome.dontTen = 0;
		return DontCome.dontTen;
	}

	@Override
	public int betLose() {
		if(DontCome.dontTen > 0) {
			System.out.println("Don't come Bet Ten Loses.\n");
		}
		DontCome.dontTen = DontCome.dontTen * 0;
		return DontCome.dontTen;
	}
	
}
