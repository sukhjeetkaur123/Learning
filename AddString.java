public class AddString {
    public static void main(String []args){
        AddString s1 = new AddString();
        s1.start();}
        void start(){
        String s1 ="sukh";
        String s2= fix(s1);
        System.out.println(s1 + " " +s2);
        }
        String fix(String s1){
        s1 = s1 + "kaur";
        System.out.println(s1 + " ");
        return "kaur";
    }
}
