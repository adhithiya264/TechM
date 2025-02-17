function checkSumOfDigits(number) {
    let sum = 0;
    
      number.toString().split('').forEach(digit => {
        sum += parseInt(digit);
      });
    
    if (sum % 2 === 0) {
        console.log(`The sum of the digits is ${sum} and it is even.`);
    } else {
        console.log(`The sum of the digits is ${sum} and it is odd.`);
    }
}

let num = 1234; 
checkSumOfDigits(num);
