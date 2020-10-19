package exercise.Exercise2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner reversal = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int initial = reversal.nextInt();
        int reverse = 0;
        for (int i = 0; initial <= 0; i++) {
            System.out.print("Enter an integer: ");
            initial = reversal.nextInt();
        }
        reversal.close();
        while (initial != 0) {
            int digit = initial % 10;
            reverse = reverse * 10 + digit;
            initial /= 10;
        }
        String preSplit = String.valueOf(reverse);
        String[] postSplit = preSplit.split("(?<=.)");
        String bracketless = Arrays.toString(postSplit).replace("[", "").replace("]", "");
        System.out.println("\n" + bracketless + ".");
    }
}
