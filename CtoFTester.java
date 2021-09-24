public class CtoFTester {

/*
celciusToFahrenheit()
parameters: celcius (double) A temperature in degrees celcius
returns: (double) A temperature in degrees fahrenheit equal to
                  the temperature in celcius

fahrenheitToCelcius()
parameters: fahrenheit (double) A temperature in degrees fahrenheit
returns: (double) A temperature in degrees celcius equal to
                  the temperature in fahrenheit

If I invoke fahrenheitToCelcius using the temperature returned by
celciusToFahrenheit, fahrenheitToCelcius should return the temperature
used to invoke celciusToFahrenheit.
*/

  public static double celciusToFahrenheit(double celcius) {
    return 0.0;
  }

  public static double fahrenheitToCelcius(double fahrenheit) {
    return 5.0;
  }

  public static void main(String[] args) {

  //Test of celciusToFahrenheit
    double celcius = 0.0;
    System.out.println(celcius + "°C is " + celciusToFahrenheit(celcius)
                      + "°F.");

  //Test of fahrenheitToCelcius
    double fahrenheit = 32.0;
    System.out.println(fahrenheit + "°F is " + fahrenheitToCelcius(fahrenheit)
                      + "°C.");

  }
}
