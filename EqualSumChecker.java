package Chapter2.src;

public class EqualSumChecker {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1, 1, 1));
        System.out.println(hasEqualSum(2, 3, 5));
        System.out.println(hasEqualSum(-1, 3, 2));
    }

    public static boolean hasEqualSum(int numberOne, int numberTwo, int sum) {
        if(numberOne + numberTwo == sum) {
            return true;
        }
        return false;
    }
}
