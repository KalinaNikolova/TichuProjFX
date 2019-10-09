package DarkTichu.model;

//this class is taken from PokerGame2019 project provided by prof. Bradley Richards
//It has been changed by Kalina slightly to fit the new cards names
public class Card implements Comparable<Card> {
	public enum Suit {
		Jade, Pagodas,Stars,Swords;
		@Override
		public String toString() {
			String suit = "";
			switch (this) {
			case Jade:
				suit = "J";
				break;
			case Pagodas:
				suit = "P";
				break;
			case Stars:
				suit = "S";
				break;
			case Swords:
				suit = "SW";
				break;
			}
			return suit;
		}
	};

	public enum Rank {
		Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King, Ace;
		@Override
		public String toString() {
			String str = "Ace"; // Assume we have an ace, then cover all other cases
			// Get ordinal value, which ranges from 0 to 12
			int ordinal = this.ordinal();
			if (ordinal <= 7) {
				str ="0"+Integer.toString(ordinal + 2);// 03,04,05....
			}
			else if (ordinal == 8) { // 10
				str = Integer.toString(ordinal + 2);
			}
			else if (ordinal == 9) { // Jack
				str = "Jack";
			} else if (ordinal == 10) { // Queen
				str = "Queen";
			} else if (ordinal == 11) { // King
				str = "King";
			}
			return str;
		}
	};

	private int ordinalint;
	private final Suit suit;
	private final Rank rank;

	public Card(Suit suit, Rank rank) {
		this.suit = suit;
		this.rank = rank;
	}

	public Suit getSuit() {
		return suit;
	}

	public Rank getRank() {
		return rank;
	}

	public int getOrdinal() {

		ordinalint = rank.ordinal() + 2;
		return ordinalint;
	}

	@Override
	public String toString() {
		return rank.toString() + suit.toString();
	}

	@Override
	public int compareTo(Card that) {
		// TODO Auto-generated method stub
		if (this.rank.ordinal() > that.rank.ordinal()) {
			return 1;
		} else if (this.rank.ordinal() < that.rank.ordinal()) {
			return -1;
		}
		return 0;
	}
}













