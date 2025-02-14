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
    if (num <= 1) return false; // Numbers less than or equal to 1 are not prime
    for (let i = 2; i <= Math.sqrt(num); i++) {
        if (num % i === 0) return false; // If divisible by any number other than 1 and itself, it's not prime
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



