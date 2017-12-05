package cwiczenia_3;

public class Deck {
	
	private Card [] talia = new Card[52];
    private int iloscKarty;
    private int licznikKart = 52;
    private String rozdanaKarta = "";
 
    public Deck()
    {
        iloscKarty = 0;
        String [] symbolKarty = {"Pik","Trefl","Karo","Kier"};
        for (int jedenSymbol = 0; jedenSymbol <= 3; jedenSymbol++)
        {
            for (int jednaRanga = 1; jednaRanga <= 13; jednaRanga++) {
                talia [iloscKarty] = new Card(jednaRanga,symbolKarty[jedenSymbol]);
                iloscKarty ++;
            }
        }
    }
 
    public void shuffle()
    {
    	Card temp;  
       
    	if (licznikKart == 52){
        
         for (int i = 0; i < 52; i++){
        	 int randomize = (int)(Math.random()*52);
        	 temp = talia[randomize];
        	 talia[randomize] = talia[i];
        	 talia[i] = temp;
 
           }
        
    	} else {
    		System.out.println("Cannot shuffle, the deck must be full in order to shuffle");
    	}
      }  
    
    public void handOutCards() {
    	
    	Card temp;
    	int randomize = (int)(Math.random()*licznikKart);
    	temp = talia[randomize];
    	if (temp != null) {
    	talia[randomize] = null;
    	rozdanaKarta = rozdanaKarta + temp.toString() + " , ";
    	System.out.println("Your card is: " + temp);
    	licznikKart--;
    	}
    	else {
    		System.out.println("Failed to hand out card, try again.");
    	}
    	
    }
    
    public void howManyCardsLeft() {
    	System.out.println("There are " + licznikKart + " cards left.");
    }
    
    public void checkWhichCardsOut(){
    	System.out.println("Cards out of deck: " + rozdanaKarta);
    }
     
    public String toString() {
        String printDeck = "Printing all cards in the deck: \n";
        for (int i = 0; i < 52; i++) {
        	printDeck = printDeck + talia[i] + "\n";
        }
        return printDeck;
    }

}
