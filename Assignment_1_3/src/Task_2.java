import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args){

        System.out.print("Enter a binary number (use only 0s and 1s) : ");
        Scanner input = new Scanner(System.in);
        String value = input.nextLine();

        int decimal = 0;

        for (int i = 0; i<=value.length()-1; i++){

            int current_bit = value.charAt(i);
            int curr = Character.getNumericValue(current_bit);

            decimal = decimal * 2 + curr;

        }
        System.out.println(decimal);
    }
}
