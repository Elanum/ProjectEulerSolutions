package src.Helper;

public class Helper {

  /**
   * Reverse a string
   * @param   s string to be reversed
   * @return    reversed string
   */
  public static String reverse(String s) {
    return new StringBuilder(s).reverse().toString();
  }

  /**
   * Check if string is a palindrome
   * @param   s string to be checked
   * @return    result of the check
   */
  public static boolean isPalindrome(String s) {
    return s.equals(reverse(s));
  }

  /**
   * Check if number is a palindrome
   * @param   x number to be checked
   * @return    result of the check
   */
  public static boolean isPalindrome(int x) {
    return isPalindrome(Integer.toString(x));
  }

  /**
   * Calculate the greatest common divider
   * @param   x first number
   * @param   y second number
   * @throws    IllegalArgumentExeption
   * @return    result
   */
  public static int gcd(int x, int y) {
    if (x < 0 || y < 0) {
      throw new IllegalArgumentException("Negative number");
    }
    while (y != 0) {
      int z = x % y;
      x = y;
      y = z;
    }
    return x;
  }

  /**
   * Calculate the lowest common multiple
   * @param   x first number
   * @param   y second number
   * @return    result
   */
  public static int lcm(int x, int y) {
    return (x / gcd(x, y)) * y;
  }
}
