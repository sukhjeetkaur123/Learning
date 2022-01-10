import java.util.Scanner;

public class Demo_palindrome {
    public static void main(String[] rgs) {
      int sum = 0;
      int r;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the value");
        int n= s.nextInt();
        int temp = n;
        while (n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
   if(temp==n){
       System.out.print("the number is palidrome");
   }
   else{
       System.out.println("the number is not palidrome");
   }

    }

}
