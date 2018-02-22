import java.util.ArrayList;

public class Player {
    private ArrayList<Card> playersCards = new ArrayList<>();
    public void addCard(Card card)
    {
        playersCards.add(card);
    }
    public void showCards()
    {
        for(Card x : playersCards)
        {
            System.out.print(x.getName() + " " + x.getColour());
            System.out.println("");
        }

    }
}
