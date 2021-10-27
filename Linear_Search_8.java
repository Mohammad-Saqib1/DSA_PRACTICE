import java.util.Scanner;

public class Linear_Search_8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=takeInput();
        System.out.println("Enter your element which you want to search: ");
        int element=sc.nextInt();
        int index=lineraSearch(arr,element);
        System.out.println("Element Fount at index: "+index);
    }

    private static int lineraSearch(int[] arr, int element) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==element){
                return i;
            }
        }
        return -1;
    }



    private static int[] takeInput() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        int size=sc.nextInt();
        System.out.println("Enter Array Elements:");
        int[] arr=new int[size];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }
}
