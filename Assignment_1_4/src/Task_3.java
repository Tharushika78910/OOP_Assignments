import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        System.out.print("How many numbers do you want in the list? ");

        Scanner input = new Scanner(System.in);
        int amount = input.nextInt();

        int[] num_list = new int[amount];

        for (int i=0;i<amount;i++)
        {
            System.out.print("Enter an integer ");
            num_list[i] = input.nextInt();
        }

        int[] new_array = new int[amount];
        new_array[0] = num_list[0];
        int count = 0;

        for (int i=0;i<amount;i++)
        {
            boolean is_exist = false;
            for (int j=0; j<count; j++)
            {
                if (new_array[j]==num_list[i])
                {
                    is_exist = true;
                    break;
                }
            }
            if (!is_exist)
            {
                new_array[count] = num_list[i];
                count++;
            }
        }
        for (int i=0; i<count; i++)
        {
            System.out.println(new_array[i]);
        }
    }
}
