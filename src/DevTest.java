import java.util.Scanner;

public class DevTest {
    void main()
    {
        Scanner in = new Scanner(System.in);
        String name = "";
        String patternInput = "";
        int number = 0;
        int rangedNumber = 0;
        double decimalNumber = 0;
        double rangedDecimal = 0;
        boolean yesNo = false;

        IO.println("SafeInput Method Testing");
        IO.println("____________________________");

        IO.println("\nPart A: getNonZeroLenString");
        name = SafeInput.getNonZeroLenString(in, "Enter your name");
        IO.println("Returned: " + name);

        IO.println("\nPart B: getInt");
        number = SafeInput.getInt(in, "Enter any integer");
        IO.println("Returned: " + number);

        IO.println("\nPart C: getDouble");
        decimalNumber = SafeInput.getDouble(in, "Enter any double");
        IO.println("Returned: " + decimalNumber);

        IO.println("\nPart D: getRangedInt");
        rangedNumber = SafeInput.getRangedInt(in, "Enter a number", -5, 5);
        IO.println("Returned: " + rangedNumber);

        IO.println("\nPart E: getRangedDouble");
        rangedDecimal = SafeInput.getRangedDouble(in, "Enter a decimal number", 0.5, 10.0);
        IO.println("Returned: " + rangedDecimal);

        IO.println("\nPart F: getYNConfirm");
        yesNo = SafeInput.getYNConfirm(in, "Do you like Java?");
        IO.println("Returned: " + yesNo);

        IO.println("\nPart G: getRegExString");
        patternInput = SafeInput.getRegExString(in, "Enter three letters", "^[A-Za-z]{3}$");
        IO.println("Returned: " + patternInput);

        IO.println("\nPart H: prettyHeader");
        SafeInput.prettyHeader("This is a pretty header");
    }
}
