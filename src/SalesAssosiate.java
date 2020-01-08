import java.util.Scanner;

public class SalesAssosiate
{
    private String name;
    private double sales;

    public SalesAssosiate()
    {
        name = "No name yet";
        sales = 0;
    }
    public SalesAssosiate(String inititalName, double initialSales)
    {
        set(inititalName, initialSales);

    }
    public void set(String newName, double newSales)
    {
        name = newName;
        sales = newSales;
    }
    public void readInPut()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter name of associate");
        name = keyboard.nextLine();
        System.out.println("Enter sales of Associate");
        sales = keyboard.nextDouble();
    }
    public void writeOutput()
    {
        System.out.println("Name: "+ name);
        System.out.println("Sales: "+ sales);
    }

    public String getName()
    {
        return  name;
    }
    public double getSales()
    {
        return sales;

    }

}
