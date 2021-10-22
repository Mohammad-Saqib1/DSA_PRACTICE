import java.util.Scanner;

public class SortedArray_3 {
    public static void sortedArray(int[] arr){
        for (int i=0;i< arr.length;i++){
            for (int j=i+1;j< arr.length;j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static int[] takeInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Array :");
        int n=sc.nextInt();
        System.out.println("Enter Your Array Elements ");
        int[] arr =new int[n];
        for (int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
        return arr;
    }
    public static void printArray(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }


    public static void main(String[] args) {

       int[] arr=takeInput();
        System.out.println("Before Sorted");
        printArray(arr);
        System.out.println();
        System.out.println("After Sorted");
        sortedArray(arr);
        printArray(arr);

    }
}
