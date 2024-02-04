public class Hollow_rectangle{
    public static void main(String args[]){
        int n = 4, m = 5;
        //Outer Loop
        for (int i = 1; i<= n; i++){
            for (int j = 1; j<= m; j++){
                //Condition for the first and last row, and first and last column
                if (i == 1 || i == n || j == 1 || j == m){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}