// import  Arrays;

import java.util.Arrays;
// import java.util.Scanner;

public class Sort_0s_1s_and_2s {
    
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

       public static void main(String[] args ){
        //    Scanner sc = new Scanner(System.in);
           int[] arr = {0,0,0,1,1,1,1,1,2,2,2,0};
           System.out.println(Arrays.toString(arr));
        int[] Answer = SortArray(arr);
        System.out.println(Arrays.toString(Answer));
    }
    
}