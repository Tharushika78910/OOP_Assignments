import java.util.Scanner;

public class Task_2
{
    public static void main(String[] args)
    {
        System.out.print("How many numbers do you want in the list? ");

        Scanner input = new Scanner(System.in);
        int amount = input.nextInt();

        int[] num_list = new int[amount];
        int max = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;

        for (int i=0;i<amount;i++)
        {
            System.out.print("Enter an integer ");
            num_list[i] = input.nextInt();
        }

        for (int x=0; x<amount; x++)
        {
            int curr_sum = 0;
            for (int y=x; y<amount;y++)
            {
                curr_sum += num_list[y];

                if  (curr_sum > max)
                {
                    max = curr_sum;
                    start = x;
                    end = y;
                }
            }
        }

        System.out.println("The maximum sum is "+max);
        System.out.println("Integers from "+ (start + 1) + " to " + (end + 1));

    }
}
