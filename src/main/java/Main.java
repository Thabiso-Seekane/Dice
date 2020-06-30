public class Main {

    public static void main(String[] args) {
        Dice die = new Dice(20);

        die.rollDice();
        Dice die6 = new Dice(0,new int[]{1,1,1,1,1,2});
        die6.rollDice();
        System.out.println(die6);
        System.out.println(die);
 //        System.out.println(die.getNumOfSides() + " sided die is:");
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Roll " + (i+1) +": " + die.getValue());
//            die.rollDice();
//        }


/*            die.rollDice();
            System.out.println("The value of the dice rolled is: " + die.getValue());*/
    }
}
