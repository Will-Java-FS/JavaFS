"use strict";
//Leap Year program
function isLeapYear(year) {
    // A year is a leap year if it is divisible by 4
    // except for years that are divisible by 100, which are not leap years,
    // unless they are divisible by 400, in which case they are leap years.
    return ((year % 4 == 0) && ((year % 100 !== 0) ||
        (year % 400 == 0)));
}
// Example usage:
console.log(isLeapYear(1997));
console.log(isLeapYear(2000));
console.log(isLeapYear(2024));
