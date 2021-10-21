import java.util.Scanner;

public class min_and_max_array_2 {
    public static int[] takeInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Array Size ");
        int size=sc.nextInt();
        System.out.println("Enter Your Array Elements ");
        int [] arr=new int[size];
        for (int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static void printArray(int[] arr){
        System.out.println("Your Array Elements Are: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
    public static int maxElement(int[] arr){
        int max=Integer.MIN_VALUE;
        for (int j : arr) {
            if (max < j) {
                max = j;
            }
        }
        return max;
}
    public static int minElement(int[] arr){
        int min=Integer.MAX_VALUE;
        for (int j : arr) {
            if (min > j) {
                min= j;
            }
        }
        return min;
    }
    public static void main(String[] args) {
       int[] arr=takeInput();
       printArray(arr);
       int largestValue=maxElement(arr);
        System.out.println();
        System.out.println("The Largest Element Of Array Is: "+largestValue);
        int minValue=minElement(arr);
        System.out.println("The Minimum Element Of Array Is: "+minValue);





}
}
