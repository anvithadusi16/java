import java.util.Scanner;
public class GeometryMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Circle 2.Rectangle 3.Square");
        int choice = sc.nextInt();
        switch(choice) {
            case 1:
                System.out.print("Enter radius: ");
                double r = sc.nextDouble();
                System.out.println("Area: " + (Math.PI * r * r));
                break;
            case 2:
                System.out.print("Enter length and breadth: ");
                double l = sc.nextDouble(), b = sc.nextDouble();
                System.out.println("Area: " + (l * b));
                break;
            case 3:
                System.out.print("Enter side: ");
                double s = sc.nextDouble();
                System.out.println("Area: " + (s * s));
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
