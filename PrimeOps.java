public class PrimeOps {
    public static void main(String[] args) {
        // Check if the user provided an argument
        //if (args.length == 0) {
           // System.out.println("Please provide a number as a command-line argument.");
           // return;
       // }

        // Parse the range from the first command-line argument
        int range = Integer.parseInt(args[0]);

        // Handle invalid range
        if (range < 2) {
            System.out.println("Please enter a number greater than or equal to 2.");
            return;
        }

        // Create an array to mark prime numbers
        boolean[] isPrime = new boolean[range + 1];
        for (int i = 2; i <= range; i++) {
            isPrime[i] = true; // Assume all numbers are prime initially
        }

        // Implement the sieve logic manually
        for (int p = 2; p * p <= range; p++) {
            if (isPrime[p]) { // If p is still marked as prime
                for (int i = p * p; i <= range; i += p) {
                    isPrime[i] = false; // Mark multiples of p as not prime
                }
            }
        }

        // Print the primes and count them
        System.out.println("Prime numbers up to " + range + ":");
        int primeCount = 0;
        for (int i = 2; i <= range; i++) {
            if (isPrime[i]) {
                System.out.println(i); // Print each prime number on a new line
                primeCount++; // Increment the count
            }
        }

        // Total numbers between 2 and the range
        double totalNumbers = range; // Total numbers in the range [2, n]
    

        // Calculate the percentage manually and take the floor
        double rawPercentage = (primeCount * 100.0) / totalNumbers;
     
        int flooredPercentage = (int) rawPercentage; // Take the floor of the raw percentage

        // Print the results in the expected format
        System.out.println("There are " + primeCount + " primes between 2 and " + range +
                " (" + flooredPercentage + "% are primes)");
       
    }
}
