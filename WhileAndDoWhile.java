package Chapter2.src;

public class WhileAndDoWhile {
    public static void main(String[] args) {
        /*
         * int x = 0;
         * while (x != 10) {
         * System.out.println(x);
         * x++;
         * }
         * 
         * do {
         * System.out.println("Count value was " + x);
         * x++;
         * } while (x != 6);
         * }
         */

        int x = 4;
        int lastNum = 20;
        int count = 0;

        while (x <= lastNum) {
            x++;
            if (!isEvenNumber(x)) {
                continue;
            }
            System.out.println("Even number " + x);
            count++;
            if (count >= 5) {
                break;
            }
        }
        System.out.println("even number total " + count);

    }

    public static boolean isEvenNumber(int x) {
        if (x % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
