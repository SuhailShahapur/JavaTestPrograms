package Test;

import java.util.Scanner;

public class TriangleChecker {
    public static void main(String[] args) {
        System.out.println("enter triangle side");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a==b && b==c){
            System.out.println("eq");
        }
        else if(a==b || b==c || a==c){
            System.out.println("iso");
        }
        else {
            System.out.println("sca");
        }

    }
}
