import java.util.*;
public class MinimumAndMaximaElement {
    /**
     * InnerMinimumAndMaximaElement
     */
    public  static void InnerMinimumAndMaximaElement(int[] NewArr , int n)
        {
        System.out.println("Minimum = "+ NewArr[0]);
        System.out.println("MAximum = "+NewArr[n-1]);
          }

    public static void main(String[] args) {
        int[] arr = { 73, 45,62,71,90};
        Arrays.sort(arr);
        int n = arr.length;
        InnerMinimumAndMaximaElement(arr,n);
    }
}