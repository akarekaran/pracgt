import java.util.Scanner;
class ArrayFrequency {
    public static void main(String[] args) {
        System.out.println("Enter number of element");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] x = new int[n];
        System.out.println("Enter any " + n + " elements");
        for (int i = 0; i < x.length; i++) {
            x[i] = s.nextInt();
        }
        System.out.println("Enter element for checking frequency");
        int ele = s.nextInt();
        int count = 0, val = 0;
        int[] pos=new int[n];
        int j=0;
        for (int i = 0; i < x.length; i++) {

            if (ele == x[i]) {
                count++;
                pos[j]=i;
                j++;
            } 
            else {
                val++;
            }

        }
        System.out.println("Frequency of " + ele + " is = " + count);
        int diff=n-j;
        System.out.print("Position = ");
        for(int i=0; i<pos.length-diff; i++)

        {
            System.out.print((pos[i]+1));
            if(i<j-1)
            {
                System.out.print(",");
            }
        }
        if (val == n) {
            System.out.println("Element not found in the array");
        }
      
    }
}