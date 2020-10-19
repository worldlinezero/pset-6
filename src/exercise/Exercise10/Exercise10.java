package exercise.Exercise10;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner luhn = new Scanner(System.in);
        System.out.print("Enter credit card number: ");
        String cardNumber = luhn.nextLine();
        luhn.close();
        boolean valid = false;
        int sum = 0;
        for (int j = cardNumber.length()-2; j >= 0; j -= 2) {
            int val = 2 * Integer.parseInt(Character.toString(cardNumber.charAt(j)));
            int initial = val / 10;
            int secondary = val - initial * 10;
            int digitSum = initial + secondary;
            sum += digitSum;
        }
        for (int k = cardNumber.length() - 1; k >= 0; k -= 2) {
            sum += Integer.parseInt(Character.toString(cardNumber.charAt(k)));
        }
        String sumStr = Integer.toString(sum);
        if (Character.toString(sumStr.charAt(sumStr.length()-1)).equals("0")) {
            valid = true;
        }
        if (sum % 10 == 0) {
            if (cardNumber.length() == 15 && (cardNumber.startsWith("34") || cardNumber.startsWith("37")) && valid) {
                System.out.print("\n" + "American Express.");
            }
            else if (cardNumber.length() == 16 && (cardNumber.startsWith("51") || cardNumber.startsWith("52") || cardNumber.startsWith("53") || cardNumber.startsWith("54") || cardNumber.startsWith("55")) && valid) {
                System.out.print("\n" + "MasterCard.");
            }
            else if ((cardNumber.length() == 13 || cardNumber.length() == 16) && cardNumber.startsWith("4") && valid) {
                    System.out.print("\n" + "Visa.");
            }
            else if (!valid){
                System.out.print("\n" + "Invalid.");
            }
        }
        else {
            System.out.print("\n" + "Invalid.");
        }
    }
}