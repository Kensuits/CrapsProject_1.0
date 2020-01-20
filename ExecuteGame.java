package crapsProject_1;

import java.io.IOException;

public class ExecuteGame {

	public static void main(String[] args) throws IOException {
	
		CrapsLog.player1();
		CrapsLog.bankroll();
		
		System.out.print("\nWelcome " + Player.name);
		System.out.println(" you have $" + Bankroll.balance + ". Good Luck!\n");

		Options newGame = new Options();
		newGame.coMenu();

	}

}
