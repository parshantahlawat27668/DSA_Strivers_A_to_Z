package array;

public class BubbleSort {
    public static  void print(int[] arr ){
        int length = arr.length;
        for(int i=0; i<length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void basicSort(int[] arr){
        int length = arr.length;
        for(int j=0; j<length-1; j++) {
            for (int i = 0; i < length - 1; i++) {
                int temp;
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    public static  void enhancedSort(int[] arr){
        int length = arr.length;
        int temp;
        for(int i=0; i<length-1; i++){
            boolean sorted = true;
            for(int j=0; j<length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    sorted = false;
                }
            }
            if(sorted) break;
        }
    }


    static void main(String[] args) {
     int[] arr = {5,7,3,25,7,8,3,1,0,34,2,-3,34,-34, -3, -6,6};
     print(arr);
     enhancedSort(arr);
        System.out.println("\n After sort");
     print(arr);

    }
}


//Algorithm

//Best case: O(n);
//Worst case: O(n^2);
