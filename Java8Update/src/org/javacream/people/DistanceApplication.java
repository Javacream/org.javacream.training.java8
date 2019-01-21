package org.javacream.people;

import org.javacream.people.DistanceCalculator.SimpleDistanceAlgorithmInner;
import org.javacream.people.DistanceCalculator.SimpleDistanceAlgorithmInnerStatic;

public class DistanceApplication {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
	DistanceCalculator distanceCalculator = new DistanceCalculator();
	SimpleDistanceAlgorithmInner algo = distanceCalculator.new SimpleDistanceAlgorithmInner();
	SimpleDistanceAlgorithmInnerStatic algoStatic = new SimpleDistanceAlgorithmInnerStatic();
    }

}
