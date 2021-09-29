import java.util.Random;

public class RollDice {
    public static void main(String[] args) {

        Random generator = new Random();
        int die1;
        double die2;

        die1 = generator.nextInt(6) + 1;
        System.out.println("From 1 to 6: " + die1);

        die2 = generator.nextInt(6) + 1;
        System.out.println("From 1 to 6: " + die2);
        System.out.println("Sum of two dice are :"+ die1 + die2);
    }
}
