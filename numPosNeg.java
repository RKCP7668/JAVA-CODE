// 3.	Write a    Java program to check whether a number is negative, positive or zero.

import java.util.Scanner;
public class numPosNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int num = sc.nextInt();
        if (num >0)
            System.out.println(num+" is Positive.");
        else if (num<0)
            System.out.println(num+" is Negative.");
        else
            System.out.println(num+" is Zero.");
    }

}
