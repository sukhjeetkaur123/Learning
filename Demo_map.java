import java.util.HashMap;

public class Demo_map {
// duplicate value is not allowed.
//    map has key and value. value can be duplicated ;
//    if u have given duplicate value in key then value is replaced;
//    insertion oder not
//    duplicate is not allowed;
//    null keys is allowed once; but stored null as need of requirment;
//    secarhing is easy;use put method
    public static void main(String[] args){
        HashMap<Integer,String> t = new HashMap<Integer,String>();
        t.put(101,"sukhjeet");
        t.put(102,"metta");
        t.put(103,"dddddd");
        t.put(101,"sukh");
        t.put(105,"asdd");
        t.put(106,"sfdfg");
        System.out.println(t);
        System.out.println(t.get(103));
        System.out.println(t.remove(101));
        System.out.println(t);
        System.out.println(t.containsKey(105));
        System.out.println(t.containsKey(106));
        System.out.println(t.containsValue("sukhjeet"));
        System.out.println(t.containsValue("sukh"));
        System.out.println(t.isEmpty());
        System.out.println(t.keySet());
        System.out.println(t.values());
        for(int k:t.keySet()){
            System.out.println(k+"  "+t.get(k));
        }
    }

}
