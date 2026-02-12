package patterns;

import java.util.Scanner;

public class DiamondStarPattern {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter upper height of the diamond");
        int height = sc.nextInt();

//        upper part
        for(int i=1; i<=height; i++){
//            for spaces
            for(int j=1; j<=height-i; j++){
                System.out.print(" ");
            }
//           for stars
            for(int k=1; k<=i*2-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }


//        lower part
        for(int i2=height; i2>=1; i2--){
//            for spaces
            for(int j2=1; j2<=height-i2; j2++){
                System.out.print(" ");
            }

//            for stars
            for (int k2=1; k2<=i2*2-1; k2++){
                System.out.print("*");
            }
            System.out.println();
        }
        }
    }
