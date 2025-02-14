//task1

let number = 5;
let cube = number ** 3;
console.log("The cube of", number, "is", cube);


//task2 

var number = -7;

if (number > 0) {
    console.log("The number", number, "is positive.");
} else if (number < 0) {
    console.log("The number", number, "is negative.");
} else {
    console.log("The number is zero.");
}


//task3

const number = 29;

function isPrime(num) {
    if (num <= 1) return false; 
    for (let i = 2; i <= Math.sqrt(num); i++) {
        if (num % i === 0) return false; 
    }
    return true;
}

if (isPrime(number)) {
    console.log("The number", number, "is a prime number.");
} else {
    console.log("The number", number, "is not a prime number.");
}


//task4

let userAddress = prompt("Please enter your address:");

alert("Your address is: " + userAddress);

//task5

let willGoToFilm = confirm("Will you go to the film today?");

if (willGoToFilm) {
    alert("Great! Enjoy the film!");
} else {
    alert("Maybe next time!");
}

//task 6

let userAge = prompt("Please enter your age:");

alert("Your age is: " + userAge);


//task7

let number = 24; 
if (number % 12 === 0) {
  console.log(number + " is divisible by 12.");
} else {
  console.log(number + " is not divisible by 12.");
}


//task8


let prices = [45, 52, 48, 55, 50, 60, 47]; 


let total = 0;
for (let i = 0; i < prices.length; i++) {
  total += prices[i];
}


let averagePrice = total / prices.length;


if (averagePrice > 50) {
  console.log("Tomato has given good profit.");
} else {
  console.log("No profit from tomato.");
}


//task9


function isLeapYear(year) {
  return (year % 4 === 0 && year % 100 !== 0) || (year % 400 === 0);
}

let year = 2024;
let month = 2; 

if (isLeapYear(year)) {
 
  if (month === 2) {
    console.log("The year is leap year and the month is February with 29 days.");
  } else {
    console.log("The year is leap year and the month is not February.");
  }
} else {
  console.log("The given year is not a leap year.");
}


