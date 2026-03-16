//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import javax.swing.JOptionPane; // Needed for JOptionPane

void main() {

    /*Number 1 Print
    Write your program in 2 ways so that it is able to produce the following screen display:
    a)
    Welcome
    to
    Java
    Programming!*/

    //1 way
    System.out.println("Welcome");
    System.out.println("to");
    System.out.println("Java");
    System.out.println("Programming!");

    System.out.println("\n");
    // 2 way
    System.out.print("Welcome\nto\nJava\nProgramming!");




    /*Number 2 Sum
    Write your program so that it is able to produce the following screen display:
    Enter first integer: 45
    Enter second integer: 72
    Sum is 117*/

    String input1 = JOptionPane.showInputDialog("Enter first integer:");
    String input2 = JOptionPane.showInputDialog("Enter second integer:");

    int num1 = Integer.parseInt(input1);
    int num2 = Integer.parseInt(input2);

    int sum = num1 + num2;

    JOptionPane.showMessageDialog(null, "Sum is " + sum);





    /*Number 3 Test Average
    Write a program that asks the user to enter three test scores. The program should display
    each test score, as well as the average of the scores.
    */
    System.out.println("\n");

    Scanner scoresscanner = new Scanner(System.in);

    System.out.print("Enter test score 1: ");
    double sc1 = scoresscanner.nextDouble();
    System.out.print("Enter test score 2: ");
    double sc2 = scoresscanner.nextDouble();
    System.out.print("Enter test score 3: ");
    double sc3 = scoresscanner.nextDouble();

    double avg = (sc1 + sc2 + sc3) / 3;

    System.out.println("\nEach test score and the average.");
    System.out.println("Score 1 = " + sc1);
    System.out.println("Score 2 = " + sc2);
    System.out.println("Score 3 = " + sc3);
    System.out.println("The average is: " + avg);




    /*Number 4 Salary Calculator
    Develop a Java application that determines the gross pay for each of three employees.
    The company pays straight time for the first 40 hours worked by each employee and time
    and a half for all hours worked in excess of 40. Create a list of the employees, their
    number of hours worked last week and their hourly rates. Your program should input this
    information for each employee, then determine and display the employee’s gross pay.
    Use class Scanner to input the data.*/
    System.out.println("\n");

    Scanner dataInput = new Scanner(System.in);
    double payperHour, hWorked, gPay, rPay, otPay;


    //employee number 1
    System.out.println("Employee Number 1:");
    System.out.print("Hourly rate: ");
    payperHour = dataInput.nextDouble();
    System.out.print("Hours worked: ");
    hWorked = dataInput.nextDouble();

    if (hWorked <= 40) {
        gPay = hWorked * payperHour;
    } else {
        rPay = 40 * payperHour;
        otPay = (hWorked - 40) * (payperHour * 1.5);
        gPay = rPay + otPay;
    }
    System.out.printf("Gross pay for employee number 1: $%.2f%n%n", gPay);




    //employee number 2
    System.out.println("Employee Number 2:");
    System.out.print("Hourly rate: ");
    payperHour = dataInput.nextDouble();
    System.out.print("Hours worked: ");
    hWorked = dataInput.nextDouble();

    if (hWorked <= 40) {
        gPay = hWorked * payperHour;
    } else {
        rPay = 40 * payperHour;
        otPay = (hWorked - 40) * (payperHour * 1.5);
        gPay = rPay + otPay;
    }
    System.out.printf("Gross pay for employee number 2: $%.2f%n%n", gPay);



    //employee number 3
    System.out.println("Employee Number3:");
    System.out.print("Hourly rate: ");
    payperHour = dataInput.nextDouble();
    System.out.print("Hours worked: ");
    hWorked = dataInput.nextDouble();

    if (hWorked <= 40) {
        gPay = hWorked * payperHour;
    } else {
        rPay = 40 * payperHour;
        otPay = (hWorked - 40) * (payperHour * 1.5);
        gPay = rPay + otPay;
    }
    System.out.printf("Gross pay for employee number 3: $%.2f%n", gPay);






    /*Number 5 Calculator
    Write a program that asks the user to enter a number of seconds.
    There are 60 seconds in a minute. If the number of seconds entered by the user is greater than
    or equal to 60, the program should display the number of minutes in that many seconds.
    Else lesser than  60 seconds should display “Not up to a  minute” */
    System.out.println("\n");

    Scanner secondsInput = new Scanner(System.in);

    System.out.print("Write the number of seconds: ");
    int secondsTotal = secondsInput.nextInt();

    if (secondsTotal >= 60) {
        int minutes = secondsTotal / 60;
        System.out.println("The number of minutes is: " + minutes);
    } else {
        System.out.println("Not up to a  minute");
    }





    /*Number 6 Calculator
    Write a Java program to print the area and perimeter of a rectangle.
    Hint */
    System.out.println("\n");

    Scanner whInput = new Scanner(System.in);

    System.out.print("Write the width of the rectangle: ");
    double w = whInput.nextDouble();
    System.out.print("Write the height of the rectangle: ");
    double h = whInput.nextDouble();

    double area = w * h;
    double perimeter = 2 * (w + h);

    System.out.println("\nResults of Area and Perimeter");
    System.out.printf("The area is: %.2f%n", area);
    System.out.printf("The perimeter is: %.2f%n", perimeter);

    whInput.close();

}


