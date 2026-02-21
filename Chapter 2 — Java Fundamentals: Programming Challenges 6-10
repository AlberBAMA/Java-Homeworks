/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Homework2
{
	public static void main(String[] args) {
		
		
	//6. Land calculation
	System.out.println("Number 6 Land calculation");
    double squareFeetPerAcre = 43560;
    double totalSquareFeet = 389767;

    double acres = totalSquareFeet / squareFeetPerAcre;

    System.out.println("The number of acres is " + acres);
		
		
		
    //7. sales Tax
    System.out.println("\n\nNumber 7 sales Tax");
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter the amount of the purchase: $");
    double purchase = keyboard.nextDouble();
    double stateTaxRate = 0.04;
    double countyTaxRate = 0.02;

    double stateTax = purchase * stateTaxRate;
    double countyTax = purchase * countyTaxRate;
    double totalTax = stateTax + countyTax;
    double totalSale = purchase + totalTax;

    System.out.println("\nPurchase amount: $" + purchase);
    System.out.println("State sales tax: $" + stateTax);
    System.out.println("County sales tax: $" + countyTax);
    System.out.println("Total sales tax: $" + totalTax);
    System.out.println("Total of the sale: $" + totalSale);
    
    
    
    //8. cookie calories
    System.out.println("\n\nNumber 8 cookie calories");
    int cookiesInBag = 40;
    int servingsInBag = 10;
    int caloriesPerServing = 300;
    
    //caloriesPerCookie should be equal to caloriesPerServing / cookiesPerServing
    int cookiesPerServing = cookiesInBag / servingsInBag;
    int caloriesPerCookie = caloriesPerServing / cookiesPerServing;
    
    System.out.print("How many cookies did you eat? ");
    int cookiesEaten = keyboard.nextInt();

    int totalCalories = cookiesEaten * caloriesPerCookie;

    System.out.println("You consumed " + totalCalories + " calories.");
    
    
    
    
    //9. Miles-per-gallon
    System.out.println("\n\nNumber 9 Miles-per-gallon");
    System.out.print("Enter miles driven: ");
    double miles = keyboard.nextDouble();

    System.out.print("Enter gallons of gas used: ");
    double gallons = keyboard.nextDouble();

    double mpg = miles / gallons;

    System.out.println("The car's miles-per-gallon is: " + mpg);





    //10. Test average
    System.out.println("\n\nNumber 10 Test average");

    System.out.print("Enter first test score: ");
    double score1 = keyboard.nextDouble();

    System.out.print("Enter second test score: ");
    double score2 = keyboard.nextDouble();

    System.out.print("Enter third test score: ");
    double score3 = keyboard.nextDouble();

    //Average
    double average = (score1 + score2 + score3) / 3;

    //Results
    System.out.println("\nFirst score: " + score1);
    System.out.println("Second score: " + score2);
    System.out.println("Third score: " + score3);
    System.out.println("Average score: " + average);
		
	}
}
