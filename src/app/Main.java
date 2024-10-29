package app;

public class Main {
    public static void main (String[] args) {
        System.out.println("My Git app for Users");

        double a = 8;
        double b = 18;
        double c = milTokm(a);
        System.out.println(c);
    }

    private static double milTokm (double a) {
        return a * 1.609;
    }
}
