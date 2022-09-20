//Multiples of 3 or 5 (JS)

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
/* Sentence Smash
   Write a function that takes an array of words and smashes them together
   into a sentence and returns the sentence. You can ignore any need to sanitize words or add punctuation,
   but you should add spaces between each word. Be careful, there shouldn't be a space at the beginning
   or the end of the sentence!

   Example
   ['hello', 'world', 'this', 'is', 'great']  =>  'hello world this is great'
   */
function smash (words) {
  let sentence='';
  words.forEach(word => sentence += word + ' ')
  return sentence.trim()
};
// alternate solution using Array.prototype.join(optional separator);
function smash (words) {
   return words.join(" ");
};

