import java.util.Scanner;
public class GradeDescription {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char grade = sc.next().charAt(0);
        switch(grade) {
            case 'E': System.out.println("Excellent"); break;
            case 'V': System.out.println("Very Good"); break;
            case 'G': System.out.println("Good"); break;
            case 'A': System.out.println("Average"); break;
            case 'F': System.out.println("Fail"); break;
            default: System.out.println("Invalid");
        }
    }
}
