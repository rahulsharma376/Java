import java.util.*;
public class TwoNumber{
    public static int sums(int a, int b){
        int sum = a+b;
        return sum;
    }

    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = scn.nextInt();
        System.out.println("Enter the second number:");
        int b = scn.nextInt();
        int sum1 = sums(a, b);
        System.out.println("The sum of "+a+" and "+b+" is :"+sum1);
        System.out.println(sum1);
    }
}