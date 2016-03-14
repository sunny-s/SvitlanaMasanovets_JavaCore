import java.util.ArrayList;
import java.util.Random;

/**
 * Created by svitlana.masanovets on 3/8/2016.
 */
public class Cards {
    private String[] suit = {"clubs", "diamonds", "hearts", "spades"};
    private String[] rank = {"6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    private ArrayList<String> deck = initDeck();

    private ArrayList<String> initDeck() {
        ArrayList<String> decktest = new ArrayList<String>();

        int i, j, n = 0;
        for (i = 0; i < suit.length; i++) {
            for (j = 0; j < rank.length; j++) {
                decktest.add(suit[i] + "\t" + rank[j]);
            }
        }
        return decktest;
    }

    private void shuffleCards() {

        Random shufIndex = new Random();
        deck = initDeck();
        int n = deck.size();
        for (int i = 1; i < n; i++) {
            int j = shufIndex.nextInt(i);
            String temp = deck.get(i);
            deck.set(i, deck.get(j));
            deck.set(j, temp);
        }
    }

    private void takeCard() {
        int num = deck.size();
        if (deck.size() != 0) {
            int randomCard = (int) (Math.random() * (num + 1));
            System.out.println("I am deleting \t" + deck.get(randomCard));
            deck.remove(randomCard);

        } else System.out.println("There are no cards in the deck");

    }

    public static void main(String[] args) {

        Cards test = new Cards();
        test.shuffleCards();
        System.out.println(test.deck);
        test.takeCard();
        System.out.println(test.deck);
        System.out.println(test.deck.size());
        test.shuffleCards();
        System.out.println(test.deck);
    }


}
