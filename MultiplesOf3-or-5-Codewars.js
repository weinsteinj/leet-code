//Multiples of 3 or 5 (JS, Java)

function solution(number){
  let num = number-1;
  let sum = 0;
  if (number <= 0) {
    return 0;
  } else {
  
  while(num >= 3) {
    if(num % 3 === 0) {
      sum = sum + num;
    } else if (num % 5 === 0) {
      sum = sum + num;  
      }
      num--; 
    }
  }
  return sum;
}
