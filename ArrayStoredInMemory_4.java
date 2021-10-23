import java.util.Scanner;

/* When you pass number then value is not increase bcz when you any number ,
 method contains actual number but In array Case
when you pass array method contains array references ,
 that's why in array case array elements are changed */

public class ArrayStoredInMemory_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Number");
        int num=sc.nextInt();
        numberIncrease(num);
        System.out.println(num);
        int[] arr =takeInput();
        arrayElementIncrease(arr);
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void arrayElementIncrease(int[] arr) {
        for (int i=0;i<arr.length;i++){
            arr[i]++;
        }
    }

    public static void numberIncrease(int num){
        num++;
    }
    public static int[] takeInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Array Size ");
        int size=sc.nextInt();
        int [] arr=new int[size];
        System.out.println("Enter Your Array Elements");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        return  arr;
    }

}
