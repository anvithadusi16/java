import java.util.Scanner;
public class ValidTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        System.out.println((a + b + c == 180) ? "Valid Triangle" : "Invalid Triangle");
    }
}
