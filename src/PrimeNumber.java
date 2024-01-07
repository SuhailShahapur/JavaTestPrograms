import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num= sc.nextInt();
        int a =0;
        if(num>1){
            for (int i = 1; i <=num ; i++) {
                if (num % i == 0) {
                    a++;
                }
            }
                if(a==2){
                    System.out.println("Given number is prime number");
                }
                else {
                    System.out.println("Not a prime number: ");
                }


            }
        else {
            System.out.println("Given number is negative, Please provide the Positive number");
        }

        }
    }

