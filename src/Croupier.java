import java.util.ArrayList;

public class Croupier extends Person{
    public void showOneCard()
    {
        System.out.print(cards.get(0).getName() + " " + cards.get(0).getColour());
        System.out.println("");
        for(int i=0; i<cards.size()-1; i++) {
            System.out.println("XXX XXX");
        }
        showPoints();
    }


}
