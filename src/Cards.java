import java.util.ArrayList;
import java.util.Random;

/**
 * Created by svitlana.masanovets on 3/8/2016.
 */
public class Cards {

    String[] Suit = {"clubs", "diamonds", "hearts", "spades"};
    String[] Rank = {"6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    ArrayList<String> deck;

    {
        deck = new ArrayList<String>();

        int i, j, n = 0;
        for (i = 0; i < Suit.length; i++) {
            for (j = 0; j < Rank.length; j++) {
                deck.add(Suit[i] + "\t" + Rank[j]);
            }
        }
    }

    private static void shuffleCards(ArrayList<String> cards) {
        Random shufIndex = new Random();
        int n = cards.size();
        for (int i = 1; i < n; i++) {
            int j = shufIndex.nextInt(i);
            String temp = cards.get(i);
            cards.set(i, cards.get(j));
            cards.set(j, temp);
        }

    }

    private static void takeCard(ArrayList<String> cards) {
        int num = cards.size();
        if (cards.size() != 0) {
            int randomCard = (int) (Math.random() * (num + 1));
            System.out.println("I am deleting \t" + cards.get(randomCard));
            cards.remove(randomCard);

        } else System.out.println("There are no cards in the deck");

    }

    public static void main(String[] args) {

        Cards test = new Cards();
        shuffleCards(test.deck);
        System.out.println(test.deck);
        takeCard(test.deck);
        System.out.println(test.deck);
        System.out.println(test.deck.size());


    }


}
