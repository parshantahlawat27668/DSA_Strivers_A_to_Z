package array;

public class SelectionSort {
    public static  void print(int[] arr ){
        int length = arr.length;
        for(int i=0; i<length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void basicSort(int[] arr){
        int length = arr.length;

        for(int i=0; i<length-1; i++){
            int min = Integer.MAX_VALUE;
            int mindex = -1;
            for(int j=i; j<length; j++){
                if(arr[j]<min){
                    min = arr[j];
                    mindex = j;
                }
            }
            int temp = arr[i];
            arr[i] =  arr[mindex];
            arr[mindex] = temp;
        }
    }
    static void main(String[] args) {
        int[] arr = {5,7,3,25,7,8,3,1,0,34,2,-3,34,-34, -3, -6,6};

        print(arr);
        System.out.println();
        basicSort(arr);
        System.out.println();
        System.out.println("after");
        print(arr);
    }
}
