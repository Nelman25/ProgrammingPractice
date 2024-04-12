// static = defines properties and methods that belongs to a class itself rather than
//          objects created from that class (class owns anything static, not the object);

class MathUtil {
    static PI = 3.14159;

    static getDiameter(radius) {
        return radius * 2;
    }
    static getCircumference(radius) {
        return 2 * this.PI * radius;
    }
    static getArea(radius) {
        return this.PI * radius * radius;
    }
}

console.log(`Area  = ${MathUtil.getArea(5)}`);
console.log(`Circumference = ${MathUtil.getCircumference(5)}`);
console.log(`Diameter = ${MathUtil.getDiameter(5)}`);