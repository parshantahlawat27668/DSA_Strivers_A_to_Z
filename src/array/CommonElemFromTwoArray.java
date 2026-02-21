package array;
import java.util.ArrayList;
import java.util.Arrays;

public class CommonElemFromTwoArray {

    public static void print(int[] arr){
        for(int elem : arr){
            System.out.print(" " +elem);
        }
    }

    public static ArrayList<Integer> returnCommon(int[] a, int[] b){
        Arrays.sort(a);
        Arrays.sort(b);
        ArrayList<Integer> result = new ArrayList<>();
        int i=0, j=0;
        while(i<a.length && j<b.length){
            if(a[i] == b[j]){
                result.add(a[i]);
                i++;
                j++;
            }
            else{
                if(a[i]<b[j]) i++;
                else j++;
            }
        }

        return result;
    }

    static void main(String[] args) {
        int[] a ={3,4,67,2,4,6,11,44,77};
        int[] b ={4, 7,23,67, 43, 54, 77};
        print(a);
        System.out.println();
        print(b);
        ArrayList<Integer> result = returnCommon(a,b);
        System.out.println("\n Common elements are : " + result);


    }
}


// Algorithm
//step 1: input 2 array and sort them by merg sort;
//step 2: Initialize  an empty ArrayList with the name of result  and  integer variables i and j;
//step 3: start a while loop with  condition (i<a.length && j<b.length);
//step 4: In the while loop we put some conditions and statements if a[i] == b[j]  so add a[i] in result ArrayList and increment i and j by 1;
//step 5: if a[i] != b[j]  put another condition if a[i] < b[j] ? i++ : j ++ ;
//step 6: after completed the loop return result ArrayList;
//Time complexity = 2n log n + n
//final TC = n log n