package crapsProject_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bankroll {

	public static int balance;
	public static int moreMoney;
	public static int cashout;
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
	
	public Bankroll() {
	}
	
	//create initial balance
	public static int balance() {

		try {
			System.out.print("Enter Buy-in = $");
			balance = Integer.parseInt(br.readLine());
		}catch(Exception e) {
			System.out.println("Invalid Entry");
		}
		return balance;
	}
	
	//method to add to balance
	public static int rebuy() {
		try {
			System.out.print("Add = $");
			moreMoney = Integer.parseInt(br.readLine());
			balance = balance + moreMoney;
		}catch(Exception e) {
			System.out.println("Invalid Entry");
		}
		return balance;
	}
	
	//method to cashout balance
	public static int cashOut() {
		try {
			System.out.println("Cashout? [1]Yes  [2]No");
			cashout = Integer.parseInt(br.readLine());
			if(cashout == 1) {
				balance = balance * 0;
			}
			else if(cashout == 2){
			return balance;
			}
		}catch(Exception e) {
			System.out.println("Invalid Entry");
		}
		return balance;
	}
	
}
