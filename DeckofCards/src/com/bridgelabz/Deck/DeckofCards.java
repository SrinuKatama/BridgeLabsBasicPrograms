package com.bridgelabz.Deck;

public class DeckofCards {

	public static void main(String[] args) 
	{

		String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"  };

        String[] RANKS = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
               
           
	        int n = SUITS.length * RANKS.length;    //declaring all the 52 values into one array
	        String[] deck = new String[n];
	        for (int i = 0; i < RANKS.length; i++) {
	            for (int j = 0; j < SUITS.length; j++) {
	                deck[SUITS.length*i + j] = RANKS[i] + " of " + SUITS[j];
	            }
	        }

	        
	        for (int i = 0; i < n; i++)               // shuffle the array
	        {
	            int r = i + (int) (Math.random() * (n-i));
	            String temp = deck[r];
	            deck[r] = deck[i];
	            deck[i] = temp;
	        }

	       
	        int n1=1;
	        int k=0;                                  // print shuffled deck
	        while(k<=52)
	        {
	        	if(n1<5)
	        	{
	        	//System.out.println("player :"+n1);
	        		System.out.print("player :"+n1+"-->");
	             for (int i = 0; i < 10; i++) 
	             {
	                  System.out.print(deck[k]+"|");
	                   k++;
	              }
	            System.out.println();
	             n1++;
	          	}
	        	else
	        	{
	        		System.out.println("job done");
	        		break;
	        	}
	        }
	        
	    }

	}


