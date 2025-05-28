import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        for (int i = 0; i < 5; i++)
            total += sc.nextInt();
        double avg = total / 5.0;
        if (avg >= 90)
            System.out.println("A+");
        else if (avg >= 80)
            System.out.println("A");
        else if (avg >= 70)
            System.out.println("B+");
        else if (avg >= 60)
            System.out.println("B");
        else if (avg >= 50)
            System.out.println("C");
        else
            System.out.println("Fail");
    }
}
