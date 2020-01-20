package crapsProject_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Come implements Wager{
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
    public static int comeBet;
    public static int comeFour, comeFive, comeSix, comeEight, comeNine, comeTen;
    Odds odds = new Odds();
    ComeFour c4 = new ComeFour();
    ComeFive c5 = new ComeFive();
    ComeSix c6 = new ComeSix();
    ComeEight c8 = new ComeEight();
    ComeNine c9 = new ComeNine();
    ComeTen c10 = new ComeTen();
    
	public Come() {
		
	}
	
	//Method to create a Come Bet
	public void comeBet() {
		
		if(comeBet > 0) {
			Bankroll.balance = Bankroll.balance + comeBet;
		}
		
		System.out.print("Come Bet = $");
		
		try {
		comeBet = Integer.parseInt(br.readLine());
		if(Bankroll.balance >= comeBet && comeBet <= 2500 && comeBet >= 5) {
			Bankroll.balance = Bankroll.balance - comeBet;
		}else {
			System.out.println("No Bet!");
		}
		}catch(Exception e) {
			System.out.println("Invalid Entry");
		}
	}
	
	//Moves a come bet to the appropriate number.
	public void moveTo() {
		switch(Roll.call) {
		case 2:
		case 3:
			System.out.println("Come Bet Loses");
			betLose();
		case 4:
			if(comeBet > 0) {
				comeFour = comeBet;
				System.out.print("Odds on Four? ");
				System.out.println("[1]Yes [2]No");

				try {
					int select = Integer.parseInt(br.readLine());
					if(select == 1) {
						odds.odds4();
					}else {
						
					}
				} catch (NumberFormatException e) {
					System.out.println("Invalid Entry");
				} catch (IOException e) {
					System.out.println("Invalid Entry");
				}
				comeBet = 0;
			}
		case 5:
			if(comeBet > 0) {
				comeFive = comeBet;
				System.out.print("Odds on Five? ");
				System.out.println("[1]Yes [2]No");

				try {
					int select = Integer.parseInt(br.readLine());
					if(select == 1) {
						odds.odds5();
					}else {
						
					}
				} catch (NumberFormatException e) {
					System.out.println("Invalid Entry");
				} catch (IOException e) {
					System.out.println("Invalid Entry");
				}
				comeBet = 0;
			}
		case 6:
			if(comeBet > 0) {
				comeSix = comeBet;
				System.out.print("Odds on Six? ");
				System.out.println("[1]Yes [2]No");

				try {
					int select = Integer.parseInt(br.readLine());
					if(select == 1) {
						odds.odds6();
					}else {
						
					}
				} catch (NumberFormatException e) {
					System.out.println("Invalid Entry");
				} catch (IOException e) {
					System.out.println("Invalid Entry");
				}
				comeBet = 0;
			}
			break;
		case 7:
			System.out.println("Come Bet Wins = $" + comeBet);
			betWin();
			break;
		case 8:
			if(comeBet > 0) {
				comeEight = comeBet;
				System.out.print("Odds on Eight? ");
				System.out.println("[1]Yes [2]No");

				try {
					int select = Integer.parseInt(br.readLine());
					if(select == 1) {
						odds.odds8();
					}else {
						
					}
				} catch (NumberFormatException e) {
					System.out.println("Invalid Entry");
				} catch (IOException e) {
					System.out.println("Invalid Entry");
				}
				comeBet = 0;
			}
		case 9:
			if(comeBet > 0) {
				comeNine = comeBet;
				System.out.print("Odds on Nine ");
				System.out.println("[1]Yes [2]No");

				try {
					int select = Integer.parseInt(br.readLine());
					if(select == 1) {
						odds.odds9();
					}else {
						
					}
				} catch (NumberFormatException e) {
					System.out.println("Invalid Entry");
				} catch (IOException e) {
					System.out.println("Invalid Entry");
				}
				comeBet = 0;
			}
		case 10:
			if(comeBet > 0) {
				comeTen = comeBet;
				System.out.print("Odds on Ten? ");
				System.out.println("[1]Yes [2]No");

				try {
					int select = Integer.parseInt(br.readLine());
					if(select == 1) {
						odds.odds10();
					}else {
						
					}
				} catch (NumberFormatException e) {
					System.out.println("Invalid Entry");
				} catch (IOException e) {
					System.out.println("Invalid Entry");
				}
				comeBet = 0;
			}
			break;
		case 11:
			System.out.println("Come Bet Wins = $" + comeBet);
			betWin();
			break;
		case 12:
			System.out.println("Come Bet Loses");
			betLose();
			default:
				break;
		}
		
	}
	
	//Checks whether a come bet wins or loses.
	public void checkCome() {
		if(Roll.call == 7 || Roll.call == 11) {
			betWin();
		}else if(Roll.call == 2 || Roll.call == 3 || Roll.call == 12) {
			betLose();
		}
	}
	
	public void checkComePoint() {
		if(comeFour > 0 && Roll.call == 4) {
			c4.betWin();
		}else if(comeFive > 0 && Roll.call == 5) {
			c5.betWin();
		}else if(comeSix > 0 && Roll.call == 6) {
			c6.betWin();
		}else if(comeEight > 0 && Roll.call == 8) {
			c8.betWin();
		}else if(comeNine > 0 && Roll.call == 9) {
			c9.betWin();
		}else if(comeTen > 0 && Roll.call == 10) {
			c10.betWin();
		}else if(Roll.call == 7) {
			c4.betLose();
			c5.betLose();
			c6.betLose();
			c8.betLose();
			c9.betLose();
			c10.betLose();
		}
	}
	
	
	@Override
	public int betWin() {
		int win = comeBet;
		comeBet = comeBet * 2;
		Bankroll.balance = Bankroll.balance + comeBet;
		if(Come.comeBet > 0) {
			System.out.println("Come Bet Wins = $" + win + "\n");
		}
		comeBet = 0;
		return comeBet;
	}

	@Override
	public int betLose() {
		if(Come.comeBet > 0) {
			System.out.println("Come Bet Loses.\n");
		}
		comeBet = comeBet * 0;
		return comeBet;
	}
	
 class ComeFour implements Wager {

			public void come4() {
				if(Come.comeFour > 0 && Roll.call == 4) {
					betWin();
				}
				if(Come.comeFour > 0 && Roll.call == 7) {
					betLose();
				}
			}
			
			
			@Override
			public int betWin() {
				int win = Come.comeFour;
				Come.comeFour = Come.comeFour * 2;
				Bankroll.balance = Bankroll.balance + Come.comeFour;
				if(Come.comeFour > 0) {
					System.out.println("Come Bet Four Wins = $" + win + "\n");
				}
				Come.comeFour = 0;
				return Come.comeFour;
			}

			@Override
			public int betLose() {
				if(Come.comeFour > 0) {
					System.out.println("Come Bet Four Loses.\n");
				}
				Come.comeFour = Come.comeFour * 0;
				return Come.comeFour;
			}
			
		}
 
 class ComeFive implements Wager {

	public void come5() {
		if(Come.comeFive > 0 && Roll.call == 5) {
			betWin();
		}
		if(Come.comeFive > 0 && Roll.call == 7) {
			betLose();
		}
	}
	
	
	@Override
	public int betWin() {
		int win = Come.comeFive;
		Come.comeFive = Come.comeFive * 2;
		Bankroll.balance = Bankroll.balance + Come.comeFive;
		if(Come.comeFive > 0) {
			System.out.println("Come Bet Five Wins = $" + win + "\n");
		}
		Come.comeFive = 0;
		return Come.comeFive;
	}

	@Override
	public int betLose() {
		if(Come.comeFive > 0) {
			System.out.println("Come Bet Five Loses.\n");
		}
		Come.comeFive = Come.comeFive * 0;
		return Come.comeFive;
	}
	
}
 
class ComeSix implements Wager {

	public void come6() {
		if(Come.comeSix > 0 && Roll.call == 6) {
			betWin();
		}
		if(Come.comeSix > 0 && Roll.call == 7) {
			betLose();
		}
	}
	
	
	@Override
	public int betWin() {
		int win = Come.comeSix;
		Come.comeSix = Come.comeSix * 2;
		Bankroll.balance = Bankroll.balance + Come.comeSix;
		if(Come.comeSix > 0) {
			System.out.println("Come Bet Six Wins = $" + win + "\n");
		}
		Come.comeSix = 0;
		return Come.comeSix;
	}

	@Override
	public int betLose() {
		if(Come.comeSix > 0) {
			System.out.println("Come Bet Six Loses.\n");
		}
		Come.comeSix = Come.comeSix * 0;
		return Come.comeSix;
	}
	
}

class ComeEight implements Wager {

	public void come8() {
		if(Come.comeEight > 0 && Roll.call == 8) {
			betWin();
		}
		if(Come.comeEight > 0 && Roll.call == 7) {
			betLose();
		}
	}
	
	
	@Override
	public int betWin() {
		int win = Come.comeEight;
		Come.comeEight = Come.comeEight * 2;
		Bankroll.balance = Bankroll.balance + Come.comeEight;
		if(Come.comeEight > 0) {
			System.out.println("Come Bet Eight Wins = $" + win + "\n");
		}
		Come.comeEight = 0;
		return Come.comeEight;
	}

	@Override
	public int betLose() {
		if(Come.comeEight > 0) {
			System.out.println("Come Bet Eight Loses.\n");
		}
		Come.comeEight = Come.comeEight * 0;
		return Come.comeEight;
	}
	
}

class ComeNine implements Wager {

	public void come9() {
		if(Come.comeNine > 0 && Roll.call == 9) {
			betWin();
		}
		if(Come.comeNine > 0 && Roll.call == 7) {
			betLose();
		}
	}
	
	
	@Override
	public int betWin() {
		int win = Come.comeNine;
		Come.comeNine = Come.comeNine * 2;
		Bankroll.balance = Bankroll.balance + Come.comeNine;
		if(Come.comeNine > 0) {
			System.out.println("Come Bet Nine Wins = $" + win + "\n");
		}
		Come.comeNine = 0;
		return Come.comeNine;
	}

	@Override
	public int betLose() {
		if(Come.comeNine > 0) {
			System.out.println("Come Bet Nine Loses.\n");
		}
		Come.comeNine = Come.comeNine * 0;
		return Come.comeNine;
	}
	
}

class ComeTen implements Wager {

	public void come10() {
		if(Come.comeTen > 0 && Roll.call == 10) {
			betWin();
		}
		if(Come.comeTen > 0 && Roll.call == 7) {
			betLose();
		}
	}
	
	
	@Override
	public int betWin() {
		int win = Come.comeTen;
		Come.comeTen = Come.comeTen * 2;
		Bankroll.balance = Bankroll.balance + Come.comeTen;
		if(Come.comeTen > 0) {
			System.out.println("Come Bet Ten Wins = $" + win + "\n");
		}
		Come.comeTen = 0;
		return Come.comeTen;
	}

	@Override
	public int betLose() {
		if(Come.comeTen > 0) {
			System.out.println("Come Bet Ten Loses.\n");
		}
		Come.comeTen = Come.comeTen * 0;
		return Come.comeTen;
	}
	
}
	
}
