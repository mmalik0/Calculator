public class Calculator {
	public static void main(String [] args){
		double [] x = new double [2];
		
		x[0] = 4.0;
		x[1] = 6.0;
		System.out.println("Sum : " + CalculatorDriver.getSum(x));
		System.out.println("Average : " + CalculatorDriver.getAverage(x));		
		System.out.println("Product : " + CalculatorDriver.getProduct(x));
		System.out.println("Factorial : " + CalculatorDriver.Factorial(10));
	}
}