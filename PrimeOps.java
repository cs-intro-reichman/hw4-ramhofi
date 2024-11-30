// Represents algebraic operations as functions.
public class PrimeOps {
    public static void main(String args[]) {
        // Define the range
        int range = 100; // Change this value for other test cases

        // Get the primes
        int[] primes = sieve(range);

        // Print the primes
        System.out.print("Prime numbers up to " + range + ": ");
        for (int prime : primes) {
            System.out.print(prime + " ");
        }
        System.out.println(); // Newline for clarity

        // Count the primes
        int primeCount = primes.length;

        // Calculate the percentage
        double percentage = (primeCount * 100.0) / (range - 1); // Count between 2 and range

        // Print the results at the end
        System.out.println("There are " + primeCount + " primes between 2 and " + range +
                " (" + String.format("%.0f", percentage) + "% are primes)");
    }

    // Returns an array of all prime numbers up to any given number.
    // Assumption: n is nonnegative.
    public static int[] sieve(int n) {
        int index = 0;
        int sum = 0;

        // Count primes
        for (int j = 2; j <= n; j++) { // Start from 2 since 0 and 1 are not primes
            if (isPrime(j)) {
                sum++;
            }
        }

        // Create array for primes
        int[] newArr = new int[sum];
        for (int i = 2; i <= n; i++) { // Start from 2 since 0 and 1 are not primes
            if (isPrime(i)) {
                newArr[index] = i;
                index++;
            }
        }

        return newArr;
    }

    // Checks if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) { // Optimize by checking up to sqrt(n)
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

