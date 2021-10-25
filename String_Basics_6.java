public class String_Basics_6 {
    public static void main(String[] args) {
        System.out.println("String Basics");
        String str="Mohammad";
        String str1="Mohammad";
        String str2="MOHAMMAD";
        System.out.println(str.length());
        System.out.println(str.replace("m","M"));
        System.out.println(str.equals(str1));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.equalsIgnoreCase(str2));
        System.out.println(str.lastIndexOf("m"));
        System.out.println(str.indexOf("h"));
        System.out.println(str.lastIndexOf("m",4));
        System.out.println(str.charAt(5));
        System.out.println("And So On Functions");

    }
}
