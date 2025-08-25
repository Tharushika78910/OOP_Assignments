import java.util.Random;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] firstnames = {"Alice", "Bob", "Clara", "David", "Ella", "Frank", "Grace", "Henry", "Ivy", "Jack"};
        String[] lastnames = {"Smith", "Johnson", "Brown", "Taylor", "Anderson", "Clark", "Lewis", "Walker", "Young", "King"};

        System.out.print("How many random names should I generate? ");
        int amount = input.nextInt();

        Random rand = new Random();

        for(int i = 0; i < amount; i++)
        {
            int first_index = rand.nextInt(firstnames.length);
            int last_index = rand.nextInt(lastnames.length);

            String name = firstnames[first_index] + " " + lastnames[last_index];

            System.out.println(name);
        }
    }
}
