public class CtoFTableDisplay {
    void main()
    {
        IO.println("Celsius to Fahrenheit Table");
        IO.println("____________________________");
        System.out.printf("%10s %12s%n", "Celsius", "Fahrenheit");

        for (int i = -100; i <= 100; i++) {
            System.out.printf("%10d %12.2f%n", i, CtoF(i));
        }
    }

    public static double CtoF(double Celsius)
    {
        double Fahrenheit = (Celsius * 9.0 / 5.0) + 32;
        return Fahrenheit;
    }
}