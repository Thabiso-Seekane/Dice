import java.util.Random;

public class Dice {

    // local variables.
    private int numOfSides;
    private int Value;

    public Dice(int numberOfSides)
    {
        numOfSides = numberOfSides;
        rollDice();
    } // end of constructor.

    public void rollDice()
    {
        Random r = new Random(); // random object.
        Value = r.nextInt(numOfSides) + 1; // shifting Range of dice from 0 - 5 to 1 - 6
    } // end of method rollDice.

    public int getValue()
    {
        return Value;
    }// end of method getValue

    public int getNumOfSides()
    {
        return numOfSides;
    }// end of method getNumOfSides.
}
