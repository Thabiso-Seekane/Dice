//import java.util.Random;
//
//public class eliDie {
//
//    public int sides;
//    public int value;
//
//    public int[] probabilities;
//    public int[] options;
//
//    public eliDie(){
//
//    }
//
//    public eliDie(int sides,int ... options) {
//        this.sides = sides;
//        this.probabilities =options;
//    }
//
//    public int getValue() {
//        return value;
//    }
//
//
//    public int[] getProbabilities() {
//        return probabilities;
//    }
//
//    public int roll() {
//        Random random = new Random(); /* <-- this is a constructor */
//        value = random.nextInt(sides) + 1;
//        options=new int[sides];
//        return value;
//    }
//}
