package Test;

import java.util.Scanner;

public class LoopT4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to find factorial of: ");
        int num = sc.nextInt();
        int i =1;
        int fact=1;
        while(i<=num){
            fact = fact *i;

            i++;
        }
        System.out.println(fact);
    }
}
