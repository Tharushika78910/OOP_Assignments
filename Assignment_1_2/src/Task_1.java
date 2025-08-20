import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args)
    {
        Scanner user_input = new Scanner(System.in);

        System.out.print("Enter the temperature in Celsius: ");
        double temp_Cel = user_input.nextInt();

        double temp_Fah = (temp_Cel * 9/5) + 32;

        System.out.printf("The temperature in Fahrenheit is %.1f\n", temp_Fah);

    }
}
