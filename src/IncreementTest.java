public class IncreementTest {
    public static void main(String[] args) {
        int a = 6;
        System.out.println((++a+--a)*(a--+--a)-(++a+--a)*(--a + ++a));
    }
}
