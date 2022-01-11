package ReadingUserInput.src;
import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;

        while (counter < 11) {
            int order = counter + 1;
            System.out.println("Enter number #" + order + ":");

            boolean hasAnInt = scanner.hasNextInt();

            if (hasAnInt) {
                int number = scanner.nextInt();
                counter++;
                sum += number;
               // if(counter == 10) {
               //     break;
               // }
            } else {
                System.out.println("Invalid number");
            }

            scanner.nextLine();
        }

        System.out.println("The sum of inputted numbers is " + sum);
        scanner.close();
    }
}