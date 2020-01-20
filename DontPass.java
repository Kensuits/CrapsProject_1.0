package crapsProject_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DontPass implements Wager {
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
    public static int dontBet;
    public static int pointLay;
    Lay lay = new Lay();
	
    //Creates a bet on the "Don't Pass."
	public void dontBet() {
		
		if(dontBet > 0) {  //If user changes the amount of the bet the original bet is returned.
			Bankroll.balance = Bankroll.balance + dontBet;
		}
		
		System.out.print("Dont Pass Bet = $");
		
		try {
		dontBet = Integer.parseInt(br.readLine());
		if(Bankroll.balance >= dontBet && dontBet <= 2500 && dontBet >= 5) {
			Bankroll.balance = Bankroll.balance - dontBet;
		}else {
			System.out.println("No Bet!");
		}
		}catch(Exception e) {
			System.out.println("Invalid Entry");
		}
	}
	
	//Prompts user to add a "Lay Bet" against the point.
	public void pointLay() {
		switch(Point.pnt) {
		case 4:
			if(dontBet > 0) {
			
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

			}
			break;
		case 5:
			if(dontBet > 0) {
				
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

			}
			break;
		case 6:
			if(dontBet > 0) {
				
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

			}
			break;
		case 8:
			if(dontBet > 0) {
				
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

			}
			break;
		case 9:
			if(dontBet > 0) {
				
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

			}
			break;
		case 10:
			if(dontBet > 0) {
				
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

			}
			break;
			default:
				break;
		}
	}
	
	//Checks to see if the Don't Pass wins or loses.
	public void checkDont() {
		if(Point.pnt == 0) {
			switch(Roll.call) {
			case 2:
			case 3:
				betWin();
				break;
			case 7:
			case 11:
				betLose();
				break;
			case 12:
				System.out.println("Don't Pass pushes.");
				Bankroll.balance = Bankroll.balance + dontBet;
				default:
					break;
			}
		}else if(Roll.call == Point.pnt) {
			betLose();
		}else if(Point.pnt > 0 && Roll.call == 7) {
			betWin();
		}
	}

	//Pays the Don't Pass bet.
	@Override
	public int betWin() {	
		int win = dontBet;
		dontBet = dontBet * 2;
		Bankroll.balance = Bankroll.balance + dontBet;
		if(DontPass.dontBet > 0) {
			System.out.println("Don't Pass Wins = $" + win + "\n");
		}
		dontBet = 0;
		return dontBet;
	}

	@Override
	public int betLose() {
		if(DontPass.dontBet > 0) {
			System.out.println("Don't Pass loses.\n");
		}
		dontBet = dontBet * 0;
		return dontBet;
	}
}
