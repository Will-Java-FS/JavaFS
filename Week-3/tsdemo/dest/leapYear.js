"use strict";
function isLeapYear(year) {
    return ((year % 4 === 0) && ((year % 100 !== 0) || year % 400 == 0));
}
console.log(isLeapYear(1997));
console.log(isLeapYear(1900));
console.log(isLeapYear(2000));
console.log(isLeapYear(2024));
