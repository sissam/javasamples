package Collections;

public class Game {

    public enum NUMBER{TWO, THREE, FOUR, FIVE, SIX, SEVEN, JACK, QUEEN, KING, ACE}
    public enum SUIT {SPADE, CLUB, HEART, DIAMOND};

    class Card implements Comparable<Card> {
        private NUMBER number ;
        private SUIT suit ;


        @Override
        public int compareTo(Card o) {
            return 0;
        }
    }

}
