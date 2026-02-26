package array.problems;

public class FloorInSortedArray {
    static int basicApproach(int[] arr, int x){
        int left = 0,right = arr.length-1, findex = -1;
        while(left<=right){
            int mid = left + (right - left)/2;
            if(arr[mid] == x || arr[mid]<x){
                findex = mid;
                left = mid + 1;
            }
            else {
                right = mid -1;
            }
        }
        return findex;
    }
    static void main(String[] args) {
        int[] arr = {1,2,2,2,2, 4,4,5,5,5,7,8,8,};
        System.out.println(basicApproach(arr,6));
    }
}
