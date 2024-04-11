function Car (make,model,year,color) {
    this.make = make,
    this.model = model,
    this.year = year,
    this.color = color
}

const car1 = new Car("Tesla","model3",2024,"yellow");
console.log(car1.make);
console.log(car1.model);
console.log(car1.year);
console.log(car1.color);

const car2 = new Car("Chevrolet","mustang",2025,"lightblue");
console.log(car2.make);
console.log(car2.model);
console.log(car2.year);
console.log(car2.color);
