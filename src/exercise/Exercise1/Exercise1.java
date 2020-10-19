package exercise.Exercise1;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner bounds = new Scanner(System.in);
        System.out.print("Lower bound: ");
        int lower = bounds.nextInt();
        System.out.print("Upper bound: ");
        int upper = bounds.nextInt();
        for (int i = 0; upper < lower; i++) {
            System.out.print("Upper bound: ");
            upper = bounds.nextInt();
        }
        bounds.close();
        int sum = 0;
        for (int i = lower; i <= upper; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println();
        System.out.printf("%,d", sum);
        System.out.print(".");
    }
}


