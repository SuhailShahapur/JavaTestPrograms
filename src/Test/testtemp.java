package Test;

import java.util.Scanner;

public class testtemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();

        int temp = a;
        a= b;
        b= temp;
        System.out.printf("%d is the value of a",a);
        System.out.printf("%d is the value of b",b);
    }
}
