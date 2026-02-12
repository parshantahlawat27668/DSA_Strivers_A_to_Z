package patterns;

import java.util.Scanner;

public class InvertedStarPyramid {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height of the pyramid");
        int height = sc.nextInt();
        for(int i = height; i>=1; i--){
//            for print spaces
            for(int j=1; j<=height-i; j++){
                System.out.print(" ");
            }
//            for print stars
            for(int k=1; k<=i*2-1; k++){
                System.out.print("*");
            }

            System.out.println();

        }

        }
    }

