package binarytodecimal;

/**
 *
 * @author Ahmed El-Torky
 */
import java.util.Scanner;

public class BinaryToDecimal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0, n;
        double temp, number;

        System.out.println("Please Enter the length of binary no. (n-bit):");
        n = input.nextInt();
        while (n <= 0) {
            System.out.println("Invalid Entry");
            n = input.nextInt();
        }

        System.out.println("Please Enter the binary no.:");
        number = input.nextDouble();
        temp = number;

        for (int i = n - 1; i >= 0; i--) {
            if ((int) (number / Math.pow(10, i)) == 1) {
                sum += (Math.pow(2, i));
                number -= (Math.pow(10, i));
                temp = number;
            } else {
                if ((temp -= (Math.pow(10, i))) > 0) {
                    number -= (Math.pow(10, i));
                } else {
                    temp = number;
                }
            }
        }
        System.out.println("------------------------------------------------");
        System.out.println("The decimal number equivalent to binary = " + sum);
    }
}
