import java.util.Scanner;
public class LargerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println("Larger: " + (a > b ? a : b));
    }
}
