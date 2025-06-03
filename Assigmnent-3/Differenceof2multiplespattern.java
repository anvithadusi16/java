public class IncreasingGapPattern {
    public static void main(String[] args) {
        int num = 1;     // First number in the series
        int diff = 2;    // Initial difference

        while (num <= 100) {
            System.out.print(num + "\t");
            num = num + diff;
            diff = diff + 2;  // Increase the gap by 2 each time
        }
    }
}
