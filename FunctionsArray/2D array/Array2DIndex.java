import java.util.*;
public class Array2DIndex{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int r = scn.nextInt();
        System.out.println("Enter the number of columns:");
        int c = scn.nextInt();
        int arr[][] = new int[r][c];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i<r; i++){
            for(int j = 0; j<c ; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        System.out.println("Enter the item you want to search: ");
        int search = scn.nextInt();
        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                if(arr[i][j] == search){
                    System.out.println("The element "+search+" is found at index "+i+" "+j);
                    break;
                }
            }
        }
    }
}