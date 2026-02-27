package array.problems;

public class SquareRoot {
    static int basicApproach(int x){
        int left = 1, right = x, findex = -1;
        while(left <= right){
            int mindex = left + (right - left )/2;
            if(mindex == x/mindex) return mindex;
            if(mindex * mindex > x) right = mindex -1;
            else{
                findex = mindex;
                left = mindex + 1;
            }
        }
        return  findex;
    }
    static void main(String[] args) {
        System.out.println(basicApproach(16));
    }
}
