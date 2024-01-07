package Test2;

import java.util.Scanner;

public class addNumber {
    public static void main(String[] args) {
        System.out.println("This program is used to calculate sum of two number");
        System.out.println("Please Enter a value of x: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Enter the Value for y: " );
        int y = sc.nextInt();
        int result = x+y;
        System.out.println("Sum of the given number is :"+result );
    }

}
