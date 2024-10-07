import java.util.Scanner;
import java.util.Arrays;
public class LinearSearch{
    public static void main (String[] args ){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the Size of array : ");
        int n = sc.nextInt();
        int[] arr = InputArray(n);
        System.out.println(Arrays.toString(arr));
        System.out.print("\n Enter the element to search : ");
        int k = sc.nextInt();
        int Answer = linearSearch(arr,k);
        System.out.println("Element found at  index no : " + Answer);
        
    }

    static int linearSearch(int[] arr,int key){
        for(int i =0; i<arr.length ; i++){
            if(arr[i]== key){
                return i;
            }
        }
        return -1;

    }
    
    static int[] InputArray(int n){
        Scanner sc = new Scanner(System.in);
        int[] inputArr = new int[n];
        for(int i=0;i<inputArr.length;i++){
             inputArr[i] = sc.nextInt();
            }
        return inputArr;
    }
}