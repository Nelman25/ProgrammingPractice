const numbers = [1,2,3,4,5,6,7,8];
const squared = numbers.map((element) => Math.pow(element,2));
const cubed = numbers.map((element) => Math.pow(element,3));
const even = numbers.filter((element) => element % 2 ===0);
const odd = numbers.filter((element) => element % 2 !==0);
const total = numbers.reduce((accumulator,element) => accumulator+element);

console.log(total);