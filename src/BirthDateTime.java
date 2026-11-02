import java.util.Scanner;

public class BirthDateTime {
    void main()
    {
        Scanner in = new Scanner(System.in);
        int year = 0;
        int month = 0;
        int day = 0;
        int hours = 0;
        int minutes = 0;
        int maxDays = 31;

        IO.println("Enter the date and time you were born.");
        year = SafeInput.getRangedInt(in, "Enter the year", 1950, 2015);
        month = SafeInput.getRangedInt(in, "Enter the month", 1, 12);

        switch(month) {
            case 4, 6, 9, 11:
                maxDays = 30;
                break;
            case 2:
                maxDays = 29;
                break;
            default:
                maxDays = 31;
                break;
        }

        day = SafeInput.getRangedInt(in, "Enter the day", 1, maxDays);
        hours = SafeInput.getRangedInt(in, "Enter the hour", 1, 24);
        minutes = SafeInput.getRangedInt(in, "Enter the minutes", 1, 59);

        IO.println("\nYou were born on " + month + "/" + day + "/" + year + ".");
        IO.println("Time of birth: " + hours + ":" + minutes);
    }
}
