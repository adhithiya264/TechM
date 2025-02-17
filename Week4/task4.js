const chooseOperation = () => {
    const operation = prompt("Enter operation (add, subtract, multiply, divide):").toLowerCase();
    const num1 = parseFloat(prompt("Enter the first number:"));
    const num2 = parseFloat(prompt("Enter the second number:"));

    switch (operation) {
        case 'add':
            console.log(`Sum: ${add(num1, num2)}`);
            break;
        case 'subtract':
            console.log(`Difference: ${subtract(num1, num2)}`);
            break;
        case 'multiply':
            console.log(`Product: ${multiply(num1, num2)}`);
            break;
        case 'divide':
            if (num2 === 0) {
                console.log("Error: Division by zero is not allowed.");
            } else {
                const [quotient, remainder] = divide(num1, num2);
                console.log(`Quotient: ${quotient}, Remainder: ${remainder}`);
            }
            break;
        default:
            console.log("Invalid operation!");
    }
};

const add = (a, b) => a + b;
const subtract = (a, b) => a - b;
const multiply = (a, b) => a * b;
const divide = (a, b) => [Math.floor(a / b), a % b];  


chooseOperation();
