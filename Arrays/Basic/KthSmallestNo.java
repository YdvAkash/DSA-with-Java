import java.util.Arrays;
import java.util.*;
public class KthSmallestNo {
    public static int[] SortArray(int[] NewArr){
         int n =  NewArr.length;
         int temp = 0;
        //  int[] sortedArr = new int[n];
         for(int i =0;i<n;i++){
            for(int j =i ;j<n-i-1;j++){
               if(NewArr[i]>NewArr[j]){
                temp = NewArr[i];
                NewArr[i] = NewArr[j];
                NewArr[j] =temp;
               }
            }
         }
        return NewArr;
    }
 
    public static int KthSmallestOfArray(int [] arr, int k) {

        return arr[k-1] ;
        
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {7, 10, 4, 3, 20,23 ,23,4,34,6,5,75,234};
        System.out.println(arr);
        int[] Answer = SortArray(arr);
        System.out.println(Arrays.toString(Answer));
        System.out.println("Enter a value of  k");
        int  k = sc.nextInt();
        int kthAnswer = KthSmallestOfArray(Answer,k);
        System.out.println("for Kth Smallest Number Of array = "+kthAnswer);
        
    }
}
