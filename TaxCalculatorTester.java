/**
 * This program will ask the user for their taxable income, and display that number based on calculations done in the TaxCalculator Class.
 *
 * @author (Adam Slattery)
 * @version (03/10/2019)
 */

import java.util.*;

public class TaxCalculatorTester{
public static void main(String [] args){
    
  double taxableIncome = 0; //declare and initialize taxable income
  double taxesOwed = 0;
    Scanner input = new Scanner(System.in);
  
  System.out.println("This program will calculate how much you owe in taxes based on your income."); 
  System.out.println("Please enter your taxable income for this year.");
    taxableIncome = input.nextDouble( );
  
  TaxCalculator taxObject = new TaxCalculator();
    taxObject.CalculateTax(taxesOwed);
    
System.out.println("You owe " + taxesOwed + " in taxes.");
System.out.println("Please note this is just a estimate and acutal amount due may differ.");
}
}


 