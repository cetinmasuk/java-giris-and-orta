package tester;

public class trigonoFonks {

		  public static void main(String[] args) {
		    double rads, degs, tanA, coTanA;

		    // Obtain angle in degrees from user
		    degs = 120d;
		    // Convert degrees to radian
		    rads = Math.toRadians(degs);

		    // Calculate tangent
		    tanA = Math.tan(rads);
		    System.out.println("Tangent = " + tanA);

		    // Calculate cotangent
		    coTanA = 1.0 / Math.tan(rads);
		    System.out.println("Cotangent = " + coTanA);

		    // Calculate arc-tangent
		    rads = Math.atan(tanA);
		    degs = Math.toDegrees(rads);
		    System.out.println("Arc tangent: " + degs);

		    // Calculate arc-cotangent
		    rads = Math.atan(1 / coTanA);
		    degs = Math.toDegrees(rads);
		    System.out.println("Arc cotangent: " + degs);
		  }
		}



