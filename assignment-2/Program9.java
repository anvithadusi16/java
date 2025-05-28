import java.util.Scanner;
public class DigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num >= -9 && num <= 9)
            System.out.println("Single digit");
        else if ((num >= -99 && num <= -10) || (num >= 10 && num <= 99))
            System.out.println("Two digits");
        else
            System.out.println("Three or more digits");
    }
}
