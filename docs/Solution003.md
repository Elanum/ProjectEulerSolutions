# Largest prime factor

<blockquote>
<p>The prime factors of 13195 are 5, 7, 13 and 29.</p>
<p>What is the largest prime factor of the number 600851475143 ?</p>
</blockquote>

## Solution

First we calculate the smallest factor of the current number by looping from `2` to a maximum of the rounded square root of the current number. if the current number can be divided with the current iteration number, return the iteration number as the smallest factor. if the smallest factor is less than the current number. Repeat the process until the smallest factor is even with the current processed number, since this is the largest prime factor you can get.

[Source Code](../src/Problems/p003.java)

## Example

Example with `n = 10`

1. `end = √10 = 3,1623... ≈ 3`
2. Start iteration
   `i = 2`
3. Divide `n` with `i`
   `result = 10 / 2 = 5`
4. Modulo is `0`
5. Is `i` smaller than `n`?
   `5 < 10 = true`
6. Restart process
   `end = √5 = 2,2360... ≈ 2`
7. Start iteration
   `i = 2`
8. Divide `n` with `i`
   `result = 5 / 2 = 2.5`
9. Modulo is not `0`
10. Increase `i` (`i = 3`)
11. Iteratior `i` is now bigger than the square root of `5` (`end`)
12. return `n`
13. Is `i` smaller than `n`?
    `5 < 5 = false`
14. **The largest prime factor of `10` is `5`**
