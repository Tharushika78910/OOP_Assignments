import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args)
    {
        System.out.println("Enter the coefficients of the equation below.");

        System.out.print("a : ");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();

        System.out.print("b : ");
        double b = input.nextDouble();

        System.out.print("c : ");
        double c = input.nextDouble();

        double d = b*b - 4*a*c;

        if (a==0)
        {
            double r1 = -c/b;
            System.out.printf("This is a linear equation, the root is %.2f.", r1);
        }
        else
        {
            if (d>0)
            {
                double x1 = (-b+Math.sqrt(d))/(2*a);
                double x2 = (-b-Math.sqrt(d))/(2*a);

                System.out.printf("The two distinct real roots are %.2f and %.2f.", x1, x2);
            }
            else if (d==0)
            {
                double x3 = -b/(2*a);
                System.out.printf("There is only one real root which is %.2f.", x3);
            }
            else
            {
                System.out.println("There are no real roots.");
            }
        }
    }
}
