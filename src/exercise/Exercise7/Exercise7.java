package exercise.Exercise7;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner factoring = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = factoring.nextInt();
        for (int i = 0; number <= 0; i++) {
            System.out.print("Enter an integer: ");
            number = factoring.nextInt();
        }
        factoring.close();
        StringBuilder delineation = new StringBuilder();
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0 && i <= number / i) {
                delineation.append(i).append(", ").append(number / i).append(", ");
            }
        }
        System.out.print("\n" + delineation.substring(0, delineation.length() - 2) + "." + "\n");
    }
}