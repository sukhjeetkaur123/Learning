import java.util.Scanner;

public class Demo_ReverseString {
    public static void main(String [] args){
        String name;
        String rev="";
        System.out.println("enter the input:");
        Scanner s= new Scanner(System.in);
        name=s.nextLine();
        int length= name.length();
        for(int i=length-1; i>=0;i--){
            rev=rev+name.charAt(i);
        }
        if(name.equals(rev)){
            System.out.println("the string is palidrome");
        }
        else
        {
            System.out.println("the String is not palidrome");
        }
//        String original, reverse = ""; // Objects of String class
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter a string/number to check if it is a palindrome");
//        original = in.nextLine();
//        int length = original.length();
//        for ( int i = length - 1; i >= 0; i-- )
//            reverse = reverse + original.charAt(i);
//        if (original.equals(reverse))
//            System.out.println("Entered string/number is a palindrome.");
//        else
//            System.out.println("Entered string/number isn't a palindrome.");
    }
}
