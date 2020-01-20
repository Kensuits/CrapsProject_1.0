package crapsProject_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Player {
    public static String name;
    static InputStreamReader ir = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(ir);
	
	public Player() {

	}
	
	//create player's Id
	public static String playerId() {
		try {
			System.out.print("Enter Player Id = ");
			name = br.readLine();
		}catch(Exception e) {
			System.out.println("Invalid Entry");
		}
		return name;
		
	}
}
