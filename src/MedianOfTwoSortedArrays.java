/**
 * Created by UDAY on 12/6/2017.
 */
public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int leftArrSize = nums1.length;
        int rightArrSize = nums2.length;
        int mergedArrSize = leftArrSize+ rightArrSize;
        int[] mergedArray = new int[mergedArrSize];
        int i, j, k;
        i= j = k =0;
        while (i< leftArrSize && j < rightArrSize){
            if(nums1[i] <= nums2[j]){
                mergedArray[k] = nums1[i];
                i++;
                k++;
            }else{
                mergedArray[k] = nums2[j];
                j++;
                k++;
            }
        }
        while(i < leftArrSize){
            mergedArray[k] = nums1[i];
            i++;
            k++;
        }
        while(j < rightArrSize){
            mergedArray[k] = nums2[j];
            j++;
            k++;
        }
        int halfPosition = mergedArrSize/2;
        double median = (mergedArrSize) %2 == 0? (double)(mergedArray[halfPosition -1]+mergedArray[halfPosition])/2 : mergedArray[halfPosition];
        return median;
    }
}
