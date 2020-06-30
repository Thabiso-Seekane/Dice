import java.util.Random;

public class Dice {

    // local variables.
    private int numOfSides;
    private int value;

    Random random;
    private  int[] probabilities;

    public Dice(int numberOfSides)
    {
        this.numOfSides = numberOfSides;
    } // end of constructor.

    public void value(int value){
        this.value = value;
    }

    public Dice(int numOfSides, int[] probabilities){
        this.numOfSides = numOfSides;
        int i = 0;
        while(i < probabilities.length){
            int prob = probabilities[i];
            if (prob < 0){
                System.out.println("Negative probabilities: Not Allowed.");
            }
            else if (prob != probabilities[i]){
                System.out.println("ERROR : Value Not Allowed Enter Only Integers");
            }
            else if (prob == 0){
                System.out.println("ERROR : probabilities Must Be greater than Zero");
            }
            else if (prob == probabilities[i]){
                numOfSides = probabilities.length;
            }
            i++;
        }
    }

    public void rollDice()
    {
        Random r = new Random(); // random object.
        if (probabilities == null){
            int i = 0;
            while(i < numOfSides){
                int Roll = random.nextInt(numOfSides) + 1; // shifting Range of dice from 0 - 5 to 1 - 6
                value(Roll);
                i++;
            }
        }

    } // end of method rollDice.

//    public int getValue()
//    {
//        return value;
//    }// end of method getValue
//
//    public int getNumOfSides()
//    {
//        return numOfSides;
//    }// end of method getNumOfSides.
}
