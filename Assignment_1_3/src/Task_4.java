import java.util.Scanner;
import java.util.Random;

public class Task_4 {
    public static void main(String[] args) {
        System.out.println("Answer all the multiplication problems below.");

        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int score;

        do
        {
            score = 0;

            for (int i = 0; i<10;i++)
            {
                int num1 = rand.nextInt(10) + 1;
                int num2 = rand.nextInt(10) + 1;

                System.out.print(num1 + "x" + num2 + " = ");

                int result = input.nextInt();

                if (result == (num1 * num2))
                {
                    score = score + 1;
                    System.out.println("Correct!");
                }
                else {
                    System.out.println("Wrong!");
                }

            }

            if(score == 10)
            {
                System.out.println("Congratulations!");
            }
            else{
                System.out.println("Do this again!");
            }
        } while (score < 10);


    }
}
