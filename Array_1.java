import java.util.Scanner;

public class Array_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Size of Array :");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter Your Array Elements ");
        for (int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Your Array Elements are: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
