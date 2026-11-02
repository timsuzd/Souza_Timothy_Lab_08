import java.util.Scanner;

public class Reggie {
    void main()
    {
        Scanner in = new Scanner(System.in);
        String ssn = "";
        String studentNumber = "";
        String menuChoice = "";

        IO.println("RegEx is Magic!");
        IO.println("____________________________");

        ssn = SafeInput.getRegExString(in, "Enter your SSN (###-##-####)", "^\\d{3}-\\d{2}-\\d{4}$");
        IO.println("SSN format accepted.");

        studentNumber = SafeInput.getRegExString(in, "Enter your UC Student M number", "^(M|m)\\d{8}$");
        IO.println("Student M number accepted: " + studentNumber);

        IO.println("Menu: [O]pen [S]ave [V]iew [Q]uit");
        menuChoice = SafeInput.getRegExString(in, "Enter a menu choice", "^[OoSsVvQq]$");
        IO.println("Menu choice accepted: " + menuChoice);
    }
}
