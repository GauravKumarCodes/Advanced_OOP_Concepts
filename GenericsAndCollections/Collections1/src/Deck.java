import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;


public class Deck implements Iterable<Card>{
    private List<Card> deck;
    private String[] suits = {"Hearts","Clubs","Diamonds","Spades"};
    public Deck() {
/* TODO 
This constructor initializes the deck variable with
all the cards of a deck, except a joker.
The suits array may help you.*/
        this.deck = new LinkedList<Card>();

        for (int i = 0; i < 3; i++) {
            for (int j = 1; j <= 13; j++) {
                if (j == 1) {
                    deck.add(new Card<String, String>("Ace", suits[i]));
                } else if (j == 11) {
                    deck.add(new Card<String, String>("Jack", suits[i]));
                } else if (j == 12) {
                    deck.add(new Card<String, String>("Queen", suits[i]));
                } else if (j == 13) {
                    deck.add(new Card<String, String>("King", suits[i]));
                } else {
                    deck.add(new Card<Integer, String>(j, suits[i]));
                }
            }
        }
    }

    public Card dealCard(){
/* TODO
Code this. It is almost EXACTLY as the  method to draw one object
from the bag in the previous task. The difference is that this method
REMOVES the card from the deck */
        Random r = new Random();
        int low = 0;
        int high = deck.size();
        int result = r.nextInt(high-low) + low;

        //T temp = objects.get(result);
        //objects.remove(result);
        return deck.remove(result);

    }

    public int size(){/* TODO: Return the size of the deck (number of cards left in it)*/
        return deck.size();
}
    @Override
    public Iterator<Card> iterator() {
       /* TODO 
Return a new DeckIterator with this instance in the constructor.*/
           return new DeckIterator<Card>(this);
    }
}
