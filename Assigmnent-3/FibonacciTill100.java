public class FibonacciTill100 {
    public static void main(String[] args) {
        int a = 0, b = 1;
        System.out.print(a + "\t" + b + "\t");

        int c = a + b;
        while (c <= 100) {
            System.out.print(c + "\t");
            a = b;
            b = c;
            c = a + b;
        }
    }
}
