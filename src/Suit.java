public enum Suit {
	
	CLUB(0, "Clubs"), 
	DIAMOND(1, "Diamonds"), 
	HEART(2, "Hearts"), 
	SPADE(3, "Spades");
	
private static int suitNumber;
private static String suitName;


private Suit(int sNum, String sName){

	setsuitNumber(sNum);
	setsuitName(sName);
}



public String num2suit(String suitName, int suitNumber){

	return String.format("%s",suitName, suitNumber);
	
}

public static int getsuitNumber() {
	return getSuitNumber();
}

public void setsuitNumber(int suitNumber) {
	Suit.setSuitNumber(suitNumber);
}

public static String getSuitName() {
	return suitName;
}

static void setsuitName(String suitName) {
	Suit.suitName = suitName;
	
}



public static int getSuitNumber() {
	return suitNumber;
}



public static void setSuitNumber(int suitNumber) {
	Suit.suitNumber = suitNumber;
}
}



/*CLUB("club", 0), 
DIAMOND("diamond", 1), 
HEART("heart", 2), 
SPADE("spade", 3);*/
	


//suitName = sName;

	
//public static String cardSuit;


