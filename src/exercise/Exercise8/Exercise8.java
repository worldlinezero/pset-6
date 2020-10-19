package exercise.Exercise8;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner marioMid = new Scanner(System.in);
        System.out.print("Height: ");
        int height = marioMid.nextInt();
        for (int i = 0; height < 1 || height > 24; i++) {
            System.out.print("Height: ");
            height = marioMid.nextInt();
        }
        marioMid.close();
        String format = "%" + (height + 1) + "s";
        StringBuilder octothorpe = new StringBuilder();
        System.out.print("\n");
        for (int i = 1; i <= height; i++) {
            octothorpe.append("#".repeat(Math.max(0, i + 1)));
            System.out.print(String.format(format, octothorpe) + "\n");
            octothorpe.setLength(0);
        }
    }
}