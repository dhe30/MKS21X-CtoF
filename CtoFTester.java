/*
The functions should take one double, being either 
the celsius or farenheit degrees, and being double 
because degrees can have decimals. It should return 
the a degrees in a different system of measurement
*/
public class CtoFTester{
	public static double celsiusToFahrenheit(double x){
		return (x*(9/5))+32;
	}
	public static double fahrenheitToCelsius(double x){
		return (x-32)*(5/9);
	}
      public static void main(String[] args){
          
      }
}