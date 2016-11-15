
public class Game {

	//////////////////////////////////////
	///FIGURE OUT HOW TO ADD RANDOM CARD//
	/////////////////////////////////////
	
	
	public static Suit[] randomSuit(){
		                      //(int )(Math.random() * 13 + 1);     //int randomSuit = (int )(Math.random() * 3 + 1);
		int randomSuit = 0;
		Suit[] x = null;
		switch (randomSuit){
		case 0:
			x = Suit.CLUB.values();
			break;			
		}
		
		return x;
		
	}
	
	public static Rank[] randomRank(){
	int randomRank = 1;
	Rank[] y = null;
	switch (randomRank){
	case 0:
		//y = Rank.setAll();
		break;
	case 1:
		y = Rank.TWO.
		break;
		default:
			System.out.println("NOOOO");
			break;
	}
	return y;
}
	
}
