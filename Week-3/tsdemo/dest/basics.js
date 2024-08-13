"use strict";
//explicitly declared
let isSunny = true; //boolean
let numberOne = 1; //number
let word = "Hello, World!"; //string
let bigNumber; //big int
//let guid: symbol
//implicitly declared
//let car = "toyota";// type inference
let numbers = [1, 2, 3, 4]; //array
let words = ["Hello", "Hey", "Hi"]; //this is using generics!
function add(a, b) {
    return a + b;
}
let func = (c) => { return c; }; //arrow function syntax
//object creation
const house = {
    type: "single-family home",
    bedrooms: 3,
    bathrooms: 2,
    age: 45
};
console.log(house);
console.log(house.type);
let car1 = "Honda";
let car2 = "Ford";
let car3 = "Toyota";
const dog = {
    size: "Large",
    age: 11,
    breed: "Husky",
    color: "black"
};
console.log(dog);
//Tuples
let myTuple;
myTuple = [true, "Purple", 14, false];
console.log(myTuple);
myTuple.push(false);
console.log(myTuple);
let otherTuple = ["Large Pizza", 12.99];
//otherTuple.push(true)
//union types
function checkType(variable) {
    console.log(`the value is  ${variable} `);
}
console.log(checkType(false));
console.log(checkType("true"));
//Enums
//string enum
var dropdown;
(function (dropdown) {
    dropdown["IT"] = "IT Deparment";
    dropdown["HR"] = "Human Resources";
    dropdown["F"] = "Finance";
})(dropdown || (dropdown = {}));
console.log(dropdown.HR);
//numerical enum
var zipCode;
(function (zipCode) {
    zipCode[zipCode["Columbus"] = 100] = "Columbus";
    zipCode[zipCode["NewYork"] = 101] = "NewYork";
    zipCode[zipCode["Miami"] = 200] = "Miami";
    zipCode[zipCode["LosAngeles"] = 201] = "LosAngeles";
})(zipCode || (zipCode = {}));
console.log(zipCode.NewYork);
console.log(zipCode.LosAngeles);
//console.log("Purple Cat");
//console.log(word);
//console.log(add(9, 17));
