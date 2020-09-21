package mit6092;

public class GravityCalculator {

	
	public static void gravityCalculator()
	{
		// x(t) = 0.5 × at2 + vit + xi
		   double gravity = -9.81;  // Earth's gravity in m/s^2
	        double initialVelocity = 0.0;
	        double fallingTime = 10.0;
	        double initialPosition = 0.0;
	        double finalPosition = 0.0;
	        
	        finalPosition = 0.5 * gravity * Math.pow(fallingTime, 2) + initialVelocity * fallingTime + initialPosition; 
	        System.out.println("The object's position after " + fallingTime +
	                " seconds is " + finalPosition + " m.");
	}
	public static void  printSquare(double x)
	{
		System.out.println(x*x);
	}
}
