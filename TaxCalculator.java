
/**
 * This program will calculate the a users income tax based on the user input taxable income input in the TaxCalculator Tester class.
 
 * @author (Adam Slattery)
 * @version (03/10/2019)
 */

import java.util.*;

public class TaxCalculator{

    public double CalculateTax (double taxableIncome){
        double taxesOwed;

        if (taxableIncome < 9526)
          taxesOwed = taxableIncome * .10;
        else if (taxableIncome <= 38700.99)
          taxesOwed = taxableIncome * .12;
        else if (taxableIncome <= 82500.99)
          taxesOwed = taxableIncome * .22;
        else if (taxableIncome <= 157500.99)
          taxesOwed = taxableIncome * .24;
        else if (taxableIncome <= 200000.99)
          taxesOwed = taxableIncome * .32;
        else if (taxableIncome <= 500000.99)
          taxesOwed = taxableIncome * .35;
        else
          taxesOwed = taxableIncome * .37;
     return taxesOwed;
    }
}

    
