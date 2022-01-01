package Chapter2.src;

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(100));
        System.out.println(calcFeetAndInchesToCentimeters(200));
    }

    // 1 foot = 30.48 cm
    // 1 inch = 2.54 cm
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet <= 0 && inches > 12) {
            return -1;
        } else {
            double totalCentimeters;

            feet *= 30.48;
            inches /= 12;

            totalCentimeters = feet + inches;

            return totalCentimeters;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if(inches < 0) {
            return -1;
        } else {
            double feet =  (int) inches / 12;
            double remainingInches = (int) inches % 12;
            System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches.");

           return calcFeetAndInchesToCentimeters(feet, inches);
        }
    }
}
