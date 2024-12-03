public class Primes {
    public static void main(String[] args) {
        // Check if the user provided an argument
        //if (args.length == 0) {
           // System.out.println("Please provide a number as a command-line argument.");
           // return;
       // }

        // Parse the range from the first command-line argument
        int range = Integer.parseInt(args[0]);
        double counter = 0;
        System.out.println("Prime nembers up to " + range + ":");
        for(int i = 2; i <= range; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                counter++;
            }
        }
        int percentege = (int) ((counter / range) * 100);
        System.out.println("There are " + (int) counter + " primes between 2 and " + range + " (" + percentege + "% are primes)");
    }

        public static boolean isPrime(int check) {
            boolean result = true;
            int counter = 2;
            while (counter < check) {
                if (check % counter == 0) {
                    result = false;
                }
                counter++;
            }
            return result;
        }
    }