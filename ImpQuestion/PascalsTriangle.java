package ImpQuestion;

import java.util.Scanner;

public class PascalsTriangle {

    public PascalsTriangle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of Rows: ");
        int row = sc.nextInt();
        int[][] arr = new int[row][row];

        // Construct Pascal's Triangle
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    arr[i][j] = 1;  // First and last values in every row are 1
                } else {
                    arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];  // Sum of two values above
                }
            }
        }

        // Print Pascal's Triangle
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
        sc.close();
    }

    public static void main(String[] args) {
        new PascalsTriangle();  // Create object to run the constructor logic
    }
}
