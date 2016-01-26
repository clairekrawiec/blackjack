import java.util.ArrayList;
import java.util.Scanner;


public class BlackJackRunner
    {
                public static int playerTotal;
                public static int dealerTotal;
                public static int askQuestion;
                public static int askQuestion2;
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
                        Deck.shuffleDeck();
                         playerTotal = (Deck.deck.get(0).getValue() + Deck.deck.get(1).getValue());
                         dealerTotal = (Deck.deck.get(2).getValue() + Deck.deck.get(3).getValue());
                        System.out.println("Welcome to Blackjack!");
                        System.out.println("your going to start with 100 to deal with the minimum bet is 5");
                        money = 100;
                        System.out.println("you have " + money + " to bet");    
                        System.out.println("how much do you want to bet?");
                        Scanner userInput = new Scanner (System.in);
                         userInput.nextLine();
                        System.out.println("your first card is " + Deck.deck.get(0).getValue());
                        userHand.add(Deck.deck.get(0));
                        System.out.println("your second card is " + Deck.deck.get(1).getValue());
                        userHand.add(Deck.deck.get(1));
                        System.out.println("your total of your cards are " + playerTotal);
                             System.out.println("the dealers first card is " + Deck.deck.get(2).getValue());
                             dealerHand.add(Deck.deck.get(3));
                             System.out.println(" the dealers second card is " + Deck.deck.get(3).getValue());
                             System.out.println("the dealers total of cards is " + dealerTotal);
                            
                    
                          if (playerTotal == 21)
                              {
                                 System.out.println("Blackjack, you win"); 
                              }
                          else if (dealerTotal == 21)
                              {
                                  System.out.println("The dealer got Blackjack you loose.");
                                  System.out.println("would you like to play again?");
                                  askQuestion2();
                              }
                          if (playerTotal < 17)
                          {
                              System.out.println("would you like to draw another card?");
                              askQuestion();
                              Scanner userInput2 = new Scanner (System.in);
                              userInput.nextLine();
                          }
                         if(dealerTotal < 17)
                              {
                                  System.out.println("dealer must draw another card");
                                  dealerHand.add(Deck.deck.get(4));
                                  dealerTotal= (Deck.deck.get(2).getValue() + Deck.deck.get(3).getValue() + Deck.deck.get(6).getValue());
                                  System.out.println("the dealers third card is " + Deck.deck.get(6).getValue());
                                  System.out.println("the dealers total now is " + dealerTotal);
                                  if(dealerTotal < 17)
                                  {

                                      dealerHand.add(Deck.deck.get(7));
                                      dealerTotal= (Deck.deck.get(2).getValue() + Deck.deck.get(3).getValue() + Deck.deck.get(6).getValue() + Deck.deck.get(7).getValue());
                                      System.out.println("the dealers fourth card is " + Deck.deck.get(7).getValue());
                                      System.out.println("the dealers final total is " + dealerTotal);    
                                  }
                              }
                                  
                              
                                      if(userHand == dealerHand)
                                          {
                                              System.out.println("you broke even with the dealer. your total was " + playerTotal + " and so was the dealers.");
                                              System.out.println("would you like to play again?");
                                              askQuestion2();
                                          }
                                      else if(playerTotal > dealerTotal)
                                          {
                                              System.out.println("you beat the dealer the dealers total was " + dealerTotal);
                                              System.out.println("would you like to play again?");
                                              askQuestion2();
                                          }
                                      else if (dealerTotal > 21)
                                          {
                                              System.out.println("the dealer broke over 21 you won!");
                                              System.out.println("would you like to play again?");
                                              askQuestion2();
                                          }
                                      else if( playerTotal > 21)
                                          {
                                              System.out.println("You broke over 21, and lost");
                                              System.out.println("would you like to play again?");
                                              askQuestion2();
                                          }    
                                      
                          
                    }
                public static void askQuestion()
                {
                    System.out.println("1.yes");
                    System.out.println("2.no");
                    Scanner userInput = new Scanner(System.in);
                    askQuestion= userInput.nextInt();
                    if(askQuestion == 1)
                    {
                        userHand.add(Deck.deck.get(8));
                        System.out.println("your new card is " + Deck.deck.get(8).getValue());
                        playerTotal= (Deck.deck.get(8).getValue() + Deck.deck.get(0).getValue() + Deck.deck.get(1).getValue());
                        System.out.println("Your new total is " + playerTotal);
                        if(playerTotal > 21)
                        	{
                        		System.out.println("you lost because you broke over 21");
                        	}
                        if(playerTotal < dealerTotal)
                        	{
                        		System.out.println("the dealer won");
                        	}
                        if(dealerTotal > 21)
                        	{
                        		System.out.println("the dealer broke over and you won!");
                        	}
                        if(dealerTotal == 21)
                        	{
                        		System.out.println("the dealer got 21. You lost");
                        	}
                        if(playerTotal == 21)
                        	{
                        		System.out.println("you got black jack and won!");
                        	}
                        if(dealerTotal == playerTotal)
                        	{
                        		System.out.println("you broke even with the dealer");
                        	}
                    }
                    else if(askQuestion == 2)
                    {
                        System.out.println("your end total is " + playerTotal);
                    }
                    
                }
                public static void askQuestion2()
                {
                	System.out.println("1.yes");
                	System.out.println("2.no");
                	Scanner userInput = new Scanner(System.in);
                	askQuestion2 = userInput.nextInt();
                	if(askQuestion2 == 1)
                		{
                			userHand.add(Deck.deck.get(9));
                			System.out.println("your first card is " + Deck.deck.get(9).getValue());
                			userHand.add(Deck.deck.get(10));
                			System.out.println("your second card is " + Deck.deck.get(10).getValue());
                			playerTotal= (Deck.deck.get(9).getValue() + Deck.deck.get(10).getValue());
                		}
                	else if (askQuestion2 == 2)
                		{
                			System.out.println("thank you for playing!");
                		}
                }
    }
