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
