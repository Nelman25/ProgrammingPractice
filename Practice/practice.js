// inheritance = it allows a new class to inherit properties and methods 
//               from an existing class (parent class). User keyword "extends".

class Animal {
    alive = true;

    eat() {
        console.log(`This ${this.name} is eating`);
    }
    sleep() {
        console.log(`This ${this.name} is sleeping`);
    }
}

class Rabbit extends Animal {
    name = "Rabbit";

    static run(){
        console.log(`This ${this.name} is running`);
    }
}

class Fish extends Animal {
    name = "Fish";

    static swim() {
        console.log(`This ${this.name} is swimming`);
    }
}

class Hawk extends Animal {
    name = "Hawk";

    static fly() {
        console.log(`This ${this.name} is flying`);
    }
}

const rabbit = new Rabbit();
const fish = new Fish();
const hawk = new Hawk();

console.log(rabbit.alive);
rabbit.eat();
rabbit.sleep();
console.log(Rabbit.run()); // using static keyword 
