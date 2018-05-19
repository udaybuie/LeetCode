package com.practice.matrix;

/**
 * Created by UDAY on 5/19/2018.
 *
 * * You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.
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
public class MatrixRotationByTranspose {

    private static void reverseColumnWise(int arr[][]){
        for(int j=0; j< arr.length; j++){
            for(int i=0; i< arr.length/2 ; i++){
                arr[i][j] = arr[i][j]+arr[arr.length-1 -i][j];
                arr[arr.length-1 -i][j] = arr[i][j] - arr[arr.length-1 -i][j];
                arr[i][j] = arr[i][j] - arr[arr.length-1 -i][j];
            }
        }
    }

    private static void transpose(int arr[][]){
        int n= arr.length-1;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i ;j++){
                arr[i][j] = arr[i][j]+ arr[n-j][n-i];
                arr[n-j][n-i] = arr[i][j] - arr[n-j][n-i];
                arr[i][j] = arr[i][j] - arr[n-j][n-i];
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
        reverseByTranspose(arr);
        for(int i=0; i < arr.length; i++){
            for(int j=0; j< arr.length; j++){
                System.out.print("  "+arr[i][j]);
            }
            System.out.println();
        }
    }

    private static void reverseByTranspose(int[][] arr) {
        transpose(arr);
        reverseColumnWise(arr);
    }
}
