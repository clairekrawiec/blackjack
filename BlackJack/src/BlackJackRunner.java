import java.util.ArrayList;
import java.util.Scanner;

public class BlackJackRunner
	{
				public static int playerTotal;
				public static int dealerTotal;
				public static int askQuestion;
				public static boolean player = true;
				public static boolean dealer = true;
				public static int money;
				public static int bet;
				public static boolean userWins;
				public static ArrayList <Card> userHand = new ArrayList <Card>();
				public static ArrayList <Card> dealerHand = new ArrayList <Card>();
				public static void main(String[] args)
				
					{
						Deck.fillDeck();
						 playerTotal = (Deck.deck.get(0).getValue() + Deck.deck.get(1).getValue());
						 dealerTotal = (Deck.deck.get(2).getValue() + Deck.deck.get(3).getValue());
						System.out.println("Welcome to Blackjack!");
						System.out.println("your going to start with 100 to deal with");
						money = 100;
						System.out.println("the minimum bet is 5");
						System.out.println("your first card is " + Deck.deck.get(0).getValue());
						userHand.add(Deck.deck.get(0));
						System.out.println("your second card is " + Deck.deck.get(1).getValue());
						userHand.add(Deck.deck.get(1));
						System.out.println("your total of your cards are " + playerTotal);
							System.out.println("you have " + money + " to bet");	
							System.out.println("how much do you want to bet?");
							Scanner userInput = new Scanner (System.in);
							 userInput.nextLine();
							 System.out.println("the dealers first card is " + Deck.deck.get(2).getValue());
							 dealerHand.add(Deck.deck.get(3));
							 System.out.println(" the dealers second card is " + Deck.deck.get(3).getValue());
							
					
						  if (playerTotal == 21)
							  {
								 System.out.println("Blackjack, you win"); 
							  }
						  else if (dealerTotal == 21)
							  {
								  System.out.println("The dealer got Blackjack");
							  }
						  if(playerTotal < 21)
							  {
								  System.out.println("would you like to hit");
							  }
						  else if (dealerTotal < 17)
							  {
								  System.out.println("dealer must draw another card");
								  Deck.deck.get(4);
							  }
						  if (playerTotal < 17)
							  {
								  System.out.println("would you like to draw another card?");
								  askQuestion();
								  Scanner userInput2 = new Scanner (System.in);
								  userInput.nextLine();
								  
							  }
								  	if(userHand == dealerHand)
								  		{
								  			System.out.println("you broke even with the dealer");
								  		}
								  	else if(playerTotal > dealerTotal)
								  		{
								  			System.out.println("you beat the dealer");
								  		}
								  	else if (dealerTotal > 21)
								  		{
								  			System.out.println("the dealer broke over 21");
								  		}
								  	else if( playerTotal > 21)
								  		{
								  			System.out.println("You broke over 21, and lost");
								  		}
								  	
								  	
						  
						

					}
			public static void askQuestion()
			{
				System.out.println("1.yes");
				System.out.println("2.no");
			}
				
				
			

	}
