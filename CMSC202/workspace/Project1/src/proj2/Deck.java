package proj2;
import java.util.*;



public class Deck {


	

	public static void main(String[] args)
	{
		List<Card> deck = new ArrayList<Card>();
		
		
		for(Suit s : Suit.values())
		{
			for(Rank r : Rank.values())
			{
				Card c = new Card(r,s);
				deck.add(c);
			}
		}
	
	
		for(Card c: deck)
			System.out.println(c.toString());
			
			
	}
}

