package array.problems;

import java.util.ArrayList;

public class UnionOfTwoArray {
    public static ArrayList<Integer> basicApproach(int[] a, int[] b){
        int i=0,j=0;
        ArrayList<Integer> result = new ArrayList<>();
        while(i<a.length && j<b.length){
            if(a[i] != b[j]){
                if(i>0 && j>0 && (a[i] == a[i-1] || b[j] == b[j-1])){
                    if(a[i] == a[i-1]) i++;
                    if(b[j] == b[j-1]) j++;
                }
                else{
                result.add(a[i]);
                result.add(b[j]);
                i++;
                j++;
                }
            }
            else{
                if(i>0 && j>0 && (a[i] == a[i-1] || b[j] == b[j-1])){
                    i++;
                    j++;
                }
                else {
                    result.add(a[i]);
                    i++;
                   j++;
                }
            }
        }
        return  result;

    }

    public static void print(int[] arr){
        for(int elem : arr){
            System.out.print(" " +elem);
        }
    }
    static void main(String[] args) {
        int[] a={2,4,7,9,10};
        int[] b={3,4,4,8,11};
        print(a);
        System.out.println();
        print(b);
        System.out.println();

        ArrayList<Integer> result = basicApproach(a,b);
        System.out.println(result);
    }
}
