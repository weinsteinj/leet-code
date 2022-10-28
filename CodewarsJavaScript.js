

//======


/* Complete the square sum function so that it squares each number passed into it and then sums the results together.

For example, for [1, 2, 2] it should return 9 because 1^2 + 2^2 + 2^2 = 9.

*/

function squareSum(numbers){
  let sum = 0;
  numbers.forEach((num) => {
    sum += num ** 2;
    })
  return sum;
}

//=====


/* Clock shows h hours, m minutes and s seconds after midnight.

Your task is to write a function which returns the time since midnight in milliseconds.

Example:
h = 0
m = 1
s = 1

result = 61000
Input constraints:

0 <= h <= 23
0 <= m <= 59
0 <= s <= 59

*/

function past(h, m, s){
  return (s + 60 * m + 60 * 60 * h) * 1000
}