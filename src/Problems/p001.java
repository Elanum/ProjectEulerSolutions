package src.Problems;

/**
 * Multiples of 3 and 5
 */

public class p001 {
  public static void main(String[] args) {
    int result = solve(1000);
    System.out.println("Result: " + result);
  }

  public static int solve(int n) {
    int sum = 0;

    for (int i = 0; i < n; i++) {
      if (i % 3 == 0 || i % 5 == 0) {
        sum += i;
      }
    }
    return sum;
  }
}