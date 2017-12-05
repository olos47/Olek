package cwiczenia_3;

public class DeckMain {
	public static void main(String[]args){
					
			Deck deck1 = new Deck();
			deck1.shuffle();
			deck1.handOutCards();
			deck1.handOutCards();
			deck1.handOutCards();
			deck1.handOutCards();
			deck1.handOutCards();
			deck1.handOutCards();
			deck1.handOutCards();
			deck1.handOutCards();
			deck1.handOutCards();
			deck1.handOutCards();
			deck1.handOutCards();
			deck1.handOutCards();
			deck1.handOutCards();
			deck1.shuffle();
			deck1.howManyCardsLeft();
			deck1.checkWhichCardsOut();
			
			// Opcjonalna metoda, drukuje zawartosc tabeli
	        //System.out.println(deck1.toString());
			
	
	}
}
