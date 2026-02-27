package basics;

public class ArrangingCoins {
    static int basicApproach(int num){
        long left = 1, right = num;
        while(left<=right){
            long mid = left + (right-left)/2;
            long sum = mid * (mid + 1 )/2;

            if(sum == num) return (int)mid;
            else if(sum<num) left = mid + 1;
            else right = mid - 1;
        }
        return  (int)right;
    }

    static void main(String[] args) {
        System.out.println(basicApproach(22));
    }
}
