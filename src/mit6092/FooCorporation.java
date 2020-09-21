package mit6092;

public class FooCorporation {
	
	public static void calculatePay(double basePay , int hours)
	{
		int [] test = {1,2,3,4,5,6,7,8};
		if(basePay < 8.00)
		{
			System.out.println("$8.00 mininum wage!" + test[2]);
			return;
		}
		if (hours > 60)
		{
			System.out.println("Can't work more than 60 hours a week!");
			return;
		}
		double overTimeRate = basePay * 1.5;
		int overHour =  hours - 40;
		double regularPay = (hours - overHour) * basePay;
		double overTime = overHour * overTimeRate;
		double finalPay = regularPay + overTime;
		System.out.println("You earned: " + finalPay);
	}

}
