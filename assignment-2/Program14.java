import java.util.Scanner;
public class ArithmeticMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        char op = sc.next().charAt(0);
        switch(op) {
            case '+': System.out.println("Sum: " + (a + b)); break;
            case '-': System.out.println("Difference: " + (a - b)); break;
            case '*': System.out.println("Product: " + (a * b)); break;
            case '/': System.out.println(b != 0 ? "Quotient: " + (a / b) : "Division by zero"); break;
            default: System.out.println("Invalid");
        }
    }
}
