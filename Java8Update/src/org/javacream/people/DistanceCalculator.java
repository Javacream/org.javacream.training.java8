package org.javacream.people;

public class DistanceCalculator {
    private String name;
    private DistanceAlgorithm distanceAlgorithm;

    public Double calculateDistance(Address a1, Address a2) {
	// getCoordinate for a1
	// getCoordinate for a2
	//message: Referenz vom Typ String-Objekt im Heap erstellt durch das String-Literal ""	
	String message = "Hugo";
	
	Integer number = 42;
	
	DistanceAlgorithm da = (double d1, double d2) -> {return 4711;};
	class SimpleDistanceAlgorithmMethodLevel implements DistanceAlgorithm {

	    @Override
	    public double calculate(double coordinate1, double coordinate2) {
		System.out.println("Address1: " + a1 + ", " + message);
		return Math.abs(coordinate1 - coordinate2);
	    }

	}
	//return distanceAlgorithm.calculate(4.2, 47.11);
	//DistanceAlgorithm distanceAlgorithm = new SimpleDistanceAlgorithmMethodLevel();
//	DistanceAlgorithm distanceAlgorithm = new DistanceAlgorithm() {
//	    @Override
//	    public double calculate(double coordinate1, double coordinate2) {
//		System.out.println("Address1: " + a1 + ", " + message);
//		return Math.abs(coordinate1 - coordinate2);
//	    }
//	};
	DistanceAlgorithm distanceAlgorithm = (double coordinate1, double coordinate2) -> {
		System.out.println("Address1: " + a1 + ", " + message);
		return Math.abs(coordinate1 - coordinate2);
	    };

	
	return distanceAlgorithm.calculate(4.2, 47.11);
    }

    public class SimpleDistanceAlgorithmInner implements DistanceAlgorithm {

	@Override
	public double calculate(double coordinate1, double coordinate2) {
	    System.out.println(DistanceCalculator.this.name);
	    return Math.abs(coordinate1 - coordinate2);

	}

    }

    public static class SimpleDistanceAlgorithmInnerStatic implements DistanceAlgorithm {

	@Override
	public double calculate(double coordinate1, double coordinate2) {
	    // System.out.println(DistanceCalculator.this.name);
	    return Math.abs(coordinate1 - coordinate2);

	}

    }
}
