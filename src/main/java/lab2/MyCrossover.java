package lab2;

import org.uncommons.watchmaker.framework.operators.AbstractCrossover;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyCrossover extends AbstractCrossover<double[]> {
    protected MyCrossover() {
        super(1);
    }

    protected List<double[]> mate(double[] p1, double[] p2, int i, Random random) {
        ArrayList children = new ArrayList();

        // your implementation:

        int num = p1.length;
        double[] new_p1 = new double[num];
        double[] new_p2 = new double[num];

        double alpha = 0.4;
        double beta = 0.6;

        for (int j = 0; j < p1.length; j++){
            new_p1[j] = alpha * p1[j] + beta * p2[j];
            new_p2[j] = beta * p1[j] + alpha * p2[j];
        }

        children.add(new_p1);
        children.add(new_p2);
        return children;
    }
}
