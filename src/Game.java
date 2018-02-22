import java.util.Random;

public class Game {
    private Table table = new Table();
    private Player player = new Player();
    private Croupier croupier = new Croupier();
    private Random random = new Random();
    Game() {}
    public void startGame()
    {
        gameBeginning();
        player.showCards();
    }
    private void addCardToPlayer()
    {
        int temp = random.nextInt(table.getDeck().size());
        player.addCard(table.getDeck().get(temp));
        table.getDeck().remove(temp);


    }
    private void addCardToCroupier()
    {
        int temp = random.nextInt(table.getDeck().size());
        croupier.addCard(table.getDeck().get(temp));
        table.getDeck().remove(temp);
    }
    private void gameBeginning()
    {
        addCardToCroupier();
        addCardToCroupier();
        addCardToPlayer();
        addCardToPlayer();
    }
}
