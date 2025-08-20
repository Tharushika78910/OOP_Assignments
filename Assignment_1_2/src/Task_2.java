import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args)
    {
        Scanner user_input = new Scanner(System.in);

        System.out.print("Enter the length 1 of the triangle: ");
        double length1 = user_input.nextInt();
        System.out.print("Enter the length 2 of the triangle: ");
        double length2 = user_input.nextInt();

        double hypotenuse = Math.sqrt(length1*length1 + length2*length2);
        System.out.printf("The length of the hypotenuse is: %.4f", hypotenuse);
    }
}
