/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1salarycalculator;

/**
 *
 * @author Daria
 */
public class SalaryCalculator {
    public void calcHourlyWage(int salary){
        double wage = salary/2080;
        System.out.println("If your salary is $" + salary + 
                ", your hourly wage is $" + wage);
    }
    
    public void calcSalary(int hourlyWage){
        int salary = hourlyWage*2080;
        System.out.println("If your hourly wage is $" + hourlyWage + 
                ", your salary is $" + salary);
    }
    
    public void calcTaxes(double perc){
        double tax = 25000 * perc;
        System.out.println("If your salary is $" + 25000 + 
                " and the income tax is " + perc + "%, "
                        + "your tax amount is $" + tax);
        
    }
    
    public void monthlyAfterTax(int salary, double perc){
        double tax = salary * perc;
        double afterTax = salary - tax;
        System.out.println("If your salary is $" + salary + 
                " and the income tax is " + perc + "%, "
                        + "your monthly aftertax is $" + afterTax);
    }
}
