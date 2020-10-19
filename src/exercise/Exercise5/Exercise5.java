package exercise.Exercise5;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner primality = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = primality.nextInt();
        for (int i = 0; number <= 0; i++) {
            System.out.print("Enter an integer: ");
            number = primality.nextInt();
        }
        primality.close();
        int temp;
        boolean prime = true;
        for (int i = 2; i <= (number / 2); i++) {
            temp = number % i;
            if (temp == 0) {
                prime = false;
                break;
            }
        }
        if (prime) {
            System.out.println("\n" + "Prime.");
        }
        else {
            System.out.println("\n" + "Not Prime.");
        }
    }
}