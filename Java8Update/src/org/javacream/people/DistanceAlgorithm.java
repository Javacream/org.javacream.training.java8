package org.javacream.people;

@FunctionalInterface
public interface DistanceAlgorithm {

    public double calculate(double coordinate1, double coordinate2);
//    public double calculate2(double coordinate1, double coordinate2);
    public default String egal() {
	return "Hugo";
    }
}
