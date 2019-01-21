package org.javacream.people;

public class SimpleDistanceAlgorithmTopLevel implements DistanceAlgorithm{

    @Override
    public double calculate(double coordinate1, double coordinate2) {
	return Math.abs(coordinate1 - coordinate2);
    }

}
