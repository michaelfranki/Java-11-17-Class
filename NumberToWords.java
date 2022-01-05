package OOP.src;

public class NumberToWords {
    public static void main(String[] args) {
        System.out.println(reverse(622));
        numberToWords(1000);
        System.out.println(getDigitCount(0));
        System.out.println(reverse(-2));
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        String numberString = "";
        int differenceBetweenNums = getDigitCount(number) - getDigitCount(reverse(number));
        number = reverse(number);

        while (number >= 0) {
            int lastDigit = number % 10;
            number /= 10;

            if (lastDigit == 0) {
                numberString += "Zero ";
            } else if (lastDigit == 1) {
                numberString += "One ";
            } else if (lastDigit == 2) {
                numberString += "Two ";
            } else if (lastDigit == 3) {
                numberString += "Three ";
            } else if (lastDigit == 4) {
                numberString += "Four ";
            } else if (lastDigit == 5) {
                numberString += "Five ";
            } else if (lastDigit == 6) {
                numberString += "Six ";
            } else if (lastDigit == 7) {
                numberString += "Seven ";
            } else if (lastDigit == 8) {
                numberString += "Eight ";
            } else {
                numberString += "Nine ";
            }

        }
        for (int i = 0; i < differenceBetweenNums; i++) {
            numberString += "Zero ";
        }
        System.out.println(numberString);
    }

    public static int reverse(int number) {
        int reverse = 0;

        while (number != 0) {
            int lastDigit = number % 10;

            reverse = (reverse * 10) + lastDigit;

            // 101 / 10 = 10
            number /= 10;
        }
        return reverse;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        } else if(number == 0) {
            return 1;
        }
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }
}