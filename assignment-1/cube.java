import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int cube = n * n * n;

        System.out.println("Cube of the number is: " + cube);
    }
}
