public class PrimeBetween2To20 {
    public static void main(String[] args) {
        for (int num = 2; num <= 20; num++) {
            boolean isPrime = true;

            // Check if num is divisible by any number from 2 to num/2
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + "\t");
            }
        }
    }
}
