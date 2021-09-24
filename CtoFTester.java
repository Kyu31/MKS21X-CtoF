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
    return celcius * (9.0/5.0) + 32.0;
  }

  public static double fahrenheitToCelcius(double fahrenheit) {
    return (fahrenheit - 32.0) * (5.0/9.0);
  }

  public static void main(String[] args) {

  //Test of celciusToFahrenheit
    //expected output: 32.0
    double celcius = 0.0;
    System.out.println(celcius + "°C is " + celciusToFahrenheit(celcius)
                      + "°F.");

    //expected output: 25.7
    celcius = -3.5;
    System.out.println(celcius + "°C is " + celciusToFahrenheit(celcius)
                      + "°F.");

  //Test of fahrenheitToCelcius
    //expected output: 0.0
    double fahrenheit = 32.0;
    System.out.println(fahrenheit + "°F is " + fahrenheitToCelcius(fahrenheit)
                      + "°C.");

    //expected output: -3.5
    fahrenheit = 25.7;
    System.out.println(fahrenheit + "°F is " + fahrenheitToCelcius(fahrenheit)
                      + "°C.");
  }
}
