import java.util.Scanner;

public class Demo_Switch_Statements {
    public static void main(String[] args){
        String yn;
        do {
            Scanner s = new Scanner(System.in);
            System.out.println("enter the first choice");
            int no1 = s.nextInt();
            System.out.println("enter the second choice");
            int no2 = s.nextInt();
            System.out.println("enter the operator choice(+,-,*)");

//      int res;
            String sym = s.next();
            int res;
            switch (sym) {
                case "+":
                    res = no1 + no2;
                    System.out.println(res);
                    break;

                case "-":
                    res = no1 - no2;
                    System.out.println(res);
                    break;
                case "*":
                    res = no1 * no2;
                    System.out.println(res);
                    break;
                default:
                    System.out.println("invalid input");
            }
            System.out.println("do you want to continue pres y for Yes and n for No");
            yn=s.next();
        }while (yn.equals("y") || yn.equals("Y"));


    }
}
