package array;

public class InsertionSort {
    public static void print(int[] arr){
        for(int elem:arr){
            System.out.print(" " + elem + " ");
        }
    }

    public static void basicApproach(int[] arr){
        int pointer = 1;
        int i=1;
        while(i<arr.length){
            if(arr[i]>arr[i-1]){i++; pointer++;}
            else {
                while (i > 0) {
                    if(arr[i]<arr[i-1]){
                   int temp = arr[i-1];
                   arr[i-1] = arr[i];
                   arr[i] = temp;
                   i--;
                    }
                    else break;
                }
                pointer++;
                i=pointer;
            }
        }
    }

    public static void standardApproach(int[] arr){
        for(int i = 1; i<arr.length; i++){
            int j=i;
            while( j > 0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
    static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 3};
        print(arr);
        System.out.println();
        standardApproach(arr);
        System.out.println();
        print(arr);
    }
}




//Algorithm
//step 1: input an array arr;
//step 2: start a for loop fron index 1 to i<arr.length;
//step 3: for each pass initialize a varialbe j = i;
//step 4: start a nested while loop that runs while j>0 && arr[j]<arr[j-1];
//step 5: inside the while loop swap arr[j] with arr[j-1];
//step 6: Decrement j after each swap;
//step 7: when the while loop ends, the current element is in the correct position;
//step 8: Repeat step 3 - 7 for all elements;
//step 9: array is now sorted;

//Bast case : O(n);
//Worst case : O(n^2);
