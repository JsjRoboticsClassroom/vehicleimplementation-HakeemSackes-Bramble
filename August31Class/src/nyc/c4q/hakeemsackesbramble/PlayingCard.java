package nyc.c4q.hakeemsackesbramble;

/**
 * Created by hakeemsackes-bramble on 8/31/16.
 */
public class PlayingCard {
    public static void main(String[] args) {

    }


    Suit suit = Suit.DIAMONDS;
    int value;


    public PlayingCard(Suit suit, int value) {// a constructor
        this.suit = suit;
        this.value = value;
    }

    public int getValue() {  // this is a constructor, it
        return this.value;
    }


    public enum Suit { //enum is like a value type used like string, boolean etc
        DIAMONDS,
        SPACES,
        CLUBS,
        HEARTS
    }


}

