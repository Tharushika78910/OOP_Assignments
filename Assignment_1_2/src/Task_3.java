import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the weight in grams: ");
        double w = input.nextInt();

        double le = Math.floor(w/(13.28*32*20));
        double na = Math.floor((w/(13.28*32*20)-le)*20);
        double lu = (((w/(13.28*32*20)-le)*20)-na)*32;

        System.out.printf("%.0f grams is %.0f leiviska, %.0f naula, and %.2f luoti.", w, le, na, lu);


    }
}
