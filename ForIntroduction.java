package Chapter2.src;

public class ForIntroduction {
    public static void main(String[] args) {
        int numberOfPrimes = 0;
        for (int i = 50; i < 100; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                numberOfPrimes++;
            } else if(numberOfPrimes == 3) {
                break;
            }
            
        }

        // for(int i = 8; i > 0; i--) {

        // System.out.println("Cost with interest rate of " + i + " % = " +
        // String.format("%.2f",calculateInterest(10000, (double) i)));

    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));

    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
