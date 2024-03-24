const decreaseBtn = document.getElementById("decreaseBtn");
const resetBtn = document.getElementById("resetBtn");
const increaseBtn = document.getElementById("increaseBtn");
const counterLabel = document.getElementById("counterLabel");
let counter = 0;

decreaseBtn.onclick = function () {
  counter--;
  counterLabel.textContent = counter;
};
resetBtn.onclick = function () {
  counter = 0;
  counterLabel.textContent = counter;
};
increaseBtn.onclick = function () {
  counter++;
  counterLabel.textContent = counter;
};
