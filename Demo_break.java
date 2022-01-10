public class Demo_break {
    public static void main(String[] args){
        int n=(10-1)+10;
        for (int i=0 ;i<=n;i++){
            if(i==11){
                continue;
        }
            if(i==16){
                break;
            }
            System.out.println(i);}
    }
}
