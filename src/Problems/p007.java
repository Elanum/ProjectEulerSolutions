package src.Problems;
import src.Helper.*;

public class p007 {
  public static void main(String[] args) {
    int result = solve(10001);
    System.out.println("Result: " + result);
  }

  private static int solve(int n) {
    for (int i = 2, count = 0 ;; i++) {
      if(Helper.isPrime(i)) {
        count++;
        if (count == n) {
          return i;
        }
      }
    }
  }
}
