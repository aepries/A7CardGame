import static java.lang.System.out;

import java.util.ArrayList;
import java.util.Scanner;

public class Tester {
	

	public static void main(String[] args){

		Game.randomRank();
		Rank.setAll();
		System.out.println(Rank.getRankName());
		
	}
		
	}

	
	
	//RANDOM CARD
/*	public static int randomCard(){
		int randomRank = (int )(Math.random() * 13 + 1);
		int randomSuit = (int )(Math.random() * 3 + 1);
		Rank.cardRank = String.valueOf(randomRank);
		return randomRank;*/
	
	


//Prints "Ace" & "Ace of Spades"
//System.out.printf("%s\n%s", Rank.num2rank(0, null), Card.getName());


//Prints all the Suit Names
/*	for (Suit s: Suit.values()){
System.out.printf("%s \n", s);
}*/


//Prints Abbreviation
//System.out.println("\n" + Card.getAbv());



/*
//Not sure if necessary?//
Suit C = Suit.CLUB;
Suit D = Suit.DIAMOND;
Suit H = Suit.HEART;
Suit S = Suit.SPADE;

Suit sObject = new Suit();

ArrayList<String> myList = new ArrayList<String>(5);


	Hand.randomCard();
	int test = Rank.getRankNum();
	Rank.setRandRank(test );
	myList.add(Hand.rcard);
	for (String x : myList)
		System.out.println(x);*/



//int randomRank = Rank.test;