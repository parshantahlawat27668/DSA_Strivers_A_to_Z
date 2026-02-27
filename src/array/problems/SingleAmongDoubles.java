package array.problems;

public class SingleAmongDoubles {
    static int basicApproach (int[] arr){
        int left = 1, right = arr.length-2;
        if(arr.length == 1) return  arr[0];
        if(arr[0] != arr[1]) return arr[0];
        if(arr[arr.length-1] != arr[arr.length-2]) return arr[arr.length-1];
        while(left<=right){
            int mid = left + (right-left)/2;
            if(arr[mid] != arr[mid-1] && arr[mid] != arr[mid+1]) return arr[mid];
            else if(arr[mid] == arr[mid-1] && mid % 2 ==1)
            {
                left = mid+1;
            }
            else if(arr[mid] == arr[mid+1] && mid % 2 ==0) left = mid + 1;
            else right = mid - 1;
        }
        return  -1;
    }
    static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,9,9};
        System.out.println(basicApproach(arr));
    }
}
