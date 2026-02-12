package patterns;

import java.util.Scanner;

public class StarPyramid {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of the pyramid");
        int height = sc.nextInt();

        for (int i =1; i<=height; i++) {
            for(int j = 1; j<=height-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i*2-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }


  }
}
