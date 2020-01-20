package crapsProject_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Field implements Wager {
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
    public static int fieldBet;
	
	public void fieldBet() {
		System.out.print("Field Bet = $");
		
		try {
		fieldBet = Integer.parseInt(br.readLine());
		if(Bankroll.balance >= fieldBet && fieldBet <= 2500 && fieldBet >= 5) {
			Bankroll.balance = Bankroll.balance - fieldBet;
		}else {
			System.out.println("No Bet!");
		}
		}catch(Exception e) {
			System.out.println("Invalid Entry");
		}
	}
	
	public void checkField() {
		if(Roll.call == 2 || Roll.call == 12) {
			betDouble();
		}else if(Roll.call == 3 || Roll.call == 4 || Roll.call == 9 || Roll.call == 10 || Roll.call == 11) {
			betWin();
		}else if(Roll.call == 5 || Roll.call == 6 || Roll.call == 7 || Roll.call == 8) {
			betLose();
		}
	}
	
	public int betDouble() {
		int win = fieldBet * 2;
		fieldBet = fieldBet * 3;
		Bankroll.balance = Bankroll.balance + fieldBet;
		if(Field.fieldBet > 0) {
			System.out.println("Field Wins = $" + win + "\n");
		}
		return fieldBet;
	}

	@Override
	public int betWin() {	
		int win = fieldBet;
		fieldBet = fieldBet * 2;
		Bankroll.balance = Bankroll.balance + fieldBet;
		if(Field.fieldBet > 0) {
			System.out.println("Field Wins = $" + win + "\n");
		}
		fieldBet = 0;
		return fieldBet;
	}

	@Override
	public int betLose() {
		if(Field.fieldBet > 0) {
			System.out.println("Field loses.\n");
		}
		fieldBet = fieldBet * 0;
		return fieldBet;
	}
}
