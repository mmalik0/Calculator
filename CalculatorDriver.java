public class CalculatorDriver {
	public static double getSum (double [] x){
		double sum = 0.0;
		for ( int i=0; i<x.length; i++){
			sum+=x[i];
		}
		return sum;
	}
	public static double getAverage (double [] x){
		double sum = 0.0;
		for ( int i=0; i<x.length; i++){
			sum+=x[i];
		}
		return sum/x.length;
	}
	public static double getProduct (double [] x ){
		double product = 1.0;
				for ( int i=0; i<x.length; i++){
					product *= x[i];
		}
		return product;
	}

	public static int Factorial (int a){
		int Fact = 1;
		for ( int i=1; i<=a; i++){
			Fact*=i;
		}
		return Fact;
				
	}
}
