package array.problems;

public class KthSmallest {
    public static int basicApproach(int[] arr,int k){
        for(int i=0; i<k; i++){
            int min = Integer.MAX_VALUE;
            int mindex = -1;
            for(int j=i; j<arr.length; j++){
                if(arr[j]<min){
                    min = arr[j];
                    mindex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mindex];
            arr[mindex] = temp;
        }
        return arr[k-1];
    }
    public static void print(int[] arr){
        for(int elem : arr){
            System.out.print(" " + elem + " ");
        }
    }
    static void main(String[] args) {
        int[]  arr = {4,6,3,3,56,7,2,34,};
        print(arr);
        int result = basicApproach(arr, 3);

        System.out.println("\n kth smallest element is : "  +  result);

    }
}
