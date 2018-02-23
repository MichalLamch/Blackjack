import java.util.ArrayList;

public class Person {
    ArrayList<Card> cards = new ArrayList<>();
    private  int points = 0;
    public void addCardToList(Card card)
    {
        cards.add(card);
        addPoints(card.getValue());
    }
    public void showCards()
    {
        for(Card x : cards)
        {
            System.out.print(x.getName() + " " + x.getColour());
            System.out.println("");
        }
        showPoints();

    }
    private void addPoints(int a)
    {
        points+=a;
    }
    void showPoints(){
        System.out.println("Punkty: " + points);
    }
    public int getPoints()
    {
        return points;
    }
}
