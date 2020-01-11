package lab2;

import org.uncommons.watchmaker.framework.EvolutionaryOperator;

import java.util.List;
import java.util.Random;

public class MyMutation implements EvolutionaryOperator<double[]> {
    public List<double[]> apply(List<double[]> population, Random random) {
        // initial population
        // need to change individuals, but not their number!

        for (double[] solution: population) {
            double alpha = random.nextDouble();
            if (alpha > 0.5) {
                double sigma = random.nextDouble();
                if (sigma < 0.5) {
                    solution[random.nextInt(solution.length)] += random.nextGaussian();
                }
            }
        }
        return population;
    }
}
