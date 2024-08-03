
import java.util.Scanner;

class ArraySearchPoss {

    public static void main(String[] args) {
        System.out.println("Enter number of elements");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] ele = new int[n];
        System.out.println("Enter any " + n + " elements");
        for (int i = 0; i < ele.length; i++) {
            ele[i] = s.nextInt();
        }
        System.out.println("Enter Searching Element");
        int search = s.nextInt();
        boolean flag = false;
        for (int i = 0; i < ele.length; i++) {
            if (ele[i] == search) {
               int loc = i + 1;
                flag = true;
                System.out.println(search + " found at location = " + loc);
                break;
            }
        }
        if (flag==false) {
            System.out.println(search + " is not found in the given array");
        }
        
    }

}
