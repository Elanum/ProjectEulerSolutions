package src.Problems;
import src.Helper.*;

/**
 * Largest palindrome product
 */

public class p004 {
  public static void main(String[] args) {
    int result = solve(3);
    System.out.println("Result: " + result);
  }

  private static int solve(int digits) {
    if (digits < 1) {
      throw new IllegalArgumentException();
    }
    
    int palindrome = -1;
    int min = (int) Math.pow(10, digits - 1);
    int max = (int) Math.pow(10, digits);

    for (int i = min; i < max; i++) {
      for (int j = min; j < max; j++) {
        int prod = i * j;
        if (Helper.isPalindrome(prod) && prod > palindrome) {
          palindrome = prod;
        }
      }
    }
    return palindrome;
  }
}
