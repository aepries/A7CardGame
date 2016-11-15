

	public enum Rank{
			EMPTY(0, "Empty", "0"),
			LOWFACE(1, "One", "1" ),
			TWO(2,"Two", "2"),
			THREE(3, "Three", "3"),
			FOUR(4, "Four", "4"),
			FIVE(5, "Five", "5"),
			SIX(6, "Six", "6"),
			SEVEN(7, "Seven", "7"),
			EIGHT(8, "Eight", "8"),
			NINE(9, "Nine", "9"),
			TEN(10, "Ten", "10"),
			JACK(11, "Jack", "J"),
			QUEEN(12, "Queen", "Q"),
			KING(13, "King", "K"),
			ACE(14, "Ace", "A");
	
	
		//private String rankName;
		private static int rankNumber;
		private static String rankName;
		private static String rankAbv;

		private Rank(int rNum, String rName, String rankAbv){
			setRankNumber(rNum);
			setRankName(rName);
			setRankAbv(rankAbv);
		}
			

		public static String num2rank(int rankNumber, String rankName){
			return String.format("%s", Rank.rankName);
		}


		public static int getRankNumber() {
			return rankNumber;
		}


		public static void setRankNumber(int rankNumber) {
			Rank.rankNumber = rankNumber;
		}
		
		public static void setRankName(String rankName) {
			Rank.rankName = rankName;
		}


		public static String getRankName() {
			
			return rankName;
		}
		
		public static String getRankAbv() {
			return rankAbv;
		}


		public static void setRankAbv(String rankAbv) {
			Rank.rankAbv = rankAbv;
		}
		
		public void setAll(Rank[] y) {
			setRankAbv(rankAbv);
			setRankName(rankName);
			setRankNumber(rankNumber);
		}
		
		
		
		
		
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	//}

		/*public String rank2suit(int rankNum, String rankName){
			
			cardRank = String.format("%d",rankNum, rankName);
		
			return cardRank;
		}*/
		
/*public String rank2suit(int rankNum){
			
			cardRank = String.format("%s",rankName);
		
			return cardRank;
		}

		public void setRandRank(int randomRank){
			rankNum = randomRank;
			test = rankNum;
		}*/
	
		
		
	/*	//NEEDED?
		public int getRandRank(int rankNum){
			return rankNum;
		}*/
		
		
		
		
		
	

	


