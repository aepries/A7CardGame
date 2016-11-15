
public class Card  {

	public String cardRank;
	public String cardSuit;
	public String cName;
	public String cAbv;
	public int cNum;
	public static String cardName;
	
	private Rank rank;
	private Suit suit;
	
	public Card(Rank cRank, Suit cSuit){
		setSuit(cSuit); 
		setRank(cRank);
	}

	
	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}

	public Suit getSuit() {
		return suit;
	}

	public void setSuit(Suit suit) {
		this.suit = suit;
	}
	
	public static String getName(){
		 
		return Rank.getRankName() + " of " + Suit.getSuitName();
	}
	
	public static String getAbv(){
		
		return String.valueOf(Rank.getRankAbv()) + Suit.getSuitName().toLowerCase().charAt(0);
	}
	
	public static void printCard(){
		System.out.printf("%s\t(%s)", Card.getName(), Card.getAbv());
	}
	
	
	
	
	
	
	
	
	
	/*public int getRank(){
		
		 
		return Rank.getRankNum();
	}
	
	public String getSuit(){
		cSuit = Suit.cardSuit;
		return cSuit;
	}
	
	public String getName(){
		cName = Rank.cardRank + " of " + Suit.cardSuit;
		return cName;
	}
	
	public String getAbv(){
		cAbv = Rank.cardRank + Suit.cardSuit.charAt(0);
		return cAbv;
	}
	
	public void printCard(){
		System.out.println(getName());
	}*/
	
	

	
}
