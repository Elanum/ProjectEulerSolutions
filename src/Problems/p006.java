package src.Problems;

public class p006 {
  public static void main(String[] args) {
    int result = solve(100);
    System.out.println("Result: " + result);
  }

  private static int solve(int n) {
    int natural = sumOfNatural(n);
    int squares = sumOfSquares(n);
    return (int) Math.pow(natural, 2) - squares;
  }

  private static int sumOfNatural(int n) {
    return n == 1 ? n : n + sumOfNatural(n - 1);
  }

  private static int sumOfSquares(int n) {
    return n == 1 ? n : (int) Math.pow(n, 2) + sumOfSquares(n - 1);
  }
}
