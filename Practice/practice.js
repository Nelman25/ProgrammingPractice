// super = keyword used in classes to call the constructor or acces the properties 
//         and methods of a parent (also known as superclass) 
//         this = this object
//         super = the parent

class Animal {
    constructor(name,age) {
        this.name = name;
        this.age = age; 
    }
    move(speed) {
        console.log(`This ${this.name} moves at a speed of ${speed}mph`)
    }
}
class Rabbit extends Animal {
    constructor(name,age,runSpeed) {
        super(name,age);
        this.runSpeed = runSpeed;
    }
    run() {
        console.log(`This ${this.name} can run`);
        super.move(this.runSpeed);
    }
}

class Fish extends Animal {
    constructor(name,age,swimSpeed) {
        super(name,age);
        this.swimSpeed = swimSpeed;
    }
    swim() {
        console.log(`This ${this.name} can swim`);
        super.move(this.swimSpeed);
    }
}

class Hawk extends Animal {
    constructor(name,age,flySpeed) {
        super(name,age);
        this.flySpeed = flySpeed;
    }
    fly() {
        console.log(`This ${this.name} can fly`);
        super.move(this.flySpeed);
    }
}

const rabbit = new Rabbit("rabbit",3,15);
const fish = new Fish("fish",5,20);
const hawk = new Hawk("hawk",10,200);

console.log(rabbit.name);
console.log(rabbit.age);
console.log(rabbit.runSpeed);
rabbit.run();

console.log(fish.name);
console.log(fish.age);
console.log(fish.swimSpeed);
fish.swim();

console.log(hawk.name);
console.log(hawk.age);
console.log(hawk.flySpeed);
hawk.fly();



