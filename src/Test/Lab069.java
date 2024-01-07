package Test;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab069 {
    public static void main(String[] args) {
        System.out.println("Enter your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        System.out.println("Enter your age: "+ name );
        int age = sc.nextInt();

        System.out.println("Enter your designation: "+ name);
        String des = sc.next();
    }
}
