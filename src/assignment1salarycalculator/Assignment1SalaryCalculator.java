/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1salarycalculator;

/**
 *
 * @author gubotdev
 */
public class Assignment1SalaryCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SalaryCalculator calc = new SalaryCalculator();
        calc.calcHourlyWage(32000);
        calc.calcSalary(10);
        calc.calcTaxes(0.20);
        calc.monthlyAfterTax(42000, 0.25);
    }
    
}
