/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Homeworks
{
	public static void main(String[] args) {
	    
//Number 1
        String name;
        int age;
        double annualPay;

        name = "Joe Mahoney";
        age = 26;
        annualPay = 100000.0;
        System.out.println("\nNumber 1");
        System.out.println("My name is " + name + ", my age is " + age + " and");
        System.out.println("I hope to earn $" + annualPay + " per year.");

//Number 2
        String firstName = "Alber";
        String middleName = "Adiel";
        String lastName = "Baez";

        char firstInitial = 'A';
        char middleInitial = 'A';
        char lastInitial = 'B';
        
        System.out.println("\n\nNumber 2");
        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);

        System.out.println("First initial: " + firstInitial);
        System.out.println("Middle initial: " + middleInitial);
        System.out.println("Last initial: " + lastInitial);
        
//Number 3
        System.out.println("\n\nNumber 3");
        System.out.println(
            "Alber Adiel Baez\n" + 
            "123 Main Street, Newark, NJ, 07102\n" + 
            "(201) 903-6060\n" + 
            "Computer Science");
            
//NUmber 4
        System.out.println("\n\nNumber 4");
        System.out.println("   *");
        System.out.println("  ***");
        System.out.println(" *****");
        System.out.println("*******");

        System.out.println(" *****");
        System.out.println("  ***");
        System.out.println("   *");

//Number 5
        double totalSales = 4_600_000;
        double eastCoastPercentage = 0.62;
        double eastCoastSales = totalSales * eastCoastPercentage;
        
        System.out.println("\n\nNumber 5"); 
        System.out.println("Predicted sales for the East Coast division: $" + eastCoastSales);
        

	}
}
