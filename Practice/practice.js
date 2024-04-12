class Products {
    constructor(name, price) {
        this.name = name;
        this.price = price;
    }
    displayProduct() {
        console.log(`Product: ${this.name}`);
        console.log(`Price: $${this.price}`);
    }
    calculateTotal(salesTax) {
        return this.price + (this.price * salesTax);
    }
}

const salesTax = 0.1;
const Tshirt = new Products("T-shirt",19.99);
const Bag = new Products("Bag",65.99);
const TshirtTotal = Tshirt.calculateTotal(salesTax);
const BagTotal = Bag.calculateTotal(salesTax);

Tshirt.displayProduct();
console.log(`Total price (with tax): $${TshirtTotal.toFixed(2)}`);
console.log();

Bag.displayProduct();
console.log(`Total price (with tax): $${BagTotal.toFixed(2)}`);