import java.util.Scanner;

public class FavNumbers {
    void main()
    {
        Scanner in = new Scanner(System.in);
        int favInt = 0;
        double favDouble = 0;

        favInt = SafeInput.getInt(in, "Enter your favorite integer");
        favDouble = SafeInput.getDouble(in, "Enter your favorite double");

        IO.println("\nYour favorite integer is: " + favInt);
        IO.println("Your favorite double is: " + favDouble);
    }
}
