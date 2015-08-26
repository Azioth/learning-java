package ar.com.azioth.learn.exercises;

/**
 * Created by Azioth on 25/08/2015.
 */
public class AvgNumberRolls {
    public static final int NUMBER_OF_EXPERIMENTS = 10000;

    public static void main(String[] arg0) {
        System.out.println("Total On Dice     Average Number of Rolls");
        System.out.println("-------------     -----------------------");
        double avgRolls;
        for (int dice = 2; dice <= 12; dice++) {
            avgRolls = getAverageRollCount(dice);
            System.out.printf("%10d%22.4f\n", dice, avgRolls);
        }
    }

    private static double getAverageRollCount(int roll) {
        int numberOfRoll;
        int sumNumberOfRolls;
        double averageRollCount;
        sumNumberOfRolls = 0;
        for (int j = 0; j < NUMBER_OF_EXPERIMENTS; j++) {
            numberOfRoll = rollFor(roll);
            sumNumberOfRolls += numberOfRoll;
        }
        averageRollCount = ((double)sumNumberOfRolls) / NUMBER_OF_EXPERIMENTS;
        return averageRollCount;
        
    }



    private static int rollFor(int N) {
        if ( N < 2 || N > 12 )
            throw new IllegalArgumentException("Impossible total for a pair of dice.");
        int die1;
        int die2;
        int roll;
        int countRolls = 0;
        do {
            die1 = (int)(6*Math.random() + 1);
            die2 = (int)(6*Math.random() + 1);
            roll = die1 + die2;
            countRolls++;
        } while ( roll != N);
        return countRolls;
    }
}
