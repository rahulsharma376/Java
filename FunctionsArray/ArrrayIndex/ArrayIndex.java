import java.util.*;
public class ArrayIndex{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scn.nextInt();
        int numbers[] = new int[size];  //Declare and initialize an integer array with given size
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i<size; i++){
            numbers[i] = scn.nextInt();  //Input the elements of the array
        }

        System.out.println("The elements of the array are: ");
        int n = scn.nextInt();
        for(int i = 0; i<size; i++){
            if(numbers[i] == n){
                System.out.println("The element "+n+" is found at index "+i);
                break;
            }
        }
    }
}