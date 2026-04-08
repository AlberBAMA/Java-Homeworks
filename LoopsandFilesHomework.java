import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class LoopsandFilesHomework {
    public static void main(String[] args) throws FileNotFoundException {


        //1. Sum of numbers
        Scanner keyboard = new Scanner(System.in);
        int limit;
        int sum = 0;

        System.out.print("Type a number greater than 0: ");
        limit = keyboard.nextInt();

        if (limit > 0) {

            for (int i = 1; i <= limit; i++) {
                sum += i;
            }
            System.out.println("The sum of all numbers from 1 to " + limit + " is = " + sum);

        } else {
            System.out.println("Invalid number.");
        }






        //2. Distance Traveled
        Scanner keyboard2 = new Scanner(System.in);
        int speed, hours;

        System.out.print("Enter vehicle speed (in mph): ");
        speed = keyboard2.nextInt();
        while (speed < 0) {
            System.out.print("Speed cannot be negative. Try again: ");
            speed = keyboard2.nextInt();
        }

        System.out.print("Enter hours traveled: ");
        hours = keyboard2.nextInt();
        while (hours < 1) {
            System.out.print("Hours must be at least 1. Try again: ");
            hours = keyboard2.nextInt();
        }

        System.out.println("\nHour    Distance Traveled");
        System.out.println("---------------------------");

        for (int hour = 1; hour <= hours; hour++) {
            int distance = speed * hour;
            System.out.println(hour + "\t\t" + distance);
        }



        //7. Hotel Occupancy
        Scanner keyboard3 = new Scanner(System.in);

        int floors;
        int rooms = 0;
        int occupiedRooms = 0;

        System.out.print("Enter the number of floors: ");
        floors = keyboard3.nextInt();

        while (floors < 1) {
            System.out.print("Invalid. Enter 1 or more floors: ");
            floors = keyboard3.nextInt();
        }

        for (int i = 1; i <= floors; i++) {
            int roomsOnFloor;
            int occupiedOnFloor;


            System.out.print("How many rooms are on floor " + i + "? ");
            roomsOnFloor = keyboard3.nextInt();
            while (roomsOnFloor < 10) {
                System.out.print("Invalid. Minimum 10 rooms required: ");
                roomsOnFloor = keyboard3.nextInt();
            }

            System.out.print("How many of those rooms are occupied? ");
            occupiedOnFloor = keyboard3.nextInt();

            rooms += roomsOnFloor;
            occupiedRooms += occupiedOnFloor;
        }

        int vacantRooms = rooms - occupiedRooms;
        double occupancyRate = (double) occupiedRooms / rooms;

        System.out.println("\n--- Hotel Report ---");
        System.out.println("Total Rooms: " + rooms);
        System.out.println("Occupied Rooms: " + occupiedRooms);
        System.out.println("Vacant Rooms: " + vacantRooms);
        System.out.println("Occupancy Rate: " + (occupancyRate * 100) + "%");







        //13. File Head Display
        Scanner keyboard4 = new Scanner(System.in);

        System.out.print("Enter the file's name: ");
        String fileName = keyboard4.nextLine();

        try {
            File file = new File(fileName);
            Scanner fileInput = new Scanner(file);

            int lineCount = 0;
            System.out.println("\n--- Displaying the first 5 lines ---");

            while (fileInput.hasNext() && lineCount < 5) {
                String line = fileInput.nextLine();
                System.out.println(line);
                lineCount++;
            }

            fileInput.close();

        } catch (FileNotFoundException e) {
            System.out.println("The file '" + fileName + "' was not found.");
        }





        //14. Line numbers
        Scanner keyboard5 = new Scanner(System.in);

        System.out.print("Enter the file's name: ");
        String file2Name = keyboard5.nextLine();

        try {
            File file2 = new File(file2Name);
            Scanner fileInput2 = new Scanner(file2);

            int lineNumber = 1;

            System.out.println("\n--- File contents with lines' numbers ---");

            while (fileInput2.hasNext()) {
                String line = fileInput2.nextLine();
                System.out.println(lineNumber + ": " + line);

                lineNumber++;
            }

            fileInput2.close();

        } catch (FileNotFoundException e) {
            System.out.println("The file '" + file2Name + "' was not found.");
        }














        //15. Uppercase File Converter
        Scanner keyboard6 = new Scanner(System.in);

        System.out.print("Enter the name of the source file: ");
        String sourceFileName = keyboard6.nextLine();
        System.out.print("Enter the name of the destination file: ");
        String destFileN = keyboard6.nextLine();

        File sourceFile = new File(sourceFileName);

        if (!sourceFile.exists()) {
            System.out.println("The file " + sourceFileName + " does not exist.");
            System.exit(0);
        }

        Scanner fileInput3 = new Scanner(sourceFile);
        PrintWriter outputFile = new PrintWriter(destFileN);


        while (fileInput3.hasNext()) {

            String line = fileInput3.nextLine();
            outputFile.println(line.toUpperCase());
        }

        fileInput3.close();
        outputFile.close();

        System.out.println("Process complete. All text has been converted to uppercase.");










    }
}
