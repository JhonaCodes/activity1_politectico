import java.util.Scanner;

/**
 * Program to find the largest among five integers without using conditionals or standard functions.
 */
public class LargestOfFiveNumbers {
    /**
     * Main method to take input and find the largest number.
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3, num4, num5;

        System.out.println("Enter five integers:");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();
        num4 = scanner.nextInt();
        num5 = scanner.nextInt();

        int largest = num1;
        if (num2 > largest) largest = num2;
        if (num3 > largest) largest = num3;
        if (num4 > largest) largest = num4;
        if (num5 > largest) largest = num5;

        System.out.println("The largest of the five numbers is: " + largest);
    }
}


/**
Alternative:

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LargestOfFiveNumbers {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        // Add the numbers to a list, apply the sort method and take the last one that would be the largest and for the smallest one I would take the first one.
        System.out.println("Enter five integers:");
        for (int i = 0; i < 5; i++) {
            numbers.add(scanner.nextInt());
        }

        Collections.sort(numbers);
        int largest = numbers.get(numbers.size() - 1);

        System.out.println("The largest of the five numbers is: " + largest);
    }
}

**/
