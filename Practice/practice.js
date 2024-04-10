// Example of Function declaration

const numbers = [1,2,3,4,5,6,7,8,9,10];

// const squaredNumbers = numbers.map(square);

// console.log(squaredNumbers);

// function square(element) {
//     return Math.pow(element,2);
// }


// Example of function expressions

const squaredNumbers = numbers.map(function(element){
    return Math.pow(element,2);
});

const cubedNumbers = numbers.map(function(element) {
    return Math.pow(element,3);
});
const raisedTo4 = numbers.map(function(element) {
    return Math.pow(element,4);
});
const raisedTo5 = numbers.map(function(element) {
    return Math.pow(element,5);
});

console.log(squaredNumbers);
console.log(cubedNumbers);
console.log(raisedTo4);
console.log(raisedTo5);