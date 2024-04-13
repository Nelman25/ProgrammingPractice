//  getter = special method that makes a property readable
//  setter = special method that makes a property writeable
//  validate and modify a value when reading/writing a property

class Rectangle {
  constructor(width, height) {
    this.width = width;
    this.height = height;
  }
  set width(newWidth) {
    if (newWidth > 0) {
      this._width = newWidth;
    } else {
      console.error(`The width must be a positive number`);
    }
  }
  set height(newHeight) {
    if (newHeight > 0) {
      this._height = newHeight;
    } else {
      console.error(`The height must be a positive number`);
    }
  }
  get width() {
    return `${this._width.toFixed(1)}cm`;
  }
  get height() {
    return `${this._height.toFixed(1)}cm`;
  }
  get area() {
    return `${(this._height * this._width).toFixed(2)}cm`;
  }
}

const rectangle = new Rectangle(-100000, "pizza");

rectangle.width = 16;
rectangle.height = 14;
console.log(rectangle.width);
console.log(rectangle.height);
console.log(rectangle.area);
