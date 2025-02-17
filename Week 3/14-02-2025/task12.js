function displayMultiplicationTable(num1, num2) {
  for (let i = 1; i <= num2; i++) {
    console.log(`${num1} * ${i} = ${num1 * i}`);
  }
}
displayMultiplicationTable(5, 7);
