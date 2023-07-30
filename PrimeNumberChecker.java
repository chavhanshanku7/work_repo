//Below is a Java code to find whether a given number is prime or not

public class PrimeNumberChecker {

    // Function to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        
        // We only need to check for divisors up to the square root of the number
        int sqrt = (int) Math.sqrt(number);
        for (int i = 2; i <= sqrt; i++) {
            if (number % i == 0) {
                return false; // If we find a divisor, it's not a prime number
            }
        }
        return true; // If no divisors are found, it's a prime number
    }

    public static void main(String[] args) {
        int num = 17; // Replace this with the number you want to check for primality
        
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
