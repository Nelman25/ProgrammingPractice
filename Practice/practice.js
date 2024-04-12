// static = defines properties and methods that belongs to a class itself rather than
//          objects created from that class (class owns anything static, not the object);

class User {
    static userCount = 0;

    constructor(username) {
        this.username = username;
        User.userCount++;
    }

    static getUserCounter() {
        console.log(`There are ${User.userCount} users online.`)
    }
    sayHello() {
        console.log(`Hello! my name is ${this.username}`);
    }
}

const user1 = new User("Spongebob");
const user2 = new User("Patrick");
const user3 = new User("Sandy");
const user4 = new User("BongBong Marcos");

user1.sayHello();
user2.sayHello();
user3.sayHello();
user4.sayHello();

User.getUserCounter();