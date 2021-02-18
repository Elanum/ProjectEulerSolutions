package src.Problems;

/**
 * Even Fibonacci numbers
 */

public class p002 {
  public static void main(String[] args) {
    int result = solve(4000000);
    System.out.println("Result: " + result);
  }

  public static int solve(int n) {
    int sum = 0;
    int current = 1;
    int next = 2;

    while (current <= n) {
      if (current % 2 == 0) {
        sum += current;
      }
      int fib = current + next;
      current = next;
      next = fib;
    }
    
    return sum;
  }
}
