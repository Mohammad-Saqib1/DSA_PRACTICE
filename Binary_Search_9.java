import java.util.Scanner;

//Binary Search implements only sorted Array
public class Binary_Search_9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=takeInput();
        sortedArray(arr);
        System.out.println("Enter Your Element which you want to Search: ");
        int element=sc.nextInt();
        System.out.println(" Array After Sort: ");
        printArray(arr);
        int index=binarySearch(arr,element);
        System.out.println("Element Fount At Index: "+index);

    }

    private static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    private static int binarySearch(int[] arr, int element) {
        int start=0;
        int end= arr.length-1;

        while (start<=end){
            int mid=(start+end)/2;
            if(element==arr[mid]){
                return mid;
            }else if(element>arr[mid]){
                start=mid+1;
            }else if(element<arr[mid]){
                end=mid-1;
            }
        }
        return -1;
    }

    private static void sortedArray(int[] arr) {
        for (int i=0;i< arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    private static int[] takeInput() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array Size: ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter Your Array Elements: ");

        for (int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }
}
