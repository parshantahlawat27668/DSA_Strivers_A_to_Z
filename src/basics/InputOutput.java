package basics;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {

//        Basic input output with scanner

        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name  :");
        String name = sc.nextLine();
        System.out.println("What is your age : ");
        int age  = sc.nextInt();

        System.out.println("Check you Information : ");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);



    }
}
