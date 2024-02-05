public class Invert_half_180_degree{
    public static void main(String args[]){
        int i, j, n = 5;
        for(i = 1; i<= n; i++){
            for(j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(j = n; j>n-i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}