import javax.swing.*;
import java.util.Scanner;

public class HomeworkMethods {
    public static void main(String[] args) {
        double wholesale;
        double markup;
        double retailPrice;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Item's wholesale cost: ");
        wholesale = keyboard.nextDouble();
        System.out.print("Item's markup percentage (Example: 50 for 50%): ");
        markup = keyboard.nextDouble();


        retailPrice = calculateRetail(wholesale, markup);

        System.out.printf("The item's retail price is $%,.2f\n", retailPrice);


        paintJobEstimator(230.0);
        testAverageAndGrade();
    }


    public static double calculateRetail(double wholesale, double markup) {

        double markupAmount = wholesale * (markup / 100);
        return wholesale + markupAmount;
    }










    //2.0 paintJobEstimator
    public static void paintJobEstimator(double squareS) {
            int rooms;
            double paintPrice, totalSqFeet = 0;
            Scanner keyboard = new Scanner(System.in);


            System.out.print("Number of rooms: ");
            rooms = keyboard.nextInt();
            System.out.print("Price of paint/gallon: ");
            paintPrice = keyboard.nextDouble();

            for (int i = 1; i <= rooms; i++) {
                System.out.print("Type the square feet for room " + i + ": ");
                totalSqFeet += keyboard.nextDouble();
            }


            int gallons = getGallons(totalSqFeet);
            double hours = getHours(totalSqFeet);
            double paintCost = getPaintCost(gallons, paintPrice);
            double laborCost = getLaborCost(hours);
            double jobTotalCost = getjobTotalCost(paintCost, laborCost);

            displayResults(gallons, hours, paintCost, laborCost, jobTotalCost);
        }

        public static int getGallons ( double sqFeet){
            return (int) Math.ceil(sqFeet / 115.0);
        }
        public static double getHours ( double sqFeet){
            return (sqFeet * 8.0) / 115.0;
        }
        public static double getPaintCost ( int gallons, double price){
            return gallons * price;
        }
        public static double getLaborCost ( double hours){
            return hours * 18.0;
        }
        public static double getjobTotalCost ( double paint, double labor){
            return paint + labor;
        }

        public static void displayResults(int g, double h, double pc, double lc, double tc) {
            String output = String.format(
                    "<html>" +
                            "<h2 style='color: #2e7d32;'>--- Job Estimate ---</h2>" +
                            "<hr>" +
                            "<b>Gallons of paint:</b> %d<br>" +
                            "<b>Hours of labor:</b> %.2f hrs<br>" +
                            "<b>Paint cost:</b> $%,.2f<br>" +
                            "<b>Labor charges:</b> $%,.2f<br>" +
                            "<hr>" +
                            "<h3 style='color: #1565c0;'>Total cost: $%,.2f</h3>" +
                            "</html>",
                    g, h, pc, lc, tc
            );

            JOptionPane.showMessageDialog(null, output, "Estimate Result", JOptionPane.INFORMATION_MESSAGE);
        }












    //3.0 TestAverageAndGrade
    public static void testAverageAndGrade() {
            double s1, s2, s3, s4, s5;
            double average;

            Scanner keyboard = new Scanner(System.in);

            System.out.println("Test Score Entry");

            System.out.print("Enter score 1= ");
            s1 = keyboard.nextDouble();
            System.out.print("Enter score 2= ");
            s2 = keyboard.nextDouble();
            System.out.print("Enter score 3= ");
            s3 = keyboard.nextDouble();
            System.out.print("Enter score 4= ");
            s4 = keyboard.nextDouble();
            System.out.print("Enter score 5= ");
            s5 = keyboard.nextDouble();

            average = calcAverage(s1, s2, s3, s4, s5);

            System.out.println("\nGRADES REPORT");
            System.out.println("--------------------------");
            System.out.printf("Score 1: %.1f | Grade: %c\n", s1, determineGrade(s1));
            System.out.printf("Score 2: %.1f | Grade: %c\n", s2, determineGrade(s2));
            System.out.printf("Score 3: %.1f | Grade: %c\n", s3, determineGrade(s3));
            System.out.printf("Score 4: %.1f | Grade: %c\n", s4, determineGrade(s4));
            System.out.printf("Score 5: %.1f | Grade: %c\n", s5, determineGrade(s5));
            System.out.println("--------------------------");
            System.out.printf("AVERAGE: %.2f\n", average);
            System.out.printf("FINAL LETTER GRADE: %c\n", determineGrade(average));

            keyboard.close();
        }

        public static double calcAverage(double s1, double s2, double s3, double s4, double s5) {
            return (s1 + s2 + s3 + s4 + s5) / 5.0;
        }

        public static char determineGrade(double score) {
            if (score >= 90)
                return 'A';
            else if (score >= 80)
                return 'B';
            else if (score >= 70)
                return 'C';
            else if (score >= 60)
                return 'D';
            else
                return 'F';
        }



    }









