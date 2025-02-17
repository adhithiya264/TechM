function displayMultiplicationTable(number, limit) {
    for (let i = 1; i <= limit; i++) {
        console.log(`${number} x ${i} = ${number * i}`);
    }
}

let number = 5;
let limit = 10; 

displayMultiplicationTable(number, limit);
