import java.util.*;
public class factorial{
    public static int factor(int n){
        int f =1;
        for(int i=1; i<=n; i++){
            f = f*i;
        }
        return f;
    }
    
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = scn.nextInt();
        factor(n);
        System.out.print("the factorial is "+factor(n));
    }
}