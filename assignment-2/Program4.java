import java.util.Scanner;
public class LargestConditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int largest = (a > b && a > c) ? a : (b > c ? b : c);
        System.out.println("Largest: " + largest);
    }
}
