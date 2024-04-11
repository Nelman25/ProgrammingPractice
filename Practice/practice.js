const person1 = {
    name: "Jonel",
    faveFood: "hamburger",
    sayHello: () => console.log(`Hello ${this.name}!`),
    eat: function(){console.log(`${this.name} is eating ${this.faveFood}`)},
}
const person2 = {
    name: "Dha",
    faveFood: "chicken fillet",
    sayHello: () => console.log(`Hello ${this.name}!`),
    eat: function(){console.log(`${this.name} is eating ${this.faveFood}`)},
}
person1.sayHello();
person1.eat();

person2.sayHello();
person2.eat();