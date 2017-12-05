package cwiczenia_3;
public class Card {
	
	private String mainRank;
    private String mainSuit;

    public Card(int rank, String suit)
    {       
    	mainSuit = suit;

        if (rank == 1) {
        	mainRank = "Ace";
        }
        else if (rank == 11) {
        	mainRank = "Jack";
        }
        else if (rank == 12) {
        	mainRank = "Queen";
        }
        else if (rank == 13) {
        	mainRank = "King";
        }
        else {
        	mainRank = "" + rank;
          }
    }

    public String toString() { 
    	return mainRank + " " + mainSuit; 
    	}

	
}



