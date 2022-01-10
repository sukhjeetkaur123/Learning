public class Calculator {
//    public static void main(String[] args) {
         int c;
       static int a = 4;
        static int b = 3;
        void sum() {
            String name = "sukhjeet";
            System.out.println("sum operation performed by :" + name);
            System.out.println(a + b);
        }
        void sub() {
            String name = "abd";
            System.out.println("sub operation by:" + name);
            System.out.println(a - b);
        }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.sum();
        c.sub();
     System.out.println("a=" + a + "b=" +b);
       System.out.println("aaaa" +a);
        System.out.println("vvvvv" +c);


    }
}