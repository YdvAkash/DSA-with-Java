import java.util.Scanner;
import java.util.Arrays;
public class linearSearchInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,3,4,5,6,7,8,9};
        int target = sc.nextInt();
        int Answer = linerSearch(arr, target);
        System.out.println("Element Found at "+Answer);

    }
    static int linerSearch(int[] arr, int target ){
        if(arr.length == 0){
            return -1;
        }
          for(int i=0 ;i<arr.length;i++){
             int element = arr[i];
             if(element == target){
                return i;
             }
          }
          return -1;
    }
}
