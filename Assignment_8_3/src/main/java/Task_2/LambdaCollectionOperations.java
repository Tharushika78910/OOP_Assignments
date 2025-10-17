package Task_2;

import java.util.*;

public class LambdaCollectionOperations {
    public static void main(String[] args) {

        // Step 1: Create a list of integers
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 5, 8, 20, 15, 3, 12));

        System.out.println("Original list:");
        numbers.forEach(n -> System.out.print(n + " "));
        System.out.println();

        // Step 2: Filter out even numbers
        numbers.removeIf(n -> n % 2 == 0);

        System.out.println("\nAfter removing even numbers:");
        numbers.forEach(n -> System.out.print(n + " "));
        System.out.println();

        // Step 3: Double the odd numbers
        numbers.replaceAll(n -> n * 2);

        System.out.println("\nAfter doubling the odd numbers:");
        numbers.forEach(n -> System.out.print(n + " "));
        System.out.println();

        // Step 4: Calculate the sum
        final int[] sum = {0};
        numbers.forEach(n -> sum[0] += n);

        System.out.println("\nSum of all numbers: " + sum[0]);
    }
}

