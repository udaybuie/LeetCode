/**
 * Created by UDAY on 1/26/2018.
 *
 * Given array eg arr  = [1,2,3] return a list containing all possible permutation
 * with arr.length
 * [1,2,3], [1,3,2],[2,3,1],[2,1,3],[3,1,2],[3,2,1]
 */
public class GetAllPermutationOfSizeN {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4};
        int n= arr.length;
        for(int i =n; i> 0; i--){
            System.out.print("[");
            for(int j=0; j< arr.length; j++){
                System.out.print(arr[Math.abs(n-i+j)%n]+",");
            }
            System.out.print("]");
           /* System.out.println("["+
                    arr[Math.abs(n-i)%n]+","+
                    arr[Math.abs(n-i+1)%n]+","+
                    arr[Math.abs(n-i+2)%n]+","+
                    arr[Math.abs(n-i+3)%n]+"]"
            );*/
        }
        for(int i =0; i< n; i++){
            System.out.print("[");
            for(int j=1; j<= arr.length; j++){
                System.out.print(arr[Math.abs(n+i-j)%n]+",");
            }
            System.out.print("]");
          /*  System.out.println("["+
                    arr[Math.abs(n+i-1)%n]+","+
                    arr[Math.abs(n+i-2)%n]+","+
                    arr[Math.abs(n+i-3)%n]+","+
                    arr[Math.abs(n+i-4)%n]+"]"
            );*/
        }
    }
}
