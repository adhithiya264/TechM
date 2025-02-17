function displayMultiples(num1, num2) {
  let thirdNum = num2 + 40;
  let i = num2; 

  while (i <= thirdNum) {
    if (i % num1 === 0) { 
      console.log(i); 
    }
    i++; // Increment to check the next number
  }
}

displayMultiples(7, 20);
