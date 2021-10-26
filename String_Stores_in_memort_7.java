import java.util.Arrays;
/*
* In String Case Actual Value or Address Checked that's why str and str1 is equal,
*  But in array case address checked
* that's why arr and arr1 is not equal but arr and arr2 is equal,But if you use Array.equals() then array's checked
* actual value or address that's why arr and arr1 is equal,also arr and arr2 is equal
* by using Array.equals()
* */

public class String_Stores_in_memort_7 {
    public static void main(String[] args) {
        System.out.println("String Stored in Memory");
        String str="abcdef";
        String str1="abcdef";
        String str2=str;

        System.out.println("Str and Str1 by using equals() "+str.equals(str1));
        System.out.println("Str and Str2 by using equals() "+str.equals(str2));

       //If you want to insert something
        System.out.println("Normal Str "+str);
        String prev=str.substring(0,4);
        String next=str.substring(5);
        str=prev+"z"+next;
        System.out.println("Changing Str "+str);


        String[] arr={"A","B","C"};
        String[] arr1={"A","B","C"};
        String[] arr2=arr;
        System.out.println("arr and arr1 by using equals() "+arr.equals(arr1));
        System.out.println("arr and arr2 by using equals() "+arr.equals(arr2));


        System.out.println("arr and arr2 by using Arrays.equals() "+Arrays.equals(arr, arr2));
        System.out.println("arr and arr2 by using Arrays.equals() "+Arrays.equals(arr, arr1));

    }
}
