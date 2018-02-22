import java.util.ArrayList;

public class Table {
    private ArrayList<Card> deck = new ArrayList<>();
    private String[] names = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    private String[] colours = {"heart", "diamond", "club", "spades"};
    Table ()
    {
        for (String name : names) {
            for (String colour : colours) {
                deck.add(new Card(name, colour));
            }
        }
    }
    public ArrayList<Card> getDeck()
    {
        return deck;
    }



}
