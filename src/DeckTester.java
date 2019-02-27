/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *	@param args is not used.
     */
    public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
        String[] rank1 = {"Jack","Queen","Ace"};
        String[] suit1 = {"Hearts","Spades","Clubs"};
        int[] value1 = {11,12,1};

        Deck deck1 = new Deck(rank1, suit1, value1);
        System.out.println("Deck one size is: " + deck1.size());

        String[] rank2 = {"1","2","King"};
        String[] suit2 = {"Spades","Hearts", "Diamonds"};
        int[] value2 = {1,2,13};

        Deck deck2 = new Deck(rank2,suit2,value2);
        System.out.println("Deal deck two: " + deck2.deal());

        String[] rank3 = {"6", "Joker", "9"};
        String[] suit3 = {"Hearts", "Spades", "Diamonds"};
        int[] value3 = {6, 11, 9};

        Deck deck3 = new Deck(rank3,suit3,value3);
        System.out.println("Deck 3 is empty: "+ deck3.isEmpty());
    }
}

