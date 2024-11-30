// Represents algebraic operations as functions.
public class PrimeOps {
    public static void main(String args[]) {
        // Define the range
        int range = 100; // Example: Prime numbers up to 100
        
        // Get the primes
        int[] primes = sieve(range);

        // Print the primes (optional)
        System.out.print("Primes up to " + range + ": ");
        for (int prime : primes) {
            System.out.print(prime + " ");
        }
        System.out.println(); // Newline for clarity

        // Count the primes
        int primeCount = primes.length;

        // Calculate the percentage
        double percentage = (primeCount * 100.0) / (range + 1); // range + 1 because it includes 0

        // Print the results at the end
        System.out.println("There are " + primeCount + " primes between 2 and " + range + " (" + percentage + "% are primes)");
        // System.out.println("Percentage of primes in the range [0, " + range + "]: " + percentage + "%");
    }

    // Returns an array of all prime numbers up to any given number.
    // Assumption: n is nonnegative.
    public static int[] sieve(int n) {
        int index = 0;
        int sum = 0;

        // Count primes
        for (int j = 0; j <= n; j++) {
            if (isPrime(j)) {
                sum++;
            }
        }

        // Create array for primes
        int[] newArr = new int[sum];
        for (int i = 0; i <= n; i++) {
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
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
