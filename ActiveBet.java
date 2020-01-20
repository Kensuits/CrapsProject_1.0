package crapsProject_1;

public class ActiveBet {

	public void activeBet() {

		System.out.println("\t\t\t\t\t  $" + DontCome.dontFour + "/" + Lay.layFour + 
				"\t  $" + DontCome.dontFive + "/" + Lay.layFive + "\t  $" +
				 DontCome.dontSix + "/" + Lay.laySix + "\t   $" +
				 DontCome.dontEight + "/" + Lay.layEight + "\t    $" +
				 DontCome.dontNine + "/" + Lay.layNine + "\t$" +
				 DontCome.dontTen + "/" + Lay.layTen);
		System.out.println("\t\t\t\t\t_____________________________________________________");
		System.out.println("\t\t\t\t\t|   4  |    5   |    6   |    8   |    9   |   10   |");
		System.out.println("\t\t\t\t\t_____________________________________________________");
		System.out.println("\t\t\t\t\t  $" + PlaceFour.place4 + "       $" + PlaceFive.place5 +
				"       $" + PlaceSix.place6 + "       $" + PlaceEight.place8 + "       $" +
				PlaceNine.place9 + "       $" + PlaceTen.place10);
		System.out.println("\t\t\t\t\t  $" + Come.comeFour + "/" + Odds.oddsFour +
				"\t  $" + Come.comeFive + "/" + Odds.oddsFive + "\t   $" + Come.comeSix +
				"/" + Odds.oddsSix + "\t   $" + Come.comeEight + "/" + Odds.oddsEight +
				"\t    $" + Come.comeNine + "/" + Odds.oddsNine + "\t$" + Come.comeTen +
				"/" + Odds.oddsTen + "\n\n");
	}
}
