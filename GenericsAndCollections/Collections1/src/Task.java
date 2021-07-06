import java.util.ArrayList;

public class Task {
    public static void main(String[] args) {
        Deck d = new Deck();
        // Draw some random cards:
        System.out.println(d.dealCard());
        System.out.println(d.dealCard());

        ArrayList<Card> hand = new ArrayList<>();
        hand.add(d.dealCard());
        hand.add(d.dealCard());
        hand.add(d.dealCard());

        System.out.println("Hand is:" + hand);
        System.out.println("Cards add:" + addCards(hand));


        for (Card c : d) {
            /* TODO
Compete a for loop that prints every card
in the deck d */
            System.out.println(c);
        }
    }

        public static int addCards(ArrayList<Card> hand){
 /* TODO 
This should compute the sum of values of the cards in an ArrayList of cards.*/
            int tally = 0;
            for (Card c : hand) {
                if (c.getValue() == "Ace") {
                    tally += 1;
                } else if (c.getValue() == "Jack") {
                    tally += 11;
                } else if (c.getValue() == "Queen") {
                    tally += 12;
                } else if (c.getValue()=="King") {
                    tally += 13;
                } else{
                    tally = tally + (int)c.getValue();
                }
            }
            return tally;

        }
    }
