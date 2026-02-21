package array;

public class TwoSum {
    static void main(String[] args) {
        int[] arr = {3,6,3,5,8,9,6,5,4,3,5,12,45,7,3,23,56,33};
        int sum = 14;
        int length = arr.length;
        for(int i=0; i<length-1; i++ ){
            for(int j=i+1; j<length-1; j++){
                if(arr[i]+arr[j] == sum ){
                    System.out.println("sum of index: " + i + " and " + j + " = " + sum);
                }
            }
        }
    }
}
