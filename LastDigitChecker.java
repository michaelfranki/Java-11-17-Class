package Chapter2.src;

public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 61));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 32, 42));
    }

    public static boolean hasSameLastDigit(int x, int y, int z) {
        if (!isValid(x) || !isValid(y) || !isValid(z)) {
            return false;
        }
        int rightMostX = x % 10;
        int rightMostY = y % 10;
        int rightMostZ = z % 10;

        if (rightMostX == rightMostY || rightMostX == rightMostZ || rightMostY == rightMostZ) {
            return true;
        }
        return false;
    }

    public static boolean isValid(int number) {
        if ((number < 10 || number > 1000)) {
            return false;
        }
        return true;
    }
}
