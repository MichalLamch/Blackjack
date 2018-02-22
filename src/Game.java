import java.net.SocketTimeoutException;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private Table table = new Table();
    private Player player = new Player();
    private Croupier croupier = new Croupier();
    private Random random = new Random();
    private Scanner scan = new Scanner(System.in);
    private boolean playersRound = true;
    private boolean croupiersRound = true;
    Game() {}
    public void startGame()
    {
        gameBeginning(player, croupier);
        player.showCards();
        croupier.showOneCard();
        while (playersRound||croupiersRound)
        {
            if(playersRound) {
                System.out.println("Wpisz 'd', aby dobrać kartę lub 'p', aby spasować");
                String decision = scan.next();
                if (decision.equals("d")) {
                    giveCard(player);
                } else if (decision.equals("p")) playersRound = false;
                else {
                    System.out.println("Wpisz poprawną decyzję");
                }
                if (player.getPoints() >= 21) {
                    System.out.println("Już starczy!");
                    playersRound = false;
                }
            }
            if(croupiersRound) {
                if (croupier.getPoints() < 15) {
                    giveCard(croupier);
                    System.out.println("Krupier dobrał kartę");

                } else {
                    croupiersRound = false;
                    System.out.println("Krupier nie dobiera już karty");
                }
                if (croupier.getPoints() > 21) {
                    System.out.println("Krupier dobrał za dużo, wygrywasz");
                    break;
                }
            }
            player.showCards();
            croupier.showOneCard();


        }
        System.out.println("Twoje punkty: " + player.getPoints() + " Punkty krupiera: " +croupier.getPoints());
        WhoIsBetter();
    }
    private void giveCard(Person p)
    {
        int temp = random.nextInt(table.getDeck().size());
        p.addCardToList(table.getDeck().get(temp));
        table.getDeck().remove(temp);


    }
    private void gameBeginning(Player p, Croupier c)
    {
        giveCard(p);
        giveCard(p);
        giveCard(c);
        giveCard(c);
    }
    private void WhoIsBetter()
    {
        if (player.getPoints()<=21 && player.getPoints()>croupier.getPoints() && croupier.getPoints()<21) System.out.println("Wygrałeś!");
        else System.out.println("Wygrał krupier :(");
    }
}
