public class OddNumbers {
    public static void main(String[] args) {
        System.out.println("Pattern: 1 3 5 7 9 ... till 100");
        for (int i = 1; i <= 100; i += 2) {
            System.out.print(i + "\t");
        }
        System.out.println(); // For a new line at the end
    }
}