package app;

public class Main {
    public static void main (String[] args) {
        System.out.println("My Git app for Users");

        double a = 8;
        double b = 18;
        double c = milTokm(a);
        double d = kmToMiles(b);
        System.out.println("8 Miles = " + c);
        System.out.println("18 Km to Miles = " + d);
    }

    private static double milTokm (double a) {
        return a * 1.609;
    }
    private static double kmToMiles (double b) {
        return b / 1.609;
    }
}
