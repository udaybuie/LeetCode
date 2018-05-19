package com.practice.matrix;

import java.util.Arrays;

/**
 * Created by UDAY on 5/9/2018.
 *
 * You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.
 *
 * Given input matrix =
 [
 [1,2,3],
 [4,5,6],
 [7,8,9]
 ],

 rotate the input matrix in-place such that it becomes:
 [
 [7,4,1],
 [8,5,2],
 [9,6,3]
 ]
 */
public class MatrixRotation {

        private static void rotate(int[][] matrix) {
            int lenghtOfArray= matrix.length;
            int n = lenghtOfArray-1;
            int numberOfIteration = lenghtOfArray/2;
            for(int i=0;i< numberOfIteration; i++){
                for(int j=i; j< n- i; j++ ){
                    matrix[i][j] = matrix[i][j] + matrix[j][n-i];
                    matrix[j][n-i] = matrix[i][j] - matrix[j][n-i];
                    matrix[i][j] = matrix[i][j] - matrix[j][n-i];

                    matrix[n-j][i] = matrix[n-j][i] + matrix[i][j];
                    matrix[i][j] = matrix[n-j][i] - matrix[i][j];
                    matrix[n-j][i] = matrix[n-j][i] - matrix[i][j];

                    matrix[n-i][n-j] = matrix[n-i][n-j] + matrix[n-j][i];
                    matrix[n-j][i] = matrix[n-i][n-j] - matrix[n-j][i];
                    matrix[n-i][n-j] = matrix[n-i][n-j] - matrix[n-j][i];
                }
            }
        }

    public static void main(String[] args) {
        int arr[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        rotate(arr);
        for(int i=0; i < arr.length; i++){
            for(int j=0; j< arr.length; j++){
                System.out.print("  "+arr[i][j]);
            }
            System.out.println();
        }
    }

}
