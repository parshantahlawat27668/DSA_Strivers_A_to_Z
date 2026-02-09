package basics;

import java.util.Scanner;

public  class Conditions {

    public static   void ifStatement (){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your age : ");
        int age = sc.nextInt();

        if(age <18){
            System.out.println("You are no eligible for Driving Licence");
            return;
        }
        System.out.println("You are eligible for Driving Licence");
    }

    public static void ifElseStatement(){
        Scanner sc = new Scanner(System.in);
        System.out.println();

    }



    public static void main(String[] args) {
//        ifStatement();
    }
}
