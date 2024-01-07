package Test;

public class Test2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
//        if(a++ == 10 | b++ == 10){
//            System.out.println(a+" "+b);
//
//        }
        if (a++ == 10 || b++ == 10){
            System.out.println(a+" "+b);
        }
    }
}
