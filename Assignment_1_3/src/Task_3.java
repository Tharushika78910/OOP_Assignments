import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {

        System.out.println("Enter two positive integers below to find prime numbers between them (smallest first). ");

        System.out.print("Enter first integer: ");
        Scanner input = new Scanner(System.in);
        int first = input.nextInt();

        System.out.print("Enter second integer: ");
        int second = input.nextInt();

        if (first > second)
        {
            System.out.println("Enter the lesser value first.");
        }
        else
        {
            for  (int i=first; i<=second; i++)
            {
                if (i>1)
                {
                    boolean isPrime = true;

                    for (int j=2; j<=Math.sqrt(i); j++)
                    {
                        if (i%j==0)
                        {
                            isPrime = false;
                            break;
                        }
                    }
                    if(isPrime)
                    {
                        System.out.println(i);
                    }
                }
            }
        }
    }
}
