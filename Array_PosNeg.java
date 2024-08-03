
import java.util.Scanner;

public class Array_PosNeg {

    public static void main(String[] args) {
        int[] x = new int[10];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any 10 numbers");

        for (int i = 0; i < x.length; i++) {
            x[i] = s.nextInt();
        }
        System.out.println("Positive");
        for (int i = 0; i < x.length; i++) {
            if (x[i] > 0) {
                System.out.print(x[i] + "\t");
            }
        }
        System.out.println("\nNegative");
        for (int i = 0; i < x.length; i++) {
            if (x[i] < 0) {
                System.out.print(x[i] + "\t");
            }
        }

    }

}
