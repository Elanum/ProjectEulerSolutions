# Problem 1

<blockquote>
  <p>If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.</p>
  <p>Find the sum of all the multiples of 3 or 5 below 1000.</p>
</blockquote>

## Solution

Iterate through all integers between 0 and n _(in this case `1000`)_ and everytime the value can be divided with `3` or `5`, add it to the result.
