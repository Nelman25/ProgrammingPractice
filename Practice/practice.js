function generatePassword(
  passwordLength,
  includesLowerCase,
  includesUpperCase,
  includesNumbers,
  includesSymbols
) {
  const lowerCaseChars = "abcdefghijklmnopqrstuvwxyz";
  const upperCaseChars = "ABCDEFGHIJKLOMNOPQRSTUVWXYZ";
  const numberChars = "0123456789";
  const symbolChars = "!@#$%^&*()_+";

  let allowedChars = "";
  let password = "";

  allowedChars += includesLowerCase ? lowerCaseChars : "";
  allowedChars += includesUpperCase ? upperCaseChars : "";
  allowedChars += includesNumbers ? numberChars : "";
  allowedChars += includesSymbols ? symbolChars : "";

  if (passwordLength <= 0) {
    return `The password length must be more than 1`;
  }
  if (allowedChars === 0) {
    return `Please select atleast 1 condition`;
  }

  for (let i = 0; i < passwordLength; i++) {
    const randomIndex = Math.floor(Math.random() * allowedChars.length);

    password += allowedChars[randomIndex];
  }
  return password;
}

const passwordLength = 12;
const includesLowerCase = true;
const includesUpperCase = true;
const includesNumbers = true;
const includesSymbols = true;

const password = generatePassword(
  passwordLength,
  includesLowerCase,
  includesUpperCase,
  includesNumbers,
  includesSymbols
);

console.log(`Generated password: ${password}`);
