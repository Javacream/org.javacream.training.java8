package org.javacream.training.scratch;

import org.javacream.training.scratch.DistanceCalculator.SimpleDistanceAlgorithmInner;
import org.javacream.training.scratch.DistanceCalculator.SimpleDistanceAlgorithmInnerStatic;

public class DistanceApplication {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
	DistanceCalculator distanceCalculator = new DistanceCalculator();
	SimpleDistanceAlgorithmInner algo = distanceCalculator.new SimpleDistanceAlgorithmInner();
	SimpleDistanceAlgorithmInnerStatic algoStatic = new SimpleDistanceAlgorithmInnerStatic();
    }

}
