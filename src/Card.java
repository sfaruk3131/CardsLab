public class Card {
    private String Rank;
    private String Suit;
    private int PointValue;

    public Card(String rank, String suit, int pointValue)
    {
        this.Rank = Rank;
        this.Suit = Suit;
        this.PointValue = PointValue;
    }

    public String getRank()
    {
        return Rank;
    }

    public String suit()
    {
        return Suit;
    }

    public int PointValue()
    {
        return PointValue;
    }

    public boolean equals(Card otherCard)
    {
        return Rank.equals(otherCard) && Suit.equals(otherCard.Suit) && PointValue == otherCard.PointValue;
    }

    public String toString()
    {
        return Rank + " of " + Suit + ": " + PointValue + " point(s)";
    }
}
