// Object JavaScript practice

const person1 = {
    FirstName: "Dharilyn",
    LastName: "Taladro",
    age: 19,
    isEmployed: false,
    SayHello: () => console.log("Hello!")
}
const person2 = {
    FirstName: "Jonel", 
    LastName: "Villaver",
    age: 19,
    isEmployed: false,
    SayHello: () => console.log("HELLO!")
}

console.log(person1.FirstName);
console.log(person1.LastName);
console.log(person1.age);
console.log(person1.isEmployed);
person1.SayHello();

console.log(person2.FirstName);
console.log(person2.LastName);
console.log(person2.age);
console.log(person2.isEmployed);
person2.SayHello();
