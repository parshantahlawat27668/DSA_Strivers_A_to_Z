package array.problems;

public class PeakIndexInMountainArray {
    public static int basicApproach(int[] arr){
        int i = 1;
        while(arr[i]>arr[i-1]){
            if( arr[i] > arr[i+1]) return i;
            i++;
        }
        return -1;
    }
    public static int withBinarySearch(int[] arr){
        int left =1, right = arr.length-2, findex  = -1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]> arr[mid+1]) return mid;
            else if(arr[mid]>arr[mid-1]) left = mid + 1;
            else right = mid -1;
        }
        return findex;
    }
    static void main(String[] args) {
        int[] arr = {1,3,5,6,5,3,2,1};
        System.out.println(withBinarySearch(arr));
    }
}
