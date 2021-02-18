package src.Problems;

/**
 * Largest prime factor
 */

public class p003 {
  public static void main(String[] args) {
    long result = solve(600851475143L);
    System.out.println("Result: " + result);
  }

  public static long solve(long n) {
    while (true) {
      long prime = smallestFactor(n);
      if (prime < n) {
        n /= prime;
      } else {
        return n;
      }
    }
  }

  public static long smallestFactor(long n) {
    if (n <= 1) {
      throw new IllegalArgumentException();
    }
    long end = (long) Math.sqrt(n);
    for (long i = 2; i <= end; i++) {
      if (n % i == 0) {
        return i;
      }
    }
    return n;
  }
}
