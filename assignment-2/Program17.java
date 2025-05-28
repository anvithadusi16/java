import java.util.Scanner;
public class MaxSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println("Max: " + (a > b ? a : b));
    }
}
