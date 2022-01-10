public class DiamondPattern {
    public static void main(String[] args) {
        for(int i=0; i<5; i++){
            for(int j=4; j>i; j--) {
                System.out.print(" ");
            }
                for(int k=0; k<i;k++){
                    System.out.print(" *");
                }
                System.out.println();

        }
        int row = 4;
        for(int w=1; w<=row-1; w--){
            for(int s=1; s< w; s--) {
                System.out.print(" ");
            }
            for(int d=0; d<w-1;d++){
                System.out.print("*" + " ");
            }
            System.out.println();

        }
    }
}
