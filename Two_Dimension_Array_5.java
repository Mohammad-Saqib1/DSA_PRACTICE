import java.util.Scanner;

public class Two_Dimension_Array_5 {
    public static void main(String[] args) {
        int [][] arr=takeInput();
        System.out.println("Your Array Elements Are: ");
        printArray(arr);
    }


    private static int[][] takeInput() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Row Size");
        int row=sc.nextInt();
        System.out.println("Enter Your Column Size");
        int col=sc.nextInt();
        int [][] arr=new int[row][col];
        System.out.println("Enter Your Array Elements:");
        for (int i=0;i<row;i++){
            for (int j=0;j< col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        return arr;
    }

    private static void printArray(int[][] arr) {
        for(int i=0;i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
