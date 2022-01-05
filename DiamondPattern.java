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
        for(int w=5; w<0; w--){
            for(int s=1; s>w; s--) {
                System.out.print(" ");
            }
            for(int d=0; d<w;d++){
                System.out.print(" *");
            }
            System.out.println();

        }
    }
}
