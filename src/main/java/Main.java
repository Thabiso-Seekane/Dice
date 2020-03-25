public class Main {

    public static void main(String[] args) {
        Dice die = new Dice(12);

        System.out.println(die.getNumOfSides() + " sided die is:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Roll " + (i+1) +": " + die.getValue());
            die.rollDice();
        }


/*            die.rollDice();
            System.out.println("The value of the dice rolled is: " + die.getValue());*/
    }
}
