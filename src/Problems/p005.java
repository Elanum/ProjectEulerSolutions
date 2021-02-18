package src.Problems;
import src.Helper.*;

/**
 * Smallest multiple
 */

public class p005 {
  public static void main(String[] args) {
    int result = solve(20);
    System.out.println("Result: " + result);
  }

  private static int solve(int max) {
    int result = 1;
    for (int i = 1; i <= max; i++) {
      result = Helper.lcm(i, result);
    }
    return result;
  }
}
