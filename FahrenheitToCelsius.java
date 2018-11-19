package FahrenheitToCelsius;

import java.util.Scanner;
/**Program: Fahrenheit To Celsius
 * File: FahrenheitToCelsius.java
 * Summary: Convert user input degree in Fahrenheit to Celsius;
 *   Convert user input degree in Celsius to Fahrenheit;
 * Author: Eric George
 * Date: November 18, 2018
 */
public class FahrenheitToCelsius {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a degree in Fahrenheit: ");

    double fahrenheit = input.nextDouble();

    // Convert Fahrenheit to Celsius 
    double celsius = (5.0 / 9) * (fahrenheit - 32);

    System.out.println("Fahrenheit " + fahrenheit + " is "
      + celsius + " in Celsius ");

    // Prompt user to input a double 
    System.out.print("Enter a degree in Celsius: ");

    double celsiusnew = input.nextDouble();

    // Convert Celsius to Fahrenheit 
    double fahrenheitnew = 9.0 / 5 * celsiusnew + 32;

    // Display results 
    System.out.println(celsiusnew + " Celsius is " + fahrenheitnew
        + " Fahrenheit");

    }

}
