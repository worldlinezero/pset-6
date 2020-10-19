package exercise.Exercise3;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner oddSum = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int initial = oddSum.nextInt();
        for (int i = 0; initial <= 0; i++) {
            System.out.print("Enter an integer: ");
            initial = oddSum.nextInt();
        }
        oddSum.close();
        String intConvert = String.valueOf(initial);
        int length = intConvert.length();
        int sum = 0;
        for (int i = 0; i < length; i++) {
            String convertSubstring = intConvert.substring(i, i+1);
            int digitConvert = Integer.parseInt(convertSubstring);
            if (digitConvert % 2 != 0) {
                sum += digitConvert;
            }
        }
        System.out.println("\n" + sum + ".");
    }
}