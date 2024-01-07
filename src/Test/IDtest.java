package Test;

public class IDtest {
    public static void main(String[] args) {
        int a = 10;
        int d = --a + a++ + a-- ;
        System.out.println(d);
        System.out.println(a);
    }
}
