package Chapter2.src;

public class MinutesToYearsCalculator {
    public static void main(String[] args) {

        printYearsAndDays(-561600);

    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid value");
        } else {
            long hours = minutes / 60;
            long days = hours / 24;
            long years = days / 365;
            long remainingDays = days % 365;

            System.out.println(minutes + " min" + " = " + years + " y and " + remainingDays + " d");
        }
    }
}
