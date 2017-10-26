
import java.util.Scanner;

/**
 *
 * @author eduardo
 */
class PRIME1 {

    // http://www.spoj.com/problems/PRIME1/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < cases; i++) {
            String interval = sc.nextLine();
            Scanner interval_scanner = new Scanner(interval);
            long init = 0, end = 0;
            while (interval_scanner.hasNext()) {
                init = Long.parseLong(interval_scanner.next());
                end = Long.parseLong(interval_scanner.next());
            }

            long step = init;
            if (isPrime(step)) {
                System.out.println(step);
            }
            while (step <= end) {
                step = nextPrime(step);
                if (step <= end) {
                    System.out.println(step);
                }
            }

            if (i != cases - 1) {
                System.out.println();
            }
        }
    }

    private static long nextPrime(long num) {
        while (!isPrime(++num)) {
            // continue;
        }
        return num;
    }

    private static boolean isPrime(long num) {
        if (num == 2) {
            return true;
        } else if (num % 2 == 0 || num < 2) {
            return false;
        }

        double limit = Math.sqrt(num);
        for (long i = 3; i <= limit; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
