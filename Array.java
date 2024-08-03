class Array {
    public static void main(String[] args) {
     System.out.println("Elements of array");
     int[] x={10,20,30,40};
     for(int i=0;i<x.length; i++)
     {
        System.out.println(x[i]);

     }
     System.out.println("\nReverse");
     for(int i=x.length-1; 0<=i; i--)
     {
        System.out.println(x[i]);
     }
      
    }
    
}
