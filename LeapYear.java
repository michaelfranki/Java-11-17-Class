package Chapter2.src;

public class LeapYear {
    public static void main(String[] args) {

        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(1924));
    }

    public static boolean isLeapYear(int year) {

        if (year >= 1 && year <= 9999) {
            if (year % 4 != 0) {
                return false;
            } else if (year % 100 != 0) {
                return true;
            } else if (year % 400 == 0) {
                return true;
            }
        }
        return false;
    }
}
