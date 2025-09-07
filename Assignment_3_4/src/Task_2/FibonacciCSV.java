package Task_2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FibonacciCSV {
    private static final int COUNT = 60;
    private static final String FILENAME = "fibonacci.csv";

    public static void main(String[] args) {
        long[] fibonacci = new long[COUNT];

        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int i = 2; i < COUNT; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME))) {
            writer.write("Index;Fibonacci"); // header row
            writer.newLine();

            for (int i = 0; i < COUNT; i++) {
                writer.write(i + ";" + fibonacci[i]); // index and value
                writer.newLine();
            }

            System.out.println("Fibonacci sequence written to " + FILENAME);
        } catch (IOException e) {
            System.err.println("Error writing file: " + e.getMessage());
        }
    }
}
