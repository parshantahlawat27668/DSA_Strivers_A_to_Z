package patterns;

import java.util.Scanner;

public class InvertedRightPyramid {
   public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height of the pyramid");
        int height = sc.nextInt();

        for (int i = height; i >=1; i--) {
            for (int j = 1; j <=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
