public class Card {
    private String name;
    private String colour;
    private int value;
    Card(String name, String colour)
    {
        this.name = name;
        this.colour = colour;
        if(name.equals("2")) value = 2;
        if(name.equals("3")) value = 3;
        if(name.equals("4")) value = 4;
        if(name.equals("5")) value = 5;
        if(name.equals("6")) value = 6;
        if(name.equals("7")) value = 7;
        if(name.equals("8")) value = 8;
        if(name.equals("9")) value = 9;
        if(name.equals("10")) value = 10;
        if(name.equals("Jack")) value = 2;
        if(name.equals("Queen")) value = 3;
        if(name.equals("King")) value = 4;
        if(name.equals("Ace")) value = 11;
    }
    public String getName()
    {
        return name;
    }
    public String getColour()
    {
        return colour;
    }
    public int getValue()
    {
        return value;
    }
}
