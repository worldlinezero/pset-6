package exercise.Exercise4;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner intAvg = new Scanner(System.in);
        int length = 0;
        int[] inputArray = new int [0];
        boolean valid = true;
        while (valid) {
            System.out.print("Enter an integer: ");
            int initial = intAvg.nextInt();
            if (initial > 0 && length <= 0) {
                length++;
                inputArray = new int[length];
                inputArray[0] = initial;
            }
            else if (initial > 0 && length > 0) {
                int[] temp = new int[length];
                for (int i = 0; i < length; i++) {
                    System.arraycopy(inputArray, 0, temp, 0, length);
                }
                length++;
                inputArray = new int[length];
                inputArray[0] = initial;
                for(int i = 1; i < length; i++) {
                    System.arraycopy(temp, 0, inputArray, 1, length - 1);
                }
            }
            else if (initial <= -1) {
                valid = false;
            }
        }
        int sum = 0;
        for(int i = 0; i < length; i++){
            sum += inputArray[i];
        }
        if (length == 0) {
            System.out.println("\n" + "Error: division by zero.");
        }
        else {
            double avg = (double) (sum) / length;
            System.out.printf("%,.2f%n", avg);
            System.out.print("\n");
        }
    }
}