package array.search;

public class BinarySearch {
    public static boolean basicApproach(int[] arr, int target){
        int left = 0, right = arr.length-1;

        while(left<=right){
            int mid = (left + right) / 2;
            if(arr[mid] == target) return true;
            else if(target > arr[mid]) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }
    public static int firstOccurrences(int[] arr, int target) {
        int left = 0, right=arr.length-1, findex = -1;

        while(left<=right){
            int mid = left + (right - left) /2;
            if(arr[mid] == target){
                findex = mid;
                right = mid-1;
            }
            else if(target > arr[mid]){
                left = mid + 1;
            }
            else{
                right = mid -1;
            }
        }

        return findex;
    }
    public static void allTargetIndex(int[] arr, int target){
        int left = 0, right = arr.length-1, from = -1, to = -1;

        while(left<=right){
            int mid = left + (right - left) /2;
            if(arr[mid] == target){
                from = mid;
                right = mid-1;
            }
            else if(target > arr[mid]){
                left = mid + 1;
            }
            else{
                right = mid -1;
            }
        }
        left = 0;
        right = arr.length-1;
        while(left<=right){
            int mid = left + (right - left) /2;
            if(arr[mid] == target){
                to = mid;
                left = mid+1;
            }
            else if(target > arr[mid]){
                left = mid + 1;
            }
            else{
                right = mid -1;
            }
        }

        System.out.println("from " + from  + " to " + to);
    }
    public static int firstOccurrencesFromDecArray(int[] arr,  int target){
        int left = 0, right = arr.length-1, findex = -1;
        while(left<=right){
            int mid = left + (right - left) /2;
            if(arr[mid] == target){
                findex = mid;
                left = mid+1;
            }
            else if(target > arr[mid]){
                right = mid - 1;
            }
            else{
                left = mid  + 1;
            }
        }

        return findex;
    }
    static void main(String[] args) {
//        int[] arr = {0,2,2,2,2,2,3,3,3,3,4,5,5,5,5,5,7,7,7,8,9,13,13,13,35,65};
        int[] arr = {99,99,99,88,88,88,77,77,77,77,77,9,8,7,4,4,4,3,3};

        int  target = 3;
        int result = firstOccurrencesFromDecArray(arr, target);
        System.out.println("Target found at " + result);
//         allTargetIndex(arr, target);
    }
}
