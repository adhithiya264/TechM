function displayValuesWithStop(num1, num2) {
  let i = num1;

  while (i <= num2) {
    console.log(i);

    if (i % 7 === 0) { 
      break; 
    }

    i++; 
  }
}
displayValuesWithStop(10, 40);
