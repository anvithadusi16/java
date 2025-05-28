import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 4-digit number: ");
        int n = sc.nextInt();

        int firstDigit = n / 1000;
        int lastDigit = n % 10;

        int sum = firstDigit + lastDigit;

        System.out.println("Sum of first and last digits: " + sum);
    }
}
