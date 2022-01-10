public class Demo_AddTwoMatrix {
    public static void main(String[] args){
        int a[][]={{2,2,2},{1,1,1},{3,3,3}};
        int b[][]={{4,4,4},{1,1,2},{3,3,3}};
        int c[][] = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
//
                System.out.print(a[i][j]+" ");
                System.out.print(b[i][j]+" ");
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");

            }
            System.out.println();
        }
    }
}
