import java.util.Scanner;

public class CheckOut {
    void main()
    {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0;
        double totalCost = 0;
        int itemCount = 0;
        boolean moreItems = false;

        IO.println("Welcome to the $10 Store!");
        IO.println("____________________________");
        do {
            itemPrice = SafeInput.getRangedDouble(in, "Enter the item's price", 0.50, 10.00);
            totalCost += itemPrice;
            itemCount++;
            moreItems = SafeInput.getYNConfirm(in, "Do you have more items?");
        }while(moreItems);

        IO.println("\nItems purchased: " + itemCount);
        System.out.printf("Your total cost is: $%.2f%n", totalCost);
    }
}
