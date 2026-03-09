
import javax.swing.JOptionPane;



public class Salescommissioncalculatorcher3 {


    public static void main(String[] args)
    {

        int item1, item2, item3, item4;
        double totalSales;
        double salary;
        String input;

        input = JOptionPane.showInputDialog("Item 1 (239.99) - How many times was it sold?");
        item1 = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("Item 2 (129.75) - How many times was it sold?");
        item2 = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("Item 3 (99.95) - How many times was it sold?");
        item3 = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("Item 4 (350.89) - How many times was it sold?");
        item4 = Integer.parseInt(input);

        totalSales = (item1 * 239.99) +
                (item2 * 129.75) +
                (item3 * 99.95) +
                (item4 * 350.89);

        salary = 200 + (0.09 * totalSales);

        JOptionPane.showMessageDialog(null, "Gross Sales: $" + totalSales + "\nWeekly Earnings: $" + salary);

        System.exit(0);

    }
}
