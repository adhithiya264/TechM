function displayValuesWithSkip(num1, num2) {
  let i = num1;

  while (i <= num2) {
    if (i % 5 !== 0) { 
      console.log(i);
    }
    i++; 
  }
}

displayValuesWithSkip(10, 60);
