package exercise.Exercise6;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner fibonacci = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = fibonacci.nextInt();
        for (int i = 0; number <= 0 || number > 92; i++) {
            System.out.print("Enter an integer: ");
            number = fibonacci.nextInt();
        }
        fibonacci.close();
        int length = number;
        long[] inputArray = new long[length];
        for (int i = 0; i < length; i++) {
            if (i - 1 >= 0 && i - 2 >= 0) {
                inputArray[i] = (inputArray[i - 2] + inputArray[ i - 1]);
            }
            else if (i == 0) {
                inputArray[i] = 0;
            }
            else if (i == 1) {
                inputArray[i] = 1;
            }
        }
        System.out.printf("%,d", inputArray[number - 1]);
        System.out.print(".");
    }
}