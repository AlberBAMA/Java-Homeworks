import javax.swing.JOptionPane;



public class Homework3
{
    public static void main(String[] args)
    {
        //Number 1
        String input;
        double mass;
        double weight;

        input = JOptionPane.showInputDialog("Enter the object's mass in kilograms:");
        mass = Double.parseDouble(input);

        weight = mass * 9.8;

        JOptionPane.showMessageDialog(null, "The object's weight is " + weight + " Newtons.");

        if (weight > 1000)
        {
            JOptionPane.showMessageDialog(null, "The object is too heavy.");
        }
        else if (weight < 10)
        {
            JOptionPane.showMessageDialog(null, "The object is too light.");
        }





        //Number 2
        String name1, name2, name3;
        String first, second, third;

        name1 = JOptionPane.showInputDialog("Enter the first name:");
        name2 = JOptionPane.showInputDialog("Enter the second name:");
        name3 = JOptionPane.showInputDialog("Enter the third name:");

        if (name1.compareToIgnoreCase(name2) <= 0 && name1.compareToIgnoreCase(name3) <= 0)
        {
            first = name1;

            if (name2.compareToIgnoreCase(name3) <= 0)
            {
                second = name2;
                third = name3;
            }
            else
            {
                second = name3;
                third = name2;
            }
        }
        else if (name2.compareToIgnoreCase(name1) <= 0 && name2.compareToIgnoreCase(name3) <= 0)
        {
            first = name2;

            if (name1.compareToIgnoreCase(name3) <= 0)
            {
                second = name1;
                third = name3;
            }
            else
            {
                second = name3;
                third = name1;
            }
        }
        else
        {
            first = name3;

            if (name1.compareToIgnoreCase(name2) <= 0)
            {
                second = name1;
                third = name2;
            }
            else
            {
                second = name2;
                third = name1;
            }
        }

        JOptionPane.showMessageDialog(null, first + "\n" + second + "\n" + third);







        //Number 3
        String input2;
        double totalCalories;
        double fatGrams;
        double caloriesFromFat;
        double fatPercentage;

        input2 = JOptionPane.showInputDialog("Enter total calories:");
        totalCalories = Double.parseDouble(input2);

        input2 = JOptionPane.showInputDialog("Enter fat grams:");
        fatGrams = Double.parseDouble(input2);

        caloriesFromFat = fatGrams * 9;

        if (caloriesFromFat > totalCalories)
        {
            JOptionPane.showMessageDialog(null, "Error: Calories from fat cannot exceed total calories.");
        }
        else
        {
            fatPercentage = caloriesFromFat / totalCalories * 100;

            JOptionPane.showMessageDialog(null, String.format("Calories from fat: %.2f\n" + "Percentage of calories from fat: %.2f%%", caloriesFromFat, fatPercentage));

            if (fatPercentage < 30)
            {
                JOptionPane.showMessageDialog(null, "This food is low in fat.");
            }
        }





        //Number 4
        String input3;
        int number;
        
        input3 = JOptionPane.showInputDialog("Enter a number between 1 and 10:");
        number = Integer.parseInt(input3);
        
        switch (number)
        {
            case 1:
                JOptionPane.showMessageDialog(null, "I");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "II");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "III");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "IV");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "V");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "VI");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "VII");
                break;
            case 8:
                JOptionPane.showMessageDialog(null, "VIII");
                break;
            case 9:
                JOptionPane.showMessageDialog(null, "IX");
                break;
            case 10:
                JOptionPane.showMessageDialog(null, "X");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Error: Number must be between 1 and 10.");
        }

        System.exit(0);




    }
}
