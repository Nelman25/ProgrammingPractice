function rollDice() {
  const numOfDice = document.getElementById("numOfDice").value;
  const resultDisplay = document.getElementById("resultDisplay");
  const diceImages = document.getElementById("diceImages");
  const values = [];
  const images = [];

  for(let i = 0; i<numOfDice;i++) {
    let value = Math.floor((Math.random()*6) + 1);
    values.push(value);
    images.push(`<img src="diceImages/${value}.png">`)  
  }
  resultDisplay.textContent = `Dice: ${values.join(", ")}`;
  diceImages.innerHTML = images.join("");
}
