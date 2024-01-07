package Test;

import java.util.Scanner;

public class EqTest1 {
    public static void main(String[] args) {
        System.out.println("Enter x,y,z values");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();
        double result;

        x = x*x;
        y =y*y;
        z = Math.abs(z);
        result = Math.cbrt(x+y-z);
        System.out.println(result);

    }
}
