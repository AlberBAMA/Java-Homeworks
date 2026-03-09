
import javax.swing.JOptionPane;


public class Salescommissioncalculatorcher3 {


    public static void main(String[] args)
    {

        int item;
        double totalSales = 0;

        String input = JOptionPane.showInputDialog(
                "Enter the item number: (1-4)\nType 0 to finish:");

        item = Integer.parseInt(input);

        while(item != 0)
        {
            switch(item)
            {
                case 1:
                    totalSales += 239.99;
                    break;

                case 2:
                    totalSales += 129.75;
                    break;

                case 3:
                    totalSales += 99.95;
                    break;

                case 4:
                    totalSales += 350.89;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Invalid item.");
            }

            input = JOptionPane.showInputDialog(
                    "Enter the item number: (1-4)\nType 0 to finish:");

            item = Integer.parseInt(input);
        }

        double salary = 200 + (0.09 * totalSales);

        JOptionPane.showMessageDialog(null,
                "Total: $" + totalSales + "\nWeekly Earnings: $" + salary);

        System.exit(0);

    }
}
