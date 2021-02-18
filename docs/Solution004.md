# Largest palindrome product

<blockquote>
<p>A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.</p>
<p>Find the largest palindrome made from the product of two 3-digit numbers.</p>
</blockquote>

## Solution

Iterate two variables for the multipliers in a nested loop from the smallest value _(in this case 100)_ to the highest value _(in this case 999)_. After each multiply operation, save the result in a variable and check if the result is a palindrome and if the result is greater than the previous result.

[Source Code](../src/Problems/p004.java)
