package crapsProject_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Passline implements Wager {
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
    public static int passBet;
    Odds odds = new Odds();
	
    //Method to create a Pass Line bet.
	public void passBet() {
		System.out.print("Pass Line Bet = $");
		
		try {
		passBet = Integer.parseInt(br.readLine());
		if(Bankroll.balance >= passBet && passBet <= 2500 && passBet >= 5) {
			Bankroll.balance = Bankroll.balance - passBet;
		}else {
			System.out.println("No Bet!");
		}
		}catch(Exception e) {
			System.out.println("Invalid Entry");
		}
	}
	
	//Checks if pass line wins or loses.
	public void checkPass() {
        if(Point.pnt == 0) {
        	switch(Roll.call) {
        	case 2:
        	case 3:
        	case 12:
        		betLose();
        		break;
        	case 7:
        	case 11:
        		betWin();
        		break;
        	case 4:
        	case 5:
        	case 6:
        	case 8:
        	case 9:
        	case 10:
        		default:
        			break;
        	}
        }else if(Roll.call == Point.pnt) {
        	betWin();
        }else if(Point.pnt > 0 && Roll.call == 7) {
        	betLose();
        }
	}
	
	//Prompts user to add an odds bet on the point.
	public void pointOdds() {
		switch(Point.pnt) {
		case 4:
			if(passBet > 0) {
			
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

			}
			break;
		case 5:
			if(passBet > 0) {
				
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

			}
			break;
		case 6:
			if(passBet > 0) {
				
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

			}
			break;
		case 8:
			if(passBet > 0) {
				
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

			}
			break;
		case 9:
			if(passBet > 0) {
				
				System.out.print("Odds on Nine? ");
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

			}
			break;
		case 10:
			if(passBet > 0) {
				
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

			}
			break;
			default:
				break;
		}
	}

	@Override
	public int betWin() {	
		int win = passBet;
		passBet = passBet * 2;
		Bankroll.balance = Bankroll.balance + passBet;
		if(Passline.passBet > 0) {
			System.out.println("Passline Wins = $" + win + "\n");
		}
		passBet = 0;
		return passBet;
	}

	@Override
	public int betLose() {
		if(Passline.passBet > 0) {
			System.out.println("Passline loses\n");
		}
		passBet = passBet * 0;
		return passBet;
	}
	
}