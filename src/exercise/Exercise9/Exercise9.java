package exercise.Exercise9;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner secondMarioMid = new Scanner(System.in);
        System.out.print("Height: ");
        int height = secondMarioMid.nextInt();
        for (int i = 0; height < 1 || height > 24; i++) {
            System.out.print("Height: ");
            height = secondMarioMid.nextInt();
        }
        secondMarioMid.close();
        String format = "%" + (height + 1) + "s";
        String secondFormat = "%" + ((height + 1) * - 1) + "s";
        StringBuilder octothorpe = new StringBuilder();
        System.out.print("\n");
        for (int j = 1; j <= height; j++) {
            octothorpe.append("#".repeat(Math.max(0, j + 1)));
            System.out.print(String.format(format, octothorpe) + "  " + String.format(secondFormat, octothorpe) + "\n");
            octothorpe.setLength(0);
        }
    }
}