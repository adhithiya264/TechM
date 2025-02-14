//Create a variable as const, check if its a prime number or not, and display the result accordingly

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
