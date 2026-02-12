package patterns;

import java.util.Scanner;

public class NumberSquare {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the square");
        int size = sc.nextInt();

        for(int i=1; i<= size * 2 -1; i++){
            for(int j =1; j<=size * 2 - 1; j++){
                int a=i, b=j;
                if(i>size) a= 2*size -i;
                if(j>size) b= 2*size -j;
                System.out.print(Math.min(a,b));
            }
            System.out.println();
        }
    }
}
