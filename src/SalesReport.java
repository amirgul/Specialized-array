import java.util.Scanner;

public class SalesReport
{
    private double highestSales;
    private double averageSales;
    private SalesAssosiate[] team;
    private int numberOfAssociates;

    public void getDate()
    {
        Scanner keybaord = new Scanner(System.in);
        System.out.println("Enter number of sales Associates");
        numberOfAssociates = keybaord.nextInt();
        team = new SalesAssosiate[numberOfAssociates+1];
        for(int i = 1; i<=numberOfAssociates; i++)
        {
            team[i] = new SalesAssosiate();
            System.out.println("Enter date for associagte: "+ (i));
            team[i].readInPut();
            System.out.println();
        }
    }
    public void computeStatus()
    {
        double nextSales = team[1].getSales();
        highestSales = nextSales;
        double sum = nextSales;
        for(int i = 2; i<= numberOfAssociates; i++)
        {
            nextSales = team[i].getSales();
            sum = sum + nextSales;
            if(nextSales > highestSales)
                highestSales = nextSales;
        }
        averageSales = sum/numberOfAssociates;
    }

    public void displayResult()
    {
        System.out.println("Average Sales per associate is: "+ averageSales);
        System.out.println("the highest Sales is: "+ highestSales);
        System.out.println();
        System.out.println("The following had the following highest Sales");
        for(int i = 1; i<= numberOfAssociates; i++)
        {
            double nextSales = team[i].getSales();
            if(nextSales == highestSales)
            {
                team[i].writeOutput();
                System.out.println(nextSales -averageSales + " above the average");
            }
        }
        System.out.println("The rest performed as fallows");

        for(int i = 1; i<= numberOfAssociates; i++)
        {
            double nextSales = team[i].getSales();
            if(nextSales != highestSales)
            {
                team[i].writeOutput();
                if(nextSales >= averageSales)
                    System.out.println(nextSales - averageSales +" above the average");
                else
                    System.out.println(averageSales - nextSales+ " below the average");

                System.out.println();
            }
        }
    }
}
