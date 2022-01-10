public class Demo_callbyvalue {

        int data=20;
        int i=5;
        void getValue(int i){
            i=i+2;
        }
        void display(Demo_callbyvalue op){
            op.data=op.data+100;
        }
    public static void main(String[] args){
            Demo_callbyvalue op = new Demo_callbyvalue();
            System.out.println("before chnage:"+op.data);
            op.display(op);
            System.out.println("after the chnage:"+op.data);
            System.out.println("before change of 2nd variable :"+op.i);
            op.getValue(12);
            System.out.println("after the chnge the 2nd value :"+op.i);
    }
}
//In case of call by reference original value is changed if we made changes in the called method.
// If we pass object in place of any primitive value, original value will be changed.



//There is only call by value in java, not call by reference. If we call a method passing a value, it is known as call by value.
// The changes being done in the called method, is not affected in the calling method.