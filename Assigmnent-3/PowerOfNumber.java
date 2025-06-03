import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base (y): ");
        int y = sc.nextInt();
        System.out.print("Enter exponent (x): ");
        int x = sc.nextInt();

        int result = 1;
        for (int i = 1; i <= x; i++) {
            result *= y;
        }

        System.out.println(y + " raised to power " + x + " is " + result);
    }
}
