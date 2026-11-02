import java.util.Scanner;

public class GetUserName {
    void main()
    {
        Scanner in = new Scanner(System.in);
        String firstName = "";
        String lastName = "";

        firstName = SafeInput.getNonZeroLenString(in, "Enter your first name");
        lastName = SafeInput.getNonZeroLenString(in, "Enter your last name");

        IO.println("\nYour full name is: " + firstName + " " + lastName);
    }
}
