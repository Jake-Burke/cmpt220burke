
public class Bond {
		private double coupon;							//setting up data fields 
		private int payments;
		private double intrest;
		private double valueMaturity;

	public Bond() {										//no arg constructor
	
}
	public Bond(double newCoupon, int newPayments,double newIntrest,double newValueMaturity) {	//creating the bond
		coupon=newCoupon;
		payments=newPayments;
		intrest=newIntrest;
		valueMaturity=newValueMaturity;
}
	public double getPrice() {																	//getting the price
		return coupon*(1- (1/((1+intrest)*(payments*payments)))+valueMaturity*(1/((1+intrest)*(payments*payments)))  );
	}
}
