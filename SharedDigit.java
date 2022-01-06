package Chapter2.src;

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(25, 53));
        System.out.println(hasSharedDigit(32, 13));
        System.out.println(hasSharedDigit(66, 63));
    }

    public static boolean hasSharedDigit(int x, int y) {
        if((x < 10 || y < 10) || (x > 99 || y > 99)) {
            return false;
        }

        
            int xDigit = x % 10;
            int yDigit = y % 10;
            int xDigitTen = x / 10;
            int yDigitTen = y / 10;
            if((xDigit == yDigit) || (xDigitTen == yDigitTen) || (xDigit == yDigitTen) || (yDigit == xDigitTen)) {
                return true;
            }
        
        return false;
    }
}
