package Chapter2.src;

public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175)); //outputs TRUE
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176)); //outputs FALSE
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0)); //outputs TRUE
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123)); //outputs FALSE
        System.out.println(areEqualByThreeDecimalPlaces(3.1756, 3.1757)); //outputs TRUE
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, 3.1757)); //outputs FALSE
        System.out.println(areEqualByThreeDecimalPlaces(3.174, 3.175));
    }

    public static boolean areEqualByThreeDecimalPlaces(double testNumberOne, double testNumberTwo) {
        //if one number is negative and the other isnt, return false
        if ((testNumberOne < 0 && testNumberTwo > 0) || (testNumberOne > 0 && testNumberTwo < 0)) {
            return false;
        }

        //i did this to make negative input and positive input the same equation
        testNumberOne = Math.abs(testNumberOne);
        testNumberTwo = Math.abs(testNumberTwo);


        // these if statements are so the answer is always positive
        if (testNumberOne > testNumberTwo) {
            double testNumberTotal = (testNumberOne) - (testNumberTwo);

            if ((testNumberOne) == testNumberTwo) {
                return true;
            } else if ((double) testNumberTotal >= 0.0009) {
                return false;
            }
        } else if (testNumberTwo > testNumberOne) {
            double testNumberTotal = (testNumberTwo) - (testNumberOne);

            if ((testNumberOne) == testNumberTwo) {
                return true;
            } else if ((double) testNumberTotal >= 0.0009) {
                return false;
            }
        }
        return true;
    }

}
