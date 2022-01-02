package Chapter2.src;

public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(getDaysInMonth(2, -2000));
        System.out.println(getDaysInMonth(2, 2000));
        System.out.println(getDaysInMonth(3, 1960));
        System.out.println(getDaysInMonth(2, -2000));
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

    public static int getDaysInMonth(int month, int year) {

        if ((month > 1 && month < 12) && (year > 1 && year < 9999)) {
            if (isLeapYear(year) && month == 2) {
                return 29;
            }

            switch (month) {
                case 1:
                    return 31;

                case 2:
                    return 28;

                case 3:
                    return 31;

                case 4:
                    return 30;

                case 5:
                    return 31;

                case 6:
                    return 30;

                case 7:
                    return 31;

                case 8:
                    return 31;

                case 9:
                    return 30;

                case 10:
                    return 30;

                case 11:
                    return 30;

                case 12:
                    return 31;

            }
        }
        return -1;
    }

}
