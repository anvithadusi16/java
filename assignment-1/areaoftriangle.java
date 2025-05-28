import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Circle
        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();
        double circleArea = Math.PI * r * r;

        // Triangle
        System.out.print("Enter base of triangle: ");
        double base = sc.nextDouble();
        System.out.print("Enter height of triangle: ");
        double height = sc.nextDouble();
        double triangleArea = 0.5 * base * height;

        System.out.println("Area of circle: " + circleArea);
        System.out.println("Area of triangle: " + triangleArea);
    }
}
