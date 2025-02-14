//Get the price of 1 kg tomato from Monday to Sunday, find its average. 
//If the average is greater than Rs.50, then display, tomato has given good profit. If not, display "No profit from tomato".

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
