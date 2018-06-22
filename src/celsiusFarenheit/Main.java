package celsiusFarenheit;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner = new Scanner(System.in);
		System.out.print("Enter temperature in Farenheit: ");		
		double input = myScanner.nextDouble();
		myScanner.close();
		double celsius = FarenheitToCelsius(input);
		System.out.println(input + " degrees Farenheit converted to Celsius is: " + celsius);
	}
	
	public static double FarenheitToCelsius(double farenheit) {
		return (farenheit - 32.0) * (5.0/9.0);
	}
}
